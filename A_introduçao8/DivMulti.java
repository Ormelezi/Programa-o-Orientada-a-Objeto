package A_introduçao8;

import javax.swing.JOptionPane;

public class DivMulti {

    double num1, num2, resultado;

    public double Div(double n1, double n2) {

        this.num1 = n1;
        this.num2 = n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));

        resultado = n1 / n2;

        return this.resultado;

    }

    public double Mult(double n1, double n2) {

        this.num1 = n1;
        this.num2 = n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));

        resultado = n1 * n2;

        return this.resultado;

    }
    
}
