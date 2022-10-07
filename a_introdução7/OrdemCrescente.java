package a_introdução7;

import javax.swing.JOptionPane;

public class OrdemCrescente {

    int num1, num2;

    public void ordenador(int n1, int n2, int escolha) {

        this.num1 = n1;
        this.num2 = n2;

        if (escolha == 1) {
            if (this.num1 > this.num2) {
                JOptionPane.showMessageDialog(null,"Crescente: " + this.num2 + ", " + this.num1);
            } else {
                if (this.num2 > this.num1) {
                    JOptionPane.showMessageDialog(null,"Crescente: " + this.num1 + ", " + this.num2);
                }
            }
        } else if (escolha == 2) {
            if (this.num1 > this.num2) {
                JOptionPane.showMessageDialog(null,"Decrescente: " + this.num2 + ", " + this.num1);
            } else {
                if (this.num2 > this.num1) {
                    JOptionPane.showMessageDialog(null,"Decrescente: " + this.num1 + ", " + this.num2);
                }
            } 
        }
        else {
            JOptionPane.showMessageDialog(null,"Digito Invalido");         
        }
    }
}
