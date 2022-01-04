
package adivinarnum;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int ran =0;
        int adivinar;
        int intentos = 5;
        
        ran = r.nextInt(99)+1;
        System.out.println("Se genero un numero random del 1 al 100\n");
        for (int i = 0; i < 5; i++) {
            System.out.println(ran);
            System.out.println("Intenta adivinarlo, tienes " + intentos + " intentos");
            System.out.print("Ingrese numero: ");
            adivinar = s.nextInt();
                    
            if (adivinar == ran) {
                System.out.println("\nFelicidades acertaste al numero\n");
                i = 5;
            }else {
                intentos = intentos - 1;
                System.out.println("\nEl numero es erroneo, te quedan " + intentos  + " intentos\n");
                
            }
        }
        System.out.println("\nEl numero era " + ran +"");
        
    }
    
}
