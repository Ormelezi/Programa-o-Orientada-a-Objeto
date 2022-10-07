
package E_Excecao_Ex1;

import javax.swing.JOptionPane;


public class Principal {
    
    public static void main(String[] args) {
        double numero, valor;
        
        Divisao divisao = new Divisao();
        
        try{
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número a ser dividido:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o divisor;"));
        divisao.calculaDivisao(valor, numero);
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    
}
