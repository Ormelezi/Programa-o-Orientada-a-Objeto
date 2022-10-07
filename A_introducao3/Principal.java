/*
 Vamos criar uma classe para receber o valor do salário atual de um funcíonario
e aplicar um aumento de x% (digitado pelo usuário)
 */
package A_introducao2;

import javax.swing.JOptionPane;


public class Principal {
    //Criar metódo principal (main)
    public static void main(String[] args) {
        //Vamos criar um novo objeto
        SalarioNovo objSalarioNovo = new SalarioNovo();
        
        JOptionPane.showMessageDialog(null, 
                "O novo salário é "+ 
                        objSalarioNovo.calculaSalario(
                        Double.parseDouble(
                                JOptionPane.showInputDialog("Digite o salário ")),
                        Double.parseDouble(
                                JOptionPane.showInputDialog("Digite a porcentagem: "))));
        
            
    }
    
    
}
