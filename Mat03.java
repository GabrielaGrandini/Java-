/******************************************************************************
3) Faça um programa que leia uma matriz [5,5] de inteiros e verifique se existem elementos repetidos.
Mostrar a matriz e os números repetidos.
*******************************************************************************/
import java.util.Scanner;

public class Mat03
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int [][] matriz = new int [5][5];
	    int repete = 0;
	    
		System.out.println("Digite os elementos da matriz 5x5: ");
		for (int i = 0; i < 5; i++){
		    for (int j = 0; j < 5; j++){
		        System.out.print("Elemento [" + i + "] [" + j + "]: ");
		        matriz [i][j] = ler.nextInt ();
		        
		          System.out.println();
		    }
		}
		
		System.out.println("Essa é a ordem da matriz 5x5 original: ");
		
		for (int i = 0; i < matriz.length; i++){
	        for (int j = 0; j < matriz[i].length; j++){
	        System.out.print(matriz[i][j] + " ");
	        }
		}
		for (int i = 0; i < matriz.length; i++){
		    for (int j = 0; j < matriz[i].length; j++){
		        for (int k = 0; k < matriz.length; k++){
		            for (int l = 0; l < matriz[k].length; l++){
		                if (i != k || j != l){
		                   if (matriz[i][j] == matriz [k][l]){
		                       repete = matriz[i][j];
		                   }
		                }
		            }
		        }
		     }
		   } 
		   
		   if (repete != 0){
		      System.out.println("\nValor repetido: " + repete);
		      System.out.println();
		 } else {
		      System.out.println("\nNenhum valor repetiu!");
		      System.out.println();
		 }
		 }		
		 
		 
	}
