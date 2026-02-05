//Calcular la suma y el promedio de 2 números.

package PseInt;

import java.util.Scanner;

public class Ejemplo01_SumaPromedio_ {

    public static void main(String[] args) {
 
        //n1,n2 y sum se declaran como variables enteras (int)
        
        int n1,n2;
        
        //"Scanner scanner = new Scanner(System.in);" se utiliza para asignar las variables 
        //"(Nombre de la variable) = scanner.(Tipo de variable)();" de esta forma se asigna una variable
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite No1");
        
        n1 = scanner.nextInt();
        
        System.out.println("Digite No2");
        
        n2 = scanner.nextInt();
        
        //prom se declara con variable decimal (double)
        
        double prom,sum;
        
        sum = (n1+n2);
        
        prom = (sum/2);
        
        System.out.println("El resultado de la suma es..."+ sum);
        System.out.println("El Promedio de los dos numeros es..."+ prom);

    }
    
}
