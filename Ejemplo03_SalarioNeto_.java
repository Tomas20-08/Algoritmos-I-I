//Cacular salario neto.

package PseInt;

import java.util.Scanner;

public class Ejemplo03_SalarioNeto_ {

    public static void main(String[] args) {
        
        int dl,he;
        double sb,vsb,vhe,ret,sn;
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite su salario basico");
        
        sb = scanner.nextInt();
        
        System.out.println("Digite su numero de dias laborados");
        
        dl = scanner.nextInt();
        
        System.out.println("Digite sus horas extras laboradas");
        
        he = scanner.nextInt();
        
        //calcular el valor del salario basico
        
        vsb = ((sb/30)*dl);
                
        //Calcular el valor de las horas extra
        
        vhe = (((sb/240)*1.25)*he);
        
        //Retencion en la fuente
                
        ret = (vsb*0.03);
        
        //Salario Neto
        
        sn = ((vsb+vhe+180000)-ret);
        
        System.out.println("El valor del salario neto es..."+sn);
                
    }
    
}
