/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_introdução7;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args) {
        
        OrdemCrescente OrdemCrescente = new OrdemCrescente();
        
        int num1, num2, escolha;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
        escolha=Integer.parseInt(JOptionPane.showInputDialog("Digite \n1-Crescente \n2-Decrescente"));
        
        OrdemCrescente.ordenador(num1,num2,escolha);
        
    }
    
}
