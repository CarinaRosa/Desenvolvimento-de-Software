package Projeto2_1b.JogoMemoria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.border.TitledBorder;

/*
 Este é um programa da Memória com 16 casas distribuídos em 4 linhas por 4 colunas, no qual
 o jogador deverá achar os números iguais. Ao desvirar duas peças aparecerá uma caixa de
 diálogo informando se os números coincidem ou não.
 A cada acerto o jogador ganhará 10 pontos e a cada erro perderá 2 pontos.
*/

public class JogoDaMemoria extends JFrame{
 
    int pontos = 100;  
 
    Random RandomNumber = new Random();
    int Aleatorio[] = new int [16];
    int Posicao_do_vetor_Aleatorio[] = new int [16];
 
    // Barra de Ferramenta
    // private JToolBar Barra_Ferramenta = new JToolBar();
    // private JButton Button_Novo_Jogo = new JButton("Novo Jogo");
    // private JButton Button_Re_Iniciar_Jogo = new JButton("Reiniciar partida");
    // private JButton Button_Estatisticas = new JButton("Estatísticas");
    // private JButton Sobre_JogoDaMemoria = new JButton("Sobre");
 
    private JPanel Panel = new JPanel();
    private GridLayout Layout_do_Jogo = new GridLayout(4,4);
    // private Font Fonte = new Font("Lucida Console", Font.BOLD, 36);
    private JButton Escolha[] = new JButton[16];
 
    // private JPanel Barra_de_Status = new JPanel();
    private JLabel Pontuacao_do_Jogador = new JLabel("Pontos: 100");
 
    public JogoDaMemoria() {
        super("Jogo da Memória");
     
        // Barra_Ferramenta.add(Button_Novo_Jogo);
        // Barra_Ferramenta.add(Button_Re_Iniciar_Jogo);
        // Barra_Ferramenta.add(Button_Estatisticas);
        // Barra_Ferramenta.add(Sobre_JogoDaMemoria);
        // add(Barra_Ferramenta, BorderLayout.NORTH);
     
        for (int i=0; i<16; ++i){
            Escolha[i] = new JButton();
            Panel.add(Escolha[i]);
            Escolha[i].setFont(Fonte);
            Escolha[i].setVisible(true);
        }
     
        Panel.setLayout(Layout_do_Jogo);
        add(Panel, BorderLayout.CENTER);
     
        Barra_de_Status.add(Pontuacao_do_Jogador);
        add(Barra_de_Status, BorderLayout.SOUTH);
     
     
        Eventos_JogoDaMemoria Handler = new Eventos_JogoDaMemoria();
        for (int i=0; i<16; ++i){
            Escolha[i].addActionListener(Handler);
        }
        Button_Novo_Jogo.addActionListener(Handler);
        Button_Re_Iniciar_Jogo.addActionListener(Handler);
        Button_Estatisticas.addActionListener(Handler);
        Sobre_JogoDaMemoria.addActionListener(Handler);

     
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);    
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
 
    private class Eventos_JogoDaMemoria implements ActionListener{
     
        int Cont_Acertos,Primeiro_Click,Segundo_Click;
        int Numero_Click, posi, cont, pontos_Anterior, Maior_Pontuacao_do_Jogador;
        int Partidas_jogadas = 0, Numero_de_Vitorias = 0;
        boolean Novo_Jogo = true;
        boolean Re_Iniciar = false;
        boolean Fim_de_Jogo = false;                      
     
     
        public void actionPerformed(ActionEvent event){                      

         
            if (event.getSource() == Sobre_JogoDaMemoria){
                new Sobre_Sobre_JogoDaMemoria((int)getLocation().getX(), (int)getLocation().getY(),
                        JogoDaMemoria.this, true).setVisible(true);
            }
         
            if (event.getSource() == Button_Novo_Jogo){
                Novo_Jogo = true;
                Re_Iniciar = false;
            }
         
            if (event.getSource() == Button_Re_Iniciar_Jogo){
                Novo_Jogo = true;
                Re_Iniciar = true;
            }
         
            if (event.getSource() == Button_Estatisticas){
                Fim_de_Jogo = true;
            }
         
            if (Novo_Jogo == true){
             
                Cont_Acertos = 0;
                Partidas_jogadas++;
                pontos_Anterior = pontos;
                pontos = 100;
                Numero_Click = 0;
                posi = 0; cont = 16;
                Primeiro_Click = 0;
                Segundo_Click = 0;
             
                for (int i=0; i<16; ++i){
                    Escolha[i].setText("");
                    Escolha[i].setEnabled(true);
                }
             
                if (Re_Iniciar == false){
                 
                    for (int i=0; i<16; ++i){
                        Posicao_do_vetor_Aleatorio[i] = i;
                    }
     
                    for (int i=0; i<8; ++i){
                        for (int j=0; j<2; ++j){
                            posi = RandomNumber.nextInt(cont);
                            Aleatorio[Posicao_do_vetor_Aleatorio[posi]] = i;
                     
                            if (posi < cont){
                                for (int q=(posi+1); q<(cont); ++q){
                                    Posicao_do_vetor_Aleatorio[q-1] = Posicao_do_vetor_Aleatorio[q];
                                }
                            } cont--;
                        }
                    }
                }
                Novo_Jogo = false;
            }
         
         
         
         
            for (int i=0; i<16; ++i){
             
                if (event.getSource() == Escolha[i]){
                                   
                    Escolha[i].setText(String.valueOf(Aleatorio[i]));
                    Escolha[i].setEnabled(false);
                    Escolha[i].setVisible(true);
                    Numero_Click++;
                 
                    if (Numero_Click == 1) Primeiro_Click = i;
                        if (Numero_Click == 2){
                            Segundo_Click = i;
                            if (Aleatorio[Primeiro_Click] != Aleatorio[Segundo_Click]){                                                      
                                pontos-=2;
                                JOptionPane.showMessageDialog(JogoDaMemoria.this, "Errado");
                                Escolha[Primeiro_Click].setText("");
                                Escolha[Segundo_Click].setText("");
                                Escolha[Primeiro_Click].setEnabled(true);
                                Escolha[Segundo_Click].setEnabled(true);                            
                         
                            }  else {
                                Cont_Acertos++;
                                pontos+=10;
                        }
                        Numero_Click = 0;
                    }
                }
            }
         
         
            if (Cont_Acertos == 8){
                Numero_de_Vitorias++;
                Cont_Acertos = 0;
                if (pontos > pontos_Anterior) Maior_Pontuacao_do_Jogador = pontos;
                    Fim_de_Jogo = true;
            }
         
         
            if (pontos < 0) pontos = 0;
            Pontuacao_do_Jogador.setText("Pontos: " + pontos);
         
         
            if (Fim_de_Jogo == true){
                Estatisticas_Jogo(Partidas_jogadas, Numero_de_Vitorias, Maior_Pontuacao_do_Jogador);
                Fim_de_Jogo = false;
            }          
        }
    }
 
 
    void Estatisticas_Jogo(int Partidas_jogadas, int Numero_de_Vitorias, int Maior_Pontuacao_do_Jogador){
     
        JOptionPane.showMessageDialog(JogoDaMemoria.this, "Partidas jogadas: " + Partidas_jogadas +
                        "\nVitórias: " + Numero_de_Vitorias +
                        "\nMaior Pontuação do Jogador: " + Maior_Pontuacao_do_Jogador);
    }
 
 
 
    //Sobre o Jogo da Memória
    // class Sobre_Sobre_JogoDaMemoria extends JDialog{
 
    //     private Font Fonte = new Font("Tahoma", Font.PLAIN, 12);
 
    //     private JPanel Geral = new JPanel();

 
    //     private JPanel Informacoes_do_Autor = new JPanel();
    //         private GridLayout Layout1 = new GridLayout(4,1);
    //         private JLabel Nome_do_Autor = new JLabel("João Matheus Santos Assis");
    //         private JLabel Cidade_do_Autor = new JLabel("Valença/Bahia");
    //         private JLabel Site_do_Codigo = new JLabel("Site do Jogo da Memória:");
    //         private JLabel Endereco_do_Jogo_da_Memoria = new JLabel("http://programjm.blogspot.com.br/");

    //     private JPanel Informacoes_Tecnicas = new JPanel();
    //         private GridLayout Layout2 = new GridLayout(4,1);
    //         private JLabel Sistema_Operacional = new JLabel("Windows 7");
    //         private JLabel Plataforma = new JLabel("NetBeans 5.5.1");
    //         private JLabel Ultima_Atualizacao = new JLabel("Data de Criação:");
    //         private JLabel Data = new JLabel("8 de setembro de 2012");
         
    //     private JButton Fechar_Sobre_JogoDaMemoria = new JButton("Fechar");
 
    //     private int X;
    //     private int Y;

    //         public Sobre_Sobre_JogoDaMemoria(int X, int Y, Frame parent, boolean modal) {
    //             super(parent, modal);
     
    //             this.X = X;
    //             this.Y = Y;
         
    //             // Adicionando os elementos ao Dialog      
    //             Nome_do_Autor.setFont(Fonte);
    //             Cidade_do_Autor.setFont(Fonte);
    //             Site_do_Codigo.setFont(Fonte);
    //             Endereco_do_Jogo_da_Memoria.setFont(Fonte);
     
    //             Sistema_Operacional.setFont(Fonte);
    //             Plataforma.setFont(Fonte);
    //             Ultima_Atualizacao.setFont(Fonte);
    //             Data.setFont(Fonte);
     
     
    //             Informacoes_do_Autor.setLayout(Layout1);
    //             Informacoes_Tecnicas.setLayout(Layout2);
     
     
    //             Informacoes_do_Autor.add(Nome_do_Autor);
    //             Informacoes_do_Autor.add(Cidade_do_Autor);
    //             Informacoes_do_Autor.add(Site_do_Codigo);
    //             Informacoes_do_Autor.add(Endereco_do_Jogo_da_Memoria);
     
     
    //             Informacoes_do_Autor.setPreferredSize(new Dimension (230,140));
    //             Informacoes_do_Autor.setBackground(Color.WHITE);
    //             Informacoes_do_Autor.setBorder(BorderFactory.createTitledBorder(null, "Programador",
    //                 TitledBorder.DEFAULT_JUSTIFICATION,
    //                 TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 1, 14)));
     
    //             Informacoes_Tecnicas.add(Sistema_Operacional);
    //             Informacoes_Tecnicas.add(Plataforma);
    //             Informacoes_Tecnicas.add(Ultima_Atualizacao);
    //             Informacoes_Tecnicas.add(Data);
     
    //             Informacoes_Tecnicas.setPreferredSize(new Dimension (200,140));
    //             Informacoes_Tecnicas.setBackground(Color.WHITE);
    //             Informacoes_Tecnicas.setBorder(BorderFactory.createTitledBorder(null, "Sistema",
    //                 TitledBorder.DEFAULT_JUSTIFICATION,
    //                 TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 1, 14)));
     
    //             Geral.add(Informacoes_do_Autor);
    //             Geral.add(Informacoes_Tecnicas);
    //             Geral.add(Fechar_Sobre_JogoDaMemoria);
     
    //             Geral.setFont(Fonte);
    //             add(Geral);
     
    //             getRootPane().setDefaultButton(Fechar_Sobre_JogoDaMemoria);
    //             Fechar_Sobre_JogoDaMemoria.setSelected(true);
    //             Geral.setBackground(Color.WHITE);
     
     
    //             this.setTitle("Sobre o Jogo da Memória");
    //             this.setSize(500,210);
    //             this.setResizable(false);
    //             this.setLocation(X+20,Y+40);
             
    //             Fechar_Sobre_JogoDaMemoria.addActionListener(new ActionListener(){
                 
    //                 public void actionPerformed(ActionEvent event){
                     
    //                     setVisible(false);
    //                     dispose();
                     
    //                 }
    //             });
    //     }  
    }


    public static void main(String [] args){
     
        new JogoDaMemoria();
     
    }  
}