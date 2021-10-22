
package caneta;

/**
 *
 * @author daniel
 */
public class Area {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Faber Castell";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = true;
        c1.status();
        c1.destampar();
        c1.rabiscar();
        
        System.out.println("-----------------------");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preto";
        c2.ponta = 0.7f;
        c2.tampada = true;
        c2.status();
        c2.rabiscar();
        
    }
    
}
