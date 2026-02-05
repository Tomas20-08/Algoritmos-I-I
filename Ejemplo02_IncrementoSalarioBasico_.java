//Calcular incremento salario basico.

package PseInt;

import java.util.Scanner;

public class Ejemplo02_IncrementoSalarioBasico_ {

    public static void main(String[] args) {

        int sb;
        double isb;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite su salario basico");
        
        sb = scanner.nextInt();
        
        isb = (sb*1.25);
        
    System.out.println("El nuevo salario basico luego del incremento es..."+ isb);
        
    }
    
}
