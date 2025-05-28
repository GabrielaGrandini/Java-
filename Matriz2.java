/******************************************************************************
2. Crie um algoritmo que leia uma matriz 3x3 e calcule a soma dos valores das colunas da
matriz.
*******************************************************************************/
import java.util.Scanner;
public class Matriz2
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int matriz [] []  = new int [3][3];
	    int somacoluna1=0, somacoluna2=0, somacoluna3=0;
	
	
		System.out.println("Digite a sua matriz: ");
		for (int i = 0; i < matriz.length; i++){
		    for (int j = 0; j < matriz[i].length; j++){
		        System.out.print("Elemento ["+ i +"] ["+j+ "]: ");
		        matriz [i][j] = ler.nextInt ();
		    }
		        somacoluna1 += matriz[i][0];
		        somacoluna2 += matriz[i][1];
		        somacoluna3 += matriz[i][2];
		   
		} 
		 System.out.println ();
		
		System.out.println("A soma da coluna 1 é: " + somacoluna1);
		System.out.println("A soma da coluna 2 é: " + somacoluna2);
		System.out.println("A soma da coluna 3 é: " + somacoluna3);
	}
}