//Información con base en tus datos ¿Eres mayor de edad? (Condicionales 2).

package PseInt;

import java.util.Scanner;

public class Ejemplo07_InformacionPersonal_ {

    public static void main(String[] args) {

        String nombre,apellido;
        int edad;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite su Nombre");
        
        nombre = scanner.next();
        
        System.out.println("Digite su Apellido");
        
        apellido = scanner.next();
        
        System.out.println("Digite su Edad");

        edad = scanner.nextInt();
        
        System.out.println("Nombre: "+nombre);
        
        System.out.println("Apellido: "+apellido);
        
        System.out.println("Edad: "+edad);
        
        if(edad>=18){
            
            System.out.println("Es mayor de edad: Si");
            
        }
        
        else if (edad<18){
            
            System.out.println("Es mayor de edad: No");
        }
        
    }
    
}
