/******************************************************************************

49 - Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.

*******************************************************************************/

import java.util.Scanner;
public class Ex49
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int[] vetora = new int[10];
	    int[] vetorb = new int[10];
	    int[] vetorc = new int[10];
	    
	    System.out.println("Para o seu primeiro conjunto: ");
	    
	    for(int i =0; i < 10; i++){
	        System.out.print("Entre com o " + (i + 1) + "º número: ");
	        vetora[i] =ler.nextInt ();
	    }
	   
	    System.out.println("Para o seu segundo conjunto: ");
	    for(int i =0; i < 10; i++){
	        System.out.print("Entre com o " + (i + 1) + "º número: ");
	        vetorb[i] = ler.nextInt ();
	    }
	    
	    for(int i =0; i < 10; i++){
	         vetorc[i] = vetora[i] + vetorb[i];
	    }
	    
	    for (int i = 0; i<10; i++) {
	        System.out.println("A soma da" (i+1) "º posição é: " + vetorc[i]);
	    }
	    
	    
	 } 
	
}