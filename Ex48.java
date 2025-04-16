/******************************************************************************

48 - Desenvolva um algoritmo que leia um conjunto de 10 valores reais, guarde-os
em um vetor, calcule a soma dos valores armazenados em posicões ímpares
e escreva o resultado.

*******************************************************************************/

import java.util.Scanner;
public class Ex48
{
	public static void main(String[] args) {
	    Scanner hn = new Scanner (System.in);
	    double[] valores = new double [10];
	    double soma = 0;
	    
	    for (int i = 0; i < valores.length; i++) {
	     System.out.print("Entre com o " + (i + 1) + "º número: ");   
	     valores[i] = hn.nextDouble ();
	     if ((i + 1)% 2 != 0){
	         soma = (soma + valores[i]);
	     }
	    }
	    
	    for (int i = 0; i < 1; i++){
	        System.out.println ("A soma dos números das posições ímpares é: " + soma);
	    }
		
	}
}