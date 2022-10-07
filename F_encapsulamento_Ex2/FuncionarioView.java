package F_encapsulamento_Ex2;

import javax.swing.JOptionPane;

public class FuncionarioView {

    public static void main(String[] args) {

        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();

        try {
            funcionarioDTO.setNome(JOptionPane.showInputDialog("Digite seu nome "));
            funcionarioDTO.setCidade(JOptionPane.showInputDialog("Digite sua cidade "));
            funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Digite seu Telefone "));
            funcionarioDTO.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite seu Salário")));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

}
