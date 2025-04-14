/******************************************************************************

5 - Simulador de empréstimo com juros compostos
Peça ao usuário um valor de empréstimo e em quantas parcelas deseja pagar. 
Calcule o valor final com juros compostos de 2% ao mês. Mostre o valor final e o
valor de cada parcela. Permita simular vários empréstimos.

*******************************************************************************/

import java.util.Scanner;
public class Desafio5
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double valor, parcelas, pare, montante, montante2, montante1, jurosc;
	    
	    do {
	        System.out.print("Entre com o valor do empréstimo: ");
	        valor = ler.nextDouble ();
	        System.out.print("Entre com o número de parcelas que deseja realizar: ");
	        parcelas = ler.nextDouble ();
	       
	        
	        
	        montante2 = (1 + 0.02);
	        montante1 = Math.pow(montante2,parcelas);
	        montante = montante1 * valor;
	        jurosc = montante - valor;
	        System.out.println(" ");
	        System.out.println("Este é o valor final das parcelas: "+jurosc);
	        System.out.println("Este é o valor final: "+montante);
	        System.out.println(" ");
	        
	        System.out.println("Digite [1] para sair / Digite qualquer número para realizar outro empréstimo: ");
	        pare = ler.nextDouble ();
	        System.out.println(" ");
	        
	        
	    } while (pare != 1);
		System.out.println("Obrigada por usar o nosso sistema!");
		
	}
}
