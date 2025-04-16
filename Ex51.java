/******************************************************************************

51. Desenvolva um algoritmo que preencha aleatoriamente um vetor de 10 posicões
com números entre 0 a 100. Calcule e escreva o maior, menor e a média desses números.

===================================================
Ex.:        import java.util.Random;
            // Criar um gerador de números aleatórios
            Random random = new Random();
===================================================

*******************************************************************************/

import java.util.Random;
import java.util.Scanner;
public class Ex51
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
 	    Random random = new Random();
 	    int[] num =  new int[10];
 	    double menor = Integer.MAX_VALUE, maior=0, soma = 0;
 	    double  media;
 	    
 	     System.out.println("Estes são os elementos gerados: ");
 	    for(int i = 0; i < 10; i++){
 	        num[i] = random.nextInt(100);
 	        System.out.print(num[i] + ", ");
 	        
 	    }
 	    
 	    System.out.println("  ");
 	   
 	    
 	    
 	    for(int i = 0; i < 10; i++){
    		if (num[i] < menor){
    		     menor = num[i];
    		 }
    		 if(num[i] > maior){
    		     maior = num[i];
    		 }
  
    		 soma += num[i];
    	} 
    	
		 
		 media =  soma / 10;
		 System.out.println("Esta é a média dos vetores: " + media);
		 System.out.println("Este é o menor número: " + menor);
		 System.out.println("Este é o maior número: " + maior);
 	    
	}
}
