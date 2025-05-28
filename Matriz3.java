/******************************************************************************
3. Crie um algoritmo informe qual o maior e qual o menor elemento existente em uma matriz
6x3.
*******************************************************************************/
import java.util.Scanner;
public class Matriz3
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int matriz [] [] = new int [6] [3];
	    int  maior = 0, menor = Integer.MAX_VALUE;
	    
		System.out.println("Digite os valores da matriz 6x3: ");
		for (int i = 0; i < matriz.length; i++){
		    for (int j = 0; j < matriz[i].length; j++){
		        System.out.print("Elemento ["+ i +"] ["+j+ "]: ");
		        matriz[i][j] = ler.nextInt ();
		
	        	if (matriz[i][j] < menor){
		        menor = matriz [i][j];
	    	}
	        	if ( maior < matriz[i][j] ){
		        maior = matriz [i][j];
	        	}
	    	}
		}
		System.out.println("Este é o menor valor da matriz: " + menor);
		System.out.println("Este é o maior valor da matriz: " + maior);
	}
}