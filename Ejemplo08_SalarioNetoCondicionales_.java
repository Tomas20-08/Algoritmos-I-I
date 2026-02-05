//Calcular salario neto (Condicioanles 3).

package PseInt;

import java.util.Scanner;

public class Ejemplo08_SalarioNetoCondicionales_ {

    public static void main(String[] args) {

int dl,he,sub;
double sb,vsb,vhe,ret,fond,sn;

final int salmin = 1423500;
final int subtrans= 180000;  

Scanner scanner = new Scanner(System.in);

System.out.println("Digite su salario basico");

sb = scanner.nextInt();

System.out.println("Digite su numero de dias laborados");

dl = scanner.nextInt();

System.out.println("Digite sus horas extras laboradas");

he = scanner.nextInt();

//calculas valor dias laborados

vsb = (int) ((sb/30)*dl);

//Calcualr valor horas extra

vhe = (int) ((sb/240)*1.25)*he;

//Retencion en la fuente

if(sb>=2000000){
ret=(double) (vsb*0.03);
} else{
ret=(double) (0);
}

//Subsidio de transporte

if(sb<=(salmin*2)){
sub = subtrans;
} else{
sub = 0;
}

//Fondo de ahorro

fond = (vsb*0.03);

//Salario Neto

sn = vsb+vhe-ret+sub-fond;        

System.out.println("El salario neto es..."+sn);

}

}
