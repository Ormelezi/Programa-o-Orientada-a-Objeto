/*
Você está fazendo um trabalho de classificação de solo.
Após receber uma amostra e verificar a pontuação referente a presença de água no solo,
o programa deverá classificar da seguinte forma:

- Rochosa: se for menor ou igual a 10 pontos.
- Firme; se for maior que 10 pontos e menor ou igual a 40 pontos.
- Pantanosa: se maior que 40 pontos ou igual a 80 pontos.
- Caso seja maior que 80 pontos, escrever a mensagem: "Quantidade de água inválida"

 */
package A_introdução5;


public class Solo {

//Vamos criar uma varável para receber a pontuação da água
private double pontoAgua;    
private String situacao;

//Vamos criar uma String que informe a situação do solo
    


    public String situacaoSolo(double pontoAgua){

        //vamos criar o desvio condicional para verificar o estado do solo
        this.pontoAgua = pontoAgua;
        
        if(this.pontoAgua<=10){
            situacao="O solo é rochoso";
        }
        else if (this.pontoAgua>10 && this.pontoAgua<=40){
            situacao="O solo é Firme";
        }
        else if (this.pontoAgua>40 && this.pontoAgua<=80){
            situacao="O solo é Pantanoso";       
        }
        else 
            situacao= "Quantidade de aguá inválida";
        
        
        return this.situacao;
    }

}