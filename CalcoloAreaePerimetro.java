package CalcoloAreaePerimetro;

import java.util.Scanner;

/**
 *
 * @author mannone.mario
 */
public class CalcoloAreaePerimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b, h, area, perimetro;
        Scanner tastiera=new Scanner(System.in);
        
        System.out.println("Inserisci la base: ");
        b=tastiera.nextInt();
        System.out.println("Inserisci l'altezza: ");
        h=tastiera.nextInt();
        
        System.out.println("Area: "+ calcolo(b, h, 'a'));
        System.out.println("Perimetro: "+calcolo(b, h, 'p'));
    }
    
    public static int calcolo(int b, int h, char c){
        switch(c){
            case 'p':return (b+h)*2;
            case 'a': return b*h;
            default:return 0;
            
        }
    }  
}
