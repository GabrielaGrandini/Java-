/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Vetor_Exercício
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int[] idades = new int [5];
	    String[] nomes = new String[5];
	    int idadem = 0;
	    
	    for(int i =0; i < 5; i++){
	        System.out.print("Entre com o " + (i + 1) + "º nome: ");
	        nomes[i] =  ler.nextLine ();
	        
	         System.out.print("Digite o " + (i + 1) + "° idade: ");
		    idades[i] = ler.nextInt ();
		    
		    ler.nextLine();
		    
	    } 
	    	for (int i = 0; i < 5; i++){
		    if (idades[i] >= 18) {
		        System.out.println("Está pessoa é maior de idade: " + nomes[i] +  ", possui " + idades[i] +  " anos");
		    }
		 }  
		 
		
	}
}