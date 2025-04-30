/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Ex003
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double n1, n2 , n3, n4, media;
	    
		System.out.println("Entre com a 1º nota do bimestre: ");
		n1 = ler.nextDouble ();
		System.out.println("Entre com a 2º nota do bimestre: ");
		n2 = ler.nextDouble ();
		System.out.println("Entre com a 3º nota do bimestre: ");
		n3 = ler.nextDouble ();
		System.out.println("Entre com a 4º nota do bimestre: ");
		n4 = ler.nextDouble ();
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("Entre com a 1º nota do bimestre: " + media);
		
	}
}