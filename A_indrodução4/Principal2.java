package A_indrodução4;

import javax.swing.JOptionPane;


public class Principal2 {
    
    public static void main(String[] args) {
        //Vamos criar um objeto
        CalculaMedia2 calculaMedia2 = new CalculaMedia2();
        
        //Vamos chamar o método que inicia o processamento todo
        JOptionPane.showMessageDialog(null,calculaMedia2.calcula(
         Double.parseDouble(JOptionPane.showInputDialog("Digite nota 1")),
         Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"))));
        
    }
    
}
