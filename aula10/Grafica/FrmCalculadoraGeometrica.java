package aula10.Grafica;

import java.awt.*;
import javax.swing.*;

public class FrmCalculadoraGeometrica extends JFrame {

    private JTextField txtCircunferenciaRaio;
    private JTextField txtCircunferenciaArea;
    private JTextField txtRetanguloBase;
    private JTextField txtRetanguloAltura;
    private JTextField txtRetanguloArea;
    private JTextField txtTrianguloBase;
    private JTextField txtTrianguloAltura;
    private JTextField txtTrianguloArea;
    private JButton btnCircunferenciaCalcularArea;
    private JButton btnRetanguloCalcularArea;
    private JButton btnTrianguloCalcularArea;

    public FrmCalculadoraGeometrica(){

        setSize(new Dimension(720, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));


        JPanel pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Circulo"));
        add(pnl);

        pnl.setLayout(new GridLayout(1, 5, 10, 50));

        pnl.add(new JLabel("Raio:"));
        txtCircunferenciaRaio = new JTextField();
        pnl.add(txtCircunferenciaRaio);
        pnl.add(btnCircunferenciaCalcularArea = new JButton("Calcular"));
        pnl.add(new JLabel("Area:"));
        txtCircunferenciaArea = new JTextField();
        pnl.add(txtCircunferenciaArea);

               
        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Retangulo"));
        add(pnl);

        pnl.setLayout(new GridLayout(1, 7, 10, 50));

        pnl.add(new JLabel("Base:"));
        txtRetanguloBase = new JTextField();
        pnl.add(txtRetanguloBase);
        pnl.add(new JLabel("Altura:"));
        txtRetanguloAltura = new JTextField();
        pnl.add(txtRetanguloAltura);
        pnl.add(btnRetanguloCalcularArea = new JButton("Calcular"));
        pnl.add(new JLabel("Area:"));
        txtRetanguloArea = new JTextField();
        pnl.add(txtRetanguloArea);

        pnl = new JPanel();
        pnl.setBorder(BorderFactory.createTitledBorder("Triangulo"));
        add(pnl);

        pnl.setLayout(new GridLayout(1, 7, 10, 50));

        pnl.add(new JLabel("Base:"));
        txtTrianguloBase = new JTextField();
        pnl.add(txtTrianguloBase);
        pnl.add(new JLabel("Altura:"));
        txtTrianguloAltura = new JTextField();
        pnl.add(txtTrianguloAltura);
        pnl.add(btnTrianguloCalcularArea = new JButton("Calcular"));
        pnl.add(new JLabel("Area:"));
        txtTrianguloArea = new JTextField();
        pnl.add(txtTrianguloArea);
    }
}
