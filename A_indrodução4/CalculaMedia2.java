/*
Vamos reeditar com alguns novos métodos 
o codigo para calcular a média aritimética de duas notas.
 */
package A_indrodução4;

import java.text.DecimalFormat;

/*
Declaração de classe CalculaMedia2
 */
public class CalculaMedia2 {
//Vamos criar uma mascara para mostrar os valores de nota recebidos    
    DecimalFormat decimalFormat = new DecimalFormat("00.00");

    //declarar as variavéis
    private double n1,n2,media;
    private String resposta;

    //vamos crair o método para calcular a média
    public void calcMedia(){
    
    //formula para calcular a media
        this.media = (this.n1+this.n2)/2; 
    }
    
    //Em seguida vamos criar um método para ver se o aluno está aprovado ou reprovado
    public void situacao(){
        //Vamos criar um desivio condicional para verificar a situação do aluno
        if(this.media>6){
            resposta = "Aprovado";   
        }
        else{
            if(this.media>=4 && this.media<6){
            resposta = "IFA";    
            }
            else{
            resposta = "Reprovado";
            }
        }
            
    }//Fim método situacao   
    
    //Vamos criar um metodo de processamento das infomações
    
    public String calcula(double n1, double n2){
    
        //vamos atribuir os valores de n1 e n2    
        this.n1 = n1;
        this.n2 = n2;
        
        //agora vamos chamar o método para calcular
        calcMedia();
        
        //agora chamamos o metodo para verificar a situação
        situacao();
        
        //retorno de 1 valor String
        return "A nota do aluno é: "+decimalFormat.format(this.media)+". \nE sua situação é: "+this.resposta+".";
    }
}
