package aula10.Grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

import aula10.Logica.Circulo;
import aula10.Logica.Retangulo;
import aula10.Logica.Triangulo;

public class ActionCalcularArea extends AbstractAction{
    public enum OpcaoForma{
        CIRCULO,
        RETANGULO,
        TRIANGULO
    }

    private JTextField txtRaio;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtArea;
    private OpcaoForma opcaoForma;

    public ActionCalcularArea(JTextField txtRaio, OpcaoForma opcaoForma, JTextField txtArea){
        this.txtRaio = txtRaio;
        this.opcaoForma = opcaoForma;
        this.txtArea = txtArea;
    }
    public ActionCalcularArea(JTextField txtBase, JTextField txtAltura, OpcaoForma opcaoForma, JTextField txtArea){
        this.txtBase = txtBase;
        this.txtAltura = txtAltura;
        this.opcaoForma = opcaoForma;
        this.txtArea = txtArea;    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (this.opcaoForma) {
            case CIRCULO:
                double raio = Double.parseDouble(txtRaio.getText());
                Circulo circulo = new Circulo(raio);
                double area = circulo.calcularArea();
                txtArea.setText(String.format("%f", area));
                break;
                
            case RETANGULO:
                double baseRetangulo = Double.parseDouble(txtBase.getText());
                double alturaRetangulo = Double.parseDouble(txtAltura.getText());
                Retangulo retangulo = new Retangulo(baseRetangulo, alturaRetangulo);                
                double areaRetangulo = retangulo.calcularArea();
                txtArea.setText(String.format("%f", areaRetangulo));
                break;

            case TRIANGULO:
                double base = Double.parseDouble(txtBase.getText());
                double altura = Double.parseDouble(txtAltura.getText());
                Triangulo triangulo = new Triangulo(base, altura);                
                double areaTriangulo = triangulo.calcularArea();
                txtArea.setText(String.format("%f", areaTriangulo));
                break;
            
        }
        
    }

}
