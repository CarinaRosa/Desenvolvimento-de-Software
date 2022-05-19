package aula11.CalcSimples.Grafica;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ActionCalcular extends AbstractAction {
    private JTextField txtX, txtY;
    private JComboBox<String> cbxOperacao;

    public ActionCalcular(JTextField txtX, JTextField txtY, JComboBox<String> cbxOperacao){
        this.txtX = txtX;
        this.txtY = txtY;
        this.cbxOperacao = cbxOperacao;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
