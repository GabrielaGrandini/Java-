/******************************************************************************

Ex12 - Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento.

*******************************************************************************/

import java.util.Scanner;
public class Ex12
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int an, at, tf, i;
	    
		System.out.println("Informe o ano atual: ");
		at = ler.nextInt ();
		System.out.println("Informe o seu ano de nascimento: ");
		an = ler.nextInt ();
		
		i = at - an;
		
		if (i >= 18){
		   tf = i - 18 ; 
		    System.out.println("Já se passaram " + tf + " anos para o alistamento militar" );
		} else{
		    tf = 18 - i;
		    System.out.println("Faltam " + tf + " anos para o alistamento militar" );
		}
	}
}
