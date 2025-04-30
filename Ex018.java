/******************************************************************************

Exercicio 018
Faça um programa que receba dois números inteiros e gere os números inteiros que
estão no intervalo compreendido por eles.

*******************************************************************************/

import java.util.Scanner;
public class Ex018
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n1, n2, n = 0;
	    
	    System.out.println("Entre com o primeiro número para o intervalo: ");
	    n1 = ler.nextInt ();
	    System.out.println("Entre com o segundo número para o intervalo: ");
	    n2 = ler.nextInt ();
	    
	    System.out.println("Os números inteiros neste intervalo são: ");
	    
	    for (int i = n1; i <= n2; i++){
	    n++;
	    System.out.print(n + " ");
	    }
	}
}