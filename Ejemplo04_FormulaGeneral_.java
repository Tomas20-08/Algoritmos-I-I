//Calcualr formula general.

package PseInt;

import java.util.Scanner;

public class Ejemplo04_FormulaGeneral_ {

    public static void main(String[] args) {

        int a,b,c,d,e;
        
        double f,x1,x2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite el valor de a");
        
        a = scanner.nextInt();
        
        System.out.println("Digite el valor de b");
        
        b = scanner.nextInt();
        
        System.out.println("Digite el valor de c");
        
        c = scanner.nextInt();
        
        d = (b)*(-1);
        
        e = (b)*(b)-(4*a*c);
        
        f = (double) Math.pow(e, 0.5);
        
        x1 = (double) ((d+f)/(2*a));
        
        x2 = (double) ((d-f)/(2*a));
        
        System.out.println("El resultado uno es..."+x1);
        
        System.out.println("El resultado dos es..."+x2);
     
    }
    
}
