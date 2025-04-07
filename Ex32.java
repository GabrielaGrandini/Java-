/******************************************************************************

32. Faça um programa que leia 5 números e informe o maior número.

*******************************************************************************/

import java.util.Scanner;
public class Ex32
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n, i = 1, maiorn = 0;
	    
	    while (i <= 5){
		    System.out.println("Entre com um número: ");
		    n = ler.nextInt ();
		    if (maiorn < n) {
		     maiorn = n;
		
	    }
	    i++;
	    System.out.println("Este é o maior número: " + maiorn);
	}
}
}
