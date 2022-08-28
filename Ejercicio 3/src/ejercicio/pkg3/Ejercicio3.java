
package ejercicio.pkg3;
// Librerias
import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pc = 2;
        float npc = 15.58f;
        float tpc = pc*npc;
        int hp = 3;
        float nhp = 7.5f;
        float thp = hp*nhp;
        int dm = 1;
        float ndm = 150f;
        float tdm= dm*ndm;
        int cd = 1;
        float ncd = 10f;
        float tcd = cd*ncd;
        float tot = tpc+thp+tdm+tcd;
        System.out.println("La compra es por un total de $"+tot);
        float pog = tot/20;
        float pag = Math.round(pog);
        System.out.println("Ha pagado con "+ pag+ " billetes de $20");
        float peg = 20*pag;
        System.out.println("Total pagado = $"+peg);
        float cambio = peg-tot;
        double ex = Math.round(cambio*100.0)/100.0;
        System.out.println("Cambio = $"+ex);
        
        
        
        
        
        
        
        
    }
    
}
