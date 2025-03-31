/******************************************************************************

17) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.

*******************************************************************************/

import java.util.Scanner;
public class Ex17
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n, soma = 0;
	    
	    for (int i = 0 ; i <= 10; i++){
		System.out.println("Entre com um valor: ");
		n = ler.nextInt ();
		soma = soma + n;
		System.out.println("O resultado será: " + soma );
	}  
		
	}
}
