/******************************************************************************

Exercicio 020
Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de 
números pares e a quantidade de números impares.

*******************************************************************************/

import java.util.Scanner;
public class Ex020
{
	public static void main(String[] args) {
	     Scanner ler = new Scanner (System.in);
	     int n =0, n1 = 0, n2=0;
	     
	     for (int i = 0; i < 10; i++){
	         System.out.println("Entre com um valor: ");
	         n = ler.nextInt ();
	         n++;
	         if (n%2 == 0){
	             n1++;
	         } else {
	             n2++;
	         }
	     }
	     
	    System.out.println("Esta é a quantidade de números ímpares: " + n1);
		System.out.println("Esta é a quantidade de números pares: " + n2);
	}
}