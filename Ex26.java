/******************************************************************************

26. Faça um programa, utilizando while, que mostre na tela de 0 até N, em que N
é o limite inserido pelo usuário.

*******************************************************************************/

import java.util.Scanner;
public class Ex26
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int numero = 1;
	    int n;
	    
		System.out.println("Insira um número para impor um limite no programa: ");
		n = ler.nextInt ();
		
		while (numero <= n){
		System.out.println (numero);
		numero++;
		}
		
		
	}
}
