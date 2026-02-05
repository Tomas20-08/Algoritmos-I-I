//¿Qué número es mayor? #2 (Condicionales 4).

package PseInt;

import java.util.Scanner;

public class Ejemplo09_NumeroMayorMedioMenor_ {

    public static void main(String[] args) {
        
        double n1,n2,n3,may=0,med=0,men=0;
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Digite tres numeros diferentes");
        
        System.out.println("Digite No1");
        
        n1 = scanner.nextDouble();

        System.out.println("Digite No2");
        
        n2 = scanner.nextDouble();
        
        System.out.println("Digite No3");
        
        n3 = scanner.nextDouble();
        
//No1 es el mayor
        
if(n1>n2){
        if(n1>n3){
            may = n1;  
                if(n2>n3){
                    med=n2;
                    men=n3;
                         }else{
                            med=n3;    
                            men=n2;    
                                
                                
                                
                                
                                }    
                    
                  }
      
         }   

//No2 es el mayor

if(n2>n3){
        if(n2>n1){
            may = n2;
                if(n1>n3){
                    med=n1;
                    men=n3;
                         }else{
                        med=n3;  
                        men=n1;    

                               }
                    
                 }            
     
         }    
            
//No3 es el mayor

if(n3>n2){
        if(n3>n1){
            may = n3;
                if(n1>n2){
                   med=n1;
                   men=n2;        
                        }else{
                       med=n2;
                       men=n1;        
                
                              }
            
                 }   
            
         }

        System.out.println("El numero mayor es..."+may);
        System.out.println("El numero medio es..."+med);
        System.out.println("El numero menor es..."+men);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
