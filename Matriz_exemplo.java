/******************************************************************************
 Primeiro program sobre Matriz
*******************************************************************************/

public class Matriz_exemplo
{
	public static void main(String[] args) {
	    int [] [] matriz = new int [2][3];
	    
	    matriz [0] [0] = 1637;
	    matriz [0] [1] = 1705;
	    matriz [0] [2] = 1779;
	    matriz [1] [0] = 1844;
	    matriz [1] [1] = 1900;
	    matriz [1] [2] = 2021;
	    
	    System.out.println("Matriz 2x3:");
	    
	    for (int i = 0; i < matriz.length; i++){
	        for (int j = 0; j <matriz[i].length; j++){
	            System.out.println(matriz[i][j] + " ");
	        }
	        System.out.println();
	    }
	}
}