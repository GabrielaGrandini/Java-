/******************************************************************************

20) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. 

*******************************************************************************/

import java.util.Scanner;
public class Ex20
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n = 0, total = 0, t2 = 0, t3 = 0;
	    
	    for(int i = 1; i <= 20; i++){
		System.out.println("Entre com um número: ");
		n = ler.nextInt ();
		
		if (n >= 0 && n <= 100){
		    total = total + 1;
		} else if (n >= 101 && n <= 200){
		    t2 = t2 + 1;
		}else{
		    t3 = t3 + 1;
		}
	    }
	  System.out.println("Está é a quantidade de números entre 0 e 100: " + total );
      System.out.println("Está é a quantidade de números entre 101 e 200: " + t2);
      System.out.println("Está é a quantidade de números maiores que 200:  " + t3);
	}
}
