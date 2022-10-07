
package A_indroducao;


public class MediaNota {
    //Vamos crair as varíaves de classe/atributos
    //Varíaves Globais
    double n1,n2,n3,p1,p2,p3,media;
    
    //Criando método para calcular
    public double CalculaMedia(double n1,double p1,double n2, double p2,double n3,double p3){
        this.n1 = n1;
        this.n2 = n2;
        this.p1 = p1;
        this.p2 = p2;
        this.n3 = n3;
        this.p3 = p3;
        
        //agora criaremos a fórmula para calcular
        this.media = (n1*p1+n2*p2+n3*p3)/10;
        
        
        //Retornaremos o valor armazenado na varíavel global 'média'.       
        return this.media;
    }
    
}
