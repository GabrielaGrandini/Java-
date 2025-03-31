/******************************************************************************

Construa um programa que calcule a tabuada que o usuário entrar

*******************************************************************************/

import java.util.Scanner;
public class Tabuada
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n;
	    
	    System.out.print("Digite um número para a tabuada: ");
	    n = ler.nextInt ();
	    
	    for(int i = 1; i <= 10 ; i++)
	     System.out.println("Número " + (n*i));
	}
}
