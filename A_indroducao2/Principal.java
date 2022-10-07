/*
Faça um programa que receba tres nomes e seus receptivos pesos.
Calcule e mostre a media ponderada dessas notas,
para isso você deverá criar um método com passagem de parâmetros.
 */
package A_indroducao;

import javax.swing.JOptionPane;

public class Principal {
    
    //Vamos crair o método principal
    public static void main(String args[]){
    //A classe média nota é apenas umn módelo para termos acesso ao seu processamento
    //Temos que criar um objeto exemplo:
    //NomeDaClasse nomeObjeto = new NomeDaClasse ();
    
    MediaNota objMediaNota = new MediaNota();
        
        JOptionPane.showMessageDialog(null, 
                "Seja bem vindo ao programa 1!");
        
        //Criar as varíaveis
        double media,n1,n2,n3,p1,p2,p3;
        
        //Para receber os valores utilizamos a classe JoptionPane
        //Também precisamos fazer um casting - coversão
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
        p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota 1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota 2"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3"));
        p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da nota 3"));
        
        //Para acessar as variáveis é preciso utilizar um métodos
        media = objMediaNota.CalculaMedia(n1, p1, n2, p2, n3, p3);
        
        //Vamos mostrar o resultado
        
        System.out.println("Media: "+ media);
    
    }
    
}
