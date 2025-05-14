/******************************************************************************
1) Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada
*******************************************************************************/

public class Mat01
{
	public static void main(String[] args) {
	    int [] [] matriz = new int [4] [4];
	    
		matriz [0][0] = 16;
		matriz [0][1] = 17;
		matriz [0][2] = 18;
		matriz [0][3] = 19;
		
		matriz [1][0] = 11;
		matriz [1][1] = 22;
		matriz [1][2] = 23;
		matriz [1][3] = 24;
		
		matriz [2][0] = 14;
		matriz [2][1] = 15;
		matriz [2][2] = 20;
		matriz [2][3] = 25;
		
		matriz [3][0] = 24;
		matriz [3][1] = 44;
		matriz [3][2] = 16;
		matriz [3][3] = 21;
		
		System.out.println("Matriz 4x4");
		for (int i = 0; i < matriz.length; i++){
		    for (int j = 0; j < matriz[i].length; j++){
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}
	}
}