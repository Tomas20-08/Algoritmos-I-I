//Promedio de tres materias.

package PseInt;

import java.util.Scanner;

public class Ejemplo05_PromedioMaterias_ {

    public static void main(String[] args){
    
    double n1,n2,n3,Nota1,Nota2,Nota3,prom;
        
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Nota Asignatura No1");
        
        n1 = scanner.nextDouble();
        
        System.out.println("Nota Asignatura No2");
        
        n2 = scanner.nextDouble();
        
        System.out.println("Nota Asigantura No3");
        
        n3 = scanner.nextDouble();
        
        Nota1 = (n1*0.2);
        
        Nota2 = (n2*0.5);
        
        Nota3 = (n3*0.3);
        
        prom = (Nota1+Nota2+Nota3);
        
        System.out.println("El promedio es..."+prom);
     
    }
    
}
