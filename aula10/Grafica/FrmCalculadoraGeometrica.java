package aula10.Grafica;

import java.awt.*;
import javax.swing.*;
import javax.swing.JPanel;

public class FrmCalculadoraGeometrica extends JFrame {
    public FrmCalculadoraGeometrica(){

        setSize(new Dimension(720, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1, 10, 10));
        JPanel pnl = new JPanel();
    }
}
