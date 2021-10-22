
package caneta;

/**
 *
 * @author daniel
 */
public class Caneta {
   String modelo;
   String cor;
   float ponta;
   int carga;
   boolean tampada;
   
   void status(){
        System.out.println("Modelo " + this.modelo + "\n" 
                + "Cor: " + this.cor + "\n" 
                + "Ponta: " + this.ponta + "\n" 
                + "Carga: " + this.carga + "\n" 
                + "Tampada? " 
                 + this.tampada);
    }
    
   void rabiscar(){
        if(this.tampada == false){
            System.out.println("Estou rabiscando");
        } else {
            System.out.println("ERRO! Caneta Tampada");
        }
    }
    
   void tampar(){
        this.tampada = true;
        System.out.println("A caneta foi tampada");
    }
    
   void destampar(){
        this.tampada = false;
        System.out.println("A caneta foi destampada");
    }
    
}
