package aula10.Grafica;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

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
    }
    public ActionCalcularArea(JTextField txtBase, JTextField txtAltura, OpcaoForma opcaoForma, JTextField txtArea){
        this.txtBase = txtBase;
        this.txtAltura = txtAltura;    
    }

}
