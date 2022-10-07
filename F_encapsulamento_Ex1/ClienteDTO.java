/*
 * NA CLASSE DTO COLOCAMOS TODAS AS VARIAVEIS E ELAS ESTARÃO PROTEGIDAS
 * NÃO HÁ ACESSO DIRETO PARA AS VARÍAVEIS 
 * PRECISAMOS USAR OS MÉTODOS GETTERS E SETTERS
 */
package F_encapsulamento_Ex1;

public class ClienteDTO {
    //VAMOS CRIAR AS VARIAVEIS

    private String nome, rg;
    private int idade;

    //VAMOS CRAIR SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRG(String rg) {
        this.rg = rg;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //VAMOS CRAIR GETTERS
    public String getNome() {
        return this.nome;
    }

    public String getRG() {
        return this.rg;
    }

    public int getIdade() {
        return this.idade;
    }
}
