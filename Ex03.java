/******************************************************************************

Ex03 - Faça um algoritmo que receba três
números inteiros e mostre o maior deles. Considere que os números sempre serão
diferentes.

*******************************************************************************/

import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n1, n2, n3;
	    
        System.out.println("Entre com um número: ");
        n1 = ler.nextInt ();
        System.out.println("Entre com um número diferente do primeiro: ");
        n2 = ler.nextInt (); 
        System.out.println("Entre com um número diferente do primero e do segundo");
        n3 = ler.nextInt ();
        
        if (n1 > n2 && n1 > n3)
         System.out.println("O maior número é o primeiro: "+ n1);
        else if (n2 > n1 && n2 > n3)
         System.out.println("O maior número é o segundo: " + n2);
        else 
         System.out.println("O maior número é o terceiro: " + n3);
	}
}
