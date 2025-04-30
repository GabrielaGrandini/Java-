/******************************************************************************

Exercicio 017
Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

*******************************************************************************/

public class Ex017
{
	public static void main(String[] args) {
	    int n = 0;
	    
	    System.out.println("Estes são os números ímpares entre 1 a 50: ");
	    while (n<50){
	        n++;
	        if ( n%2 != 0){
	           System.out.print( n+ ", "); 
	        }
	    }
		
		
		
	}
}