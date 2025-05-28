/******************************************************************************
1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.
*******************************************************************************/

import java.util.Scanner;
public class Matriz1
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
		int matriz [] [] = new int [5][5];
		int par = 0;
		
		for (int i = 0; i < matriz.length; i++){
		    for (int j = 0; j < matriz[i].length; j++){
		         System.out.print("Elemento [" + i + "] [" + j + "]: ");
		         matriz [i][j] = ler.nextInt ();
		       
		      
		    }
		}
		
		for (int i = 0; i< matriz.length; i++){
		    for (int j = 0; j < matriz[i].length; j++){
		        if (matriz[i][j]%2 == 0){
		            par++;
		        }
		            
		        }
		    }
		    
		     System.out.println("Essa é a quantidade de números pares na matriz 5x5: "+ par);
		}
		
	}
