//¿Que número es mayor? (Consicionales).

package PseInt;

import java.util.Scanner;

public class Ejemplo06_NumeroMayorMenor_ {

    public static void main(String[] args) {
        
        int n1,n2;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite dos numeros diferentes");
        
        
        System.out.println("Digite No1");
        
        n1 = scanner.nextInt();
        
        System.out.println("Digite No2");

        n2 = scanner.nextInt();
        
        if (n1>n2){
            System.out.println("El numero mayor es..."+ n1);
            System.out.println("El numero menor es..."+ n2);
                  } 
        
        else if (n2>n1){
             System.out.println("El numero mayor es..."+ n2);
             System.out.println("El numero menor es..."+ n1);
                       }
            
    }
    
}
