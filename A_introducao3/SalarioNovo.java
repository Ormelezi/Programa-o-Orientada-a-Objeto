 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_introducao2;


public class SalarioNovo {
    //Criar as varíaveis de classe/global
    double salario, novoSalario,porcentagemAumento;
    
    //Vamos criar um método para calcular o novo salario a partir da porcentagem informada.
    public double calculaSalario(double salario,double porcentagemAumento) {
    
        //Vamos fazer a atribuição por passagem de parâmetros
        this.salario = salario;
        this.porcentagemAumento = porcentagemAumento;
        
        //Processamento
        this.novoSalario=this.salario + this.salario * porcentagemAumento/100;
        
        return this.novoSalario;
    }
    
}
