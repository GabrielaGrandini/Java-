/******************************************************************************
5. Desenvolva um programa que leia duas matrizes 5x2 e crie uma terceira matriz também 5x2
com o valor da soma dos elementos de mesmo índice.
*******************************************************************************/
import java.util.Scanner;
public class Matriz5
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int ma [] [] = new int [5][2];
	    int triz [] [] = new int [5][2];
	    int soma [] [] = new int [5][2];
	    
	    
		System.out.println("Digite os valores para a primeira matriz: ");
	
		for (int i = 0; i < ma.length; i++){
		    for (int j = 0; j < ma[i].length; j++){
		        System.out.print("Elemento ["+i+"] ["+j+"]: ");
		        ma[i][j] = ler.nextInt ();
		    }
		}
		
		System.out.println();
		System.out.println("Digite os valores para a segunda matriz: ");
		
		for (int i = 0; i < ma.length; i++){
		    for (int j = 0; j < ma[i].length; j++){
		        System.out.print("Elemento ["+i+"] ["+j+"]: ");
		        triz[i][j] = ler.nextInt ();
		    }
		}

		for (int i = 0; i < ma.length; i++){
		    for (int j = 0; j < ma[i].length; j++){
		        soma [i][j] = ma [i][j] + triz [i][j];
		    }
		}
		System.out.println();
		
		for (int i = 0; i < ma.length; i++){
		    for (int j = 0; j < ma[i].length; j++){
		        System.out.println("A soma do matriz é: " + soma[i][j]);
		        }
		}
	}
}