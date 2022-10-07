package E_Excecao_Ex1;

public class Divisao {

    private double numero, resultado;

    public void calculaDivisao(double valor, double numero) {

        this.numero = numero;
        


        //Try inicia o espaço de tratamento
        try {

            //Vamos Dividir por zero
 
            this.resultado = this.numero / valor;
            System.out.println("O resultado da divisão é: " + this.resultado);

        } catch (Exception e) {
            System.out.println("Erro!"+e.getMessage());
        }

    }

}
