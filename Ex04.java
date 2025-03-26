/******************************************************************************

Ex04 - A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais.

*******************************************************************************/

import java.util.Scanner;
public class Ex04
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double td, s, b;
	    
		System.out.println("Informe a quanto tempo você trabalha para a empresa XKW: ");
		td = ler.nextDouble ();
		System.out.println("Informe quanto é o teu salário: ");
		s = ler.nextDouble ();
		
	   if (td >= 5){
	     b = s * 0.2;
	     System.out.println("O bônus que a empresa lhe oferece é: " + b);
	    } else{
		 b = s * 0.10;
		 System.out.println("O bônus que a empresa lhe oferece é: " + b);
	  } 
	}
}