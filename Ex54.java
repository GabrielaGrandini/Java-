/******************************************************************************

54.Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.

*******************************************************************************/

import java.util.Scanner;
public class Ex54
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n, soma = 0, multiplicar = 1;
	    
	    
		System.out.println("Entre com a quantidade de números que você deseja armazenar: ");
		n = ler.nextInt ();
		int [] nm = new int [n];
		
		for(int i = 0; i < n; i++){
		    System.out.println("Entre com o " + ( i + 1 ) + "º número: ");
		    nm[i] = ler.nextInt ();
		    if (nm[i]% 2 == 0) {
		        soma++;
		    } else {
		        multiplicar *= nm[i];
		    }
		}
		
		for (int i = 0; i < 1; i++){
	        System.out.println ("Nesta sequência há: " + soma++ + " número(s) pares");
	        System.out.println ("Todos os números ímpares multiplicados resultará em: " + multiplicar);
		}
	}
}