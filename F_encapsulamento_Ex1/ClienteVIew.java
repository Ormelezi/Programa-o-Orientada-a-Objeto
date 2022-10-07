/*
 Na classe view é onde se da a interação com o usuário.
 */
package F_encapsulamento_Ex1;

import javax.swing.JOptionPane;

public class ClienteVIew {
    
    public static void main(String[] args) {
    
    //Vamos crair os objetos
    ClienteDTO clienteDTO = new ClienteDTO();
    ClienteDAO clienteDAO = new ClienteDAO();
    
    //Vamos atribuir um valor pelo usuário na variavél nome;
    clienteDTO.setNome(JOptionPane.showInputDialog("Digite o nome: "));
    
    //variável idade
    clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
    
    //variável RG
    clienteDTO.setRG(JOptionPane.showInputDialog("Digite seu RG: "));
    
    //mostrar os dados que o usuário recebe
    JOptionPane.showMessageDialog(null, clienteDAO.mostraNomeIdade(clienteDTO));
    JOptionPane.showMessageDialog(null, clienteDAO.mostrarNomeRg(clienteDTO));
            
            
    }        
}
