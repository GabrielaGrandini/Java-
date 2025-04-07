/********************************************************************************
7)Desenvolva um programa que calcule a área de um círculo utilizando a constante Math.PI
   // Define PI como uma constante --> final double PI = Math.PI;

*******************************************************************************/

import java.util.Scanner;
public class pesquisa7 {
 public static final float PI = 3.1415F;

	public static void main(String[] args) {
	   
	    double raio, x = 2;
	    Scanner ler = new Scanner (System.in);
		System.out.println("Entre com o raio de seu círculo: ");
		raio = ler.nextDouble ();
		
		System.out.println( "O valor da área do seu círculo é: " + Math.pow (raio, x) * PI );
		
	}
}
