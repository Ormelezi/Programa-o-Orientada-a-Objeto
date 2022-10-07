package A_introduçao8;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        DivMulti divMulti = new DivMulti();

        int escolha;

        escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite \n1-Divisão \n2-Multiplicação"));

        if (escolha == 1) {

            JOptionPane.showMessageDialog(null, "O Resultado é " + divMulti.Div(0, 0));

        } else if (escolha == 2) {

            JOptionPane.showMessageDialog(null, "O Resultado é " + divMulti.Mult(0, 0));
        } else {
            JOptionPane.showMessageDialog(null, "Escolha invalida ");
        }

    }

}
