/******************************************************************************

47 - Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.

*******************************************************************************/

import java.util.Scanner;
public class Ex47
{
	public static void main(String[] args) {
	    Scanner jo = new Scanner (System.in);
	    int[] conjunto = new int [20];
	    
	    for (int i = 0; i < conjunto.length; i++) {
	     System.out.print("Entre com o " + (i + 1) + "º número: ");   
	     conjunto[i] = jo.nextInt ();
	    }
	    
	    for (int i = conjunto.length - 1; i >= 0 ; i--){
	        System.out.println ("O número da posição " + (i+1) + "º é: " + conjunto[i]);
	    }
		
	}
}