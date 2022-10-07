/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package F_encapsulamento_Ex1;


public class ClienteDAO {
    
    //Vamos mostrar os valores que foram atribuidos
    public String mostrarNomeRg(ClienteDTO clienteDTO){
        
        return "O nome é: "+clienteDTO.getNome()+" e o RG: "+clienteDTO.getRG()+".";
    }
    
    //Vamos criar um metodo apra mostrar nome e idade
    public String mostraNomeIdade(ClienteDTO clienteDTO){
        return "O nome é: "+clienteDTO.getNome()+" e a idade é: "+clienteDTO.getIdade()+".";
        
    }
    
}
