package Projeto2_1b.JogoMemoria.Grafica;

import java.util.Random;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class FrmJogoMemoria extends JFrame {
    
    int pontos = 100;  
 
    Random RandomNumber = new Random();
    int Aleatorio[] = new int [16];
    int Posicao_do_vetor_Aleatorio[] = new int [16];
    private JPanel Panel = new JPanel();
    private GridLayout Layout_do_Jogo = new GridLayout(4,4);
    private JButton Escolha[] = new JButton[16];
 
    // private JPanel Barra_de_Status = new JPanel();
    private JLabel Pontuacao_do_Jogador = new JLabel("Pontos: 100");
}
