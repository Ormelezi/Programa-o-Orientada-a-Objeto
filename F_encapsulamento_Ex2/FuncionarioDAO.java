/*
 Vamos criar um método para mostrar os dados
 */
package F_encapsulamento_Ex2;

public class FuncionarioDAO {

    public String mostrarDados(FuncionarioDTO funcionarioDTO) {
        
        try{
        return "Os dados do funcionario são " + "\nNome " + funcionarioDTO.getNome() + "\nCIdade " + funcionarioDTO.getCidade()
                + "\nTelefone " + funcionarioDTO.getTelefone() + "\nSalário " +funcionarioDTO.getSalario();
        }
        catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

}
