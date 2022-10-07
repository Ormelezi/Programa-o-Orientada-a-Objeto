
package A_introdução5;

import javax.swing.JOptionPane;


public class Principal {
    
    public static void main(String[] args) {
        
        Solo objsolo = new Solo();
        
        JOptionPane.showMessageDialog(null, objsolo.situacaoSolo(Double.parseDouble(JOptionPane.showInputDialog("Digite a pontuação da agua"))));
        
    }
    
}
