/******************************************************************************

33.  Faça um programa que leia 10 números e informe a soma e a média dos números.

*******************************************************************************/

import java.util.Scanner;
public class Ex33
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n, i = 1;
	    double media, soma = 0;
	    
	    while (i <=10){
		System.out.println("Entre com um número: ");
		n = ler.nextInt ();
		soma += n;
		media = soma/10;
		i++;
			System.out.println( "Este é o valor da soma de todos estes números: " + soma);
			System.out.println( "Esta é a média de todos estes números: " + media);
	}
	}
}
