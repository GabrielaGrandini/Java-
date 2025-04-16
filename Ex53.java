/******************************************************************************

53 - Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.
       * pesquisar para obter os valores em ordem crescente e decrescente.

*******************************************************************************/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Ex53
{
	public static void main(String[] args) {
	    Double[] n = new Double [10];
	    Scanner ler = new Scanner (System.in);
	    
	   
	   
	    for(int i = 0; i < 10; i++){
	        System.out.println("Entre com o " + ( i+ 1 ) + "º valor: ");
	        n[i] = ler.nextDouble ();
	    }
	    
	    System.out.println("A ordem inversa da entrada é: ");
	    ler.nextLine(); 
	    for(int i = n.length - 1; i >= 0; i--){
	     System.out.print(n[i] + ", ");
	 
	    } 
	    
	     ler.nextLine(); 
	     
	    Arrays.sort(n);
	    System.out.println("A ordem crescente dos números é: ");
	     for (double values : n) {
           System.out.print(values + ", ");
	     }
	     
	      ler.nextLine();
	    
	     System.out.println("A ordem decrescente dos números é: ");
	     Arrays.sort(n, Collections.reverseOrder());
	     for (double values : n) {
            System.out.print(values + ", ");
	     }
	}
}