/******************************************************************************

44 - Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.

*******************************************************************************/

import java.util.Scanner;
public class Ex44

{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double total,carlosandre, felipe;

	    int resultado;
	    
		System.out.println("Informe o valor final da conta a pagar: ");
		total = ler.nextDouble();
		
		carlosandre = total / 3;
		resultado = (int) carlosandre;
		
		
		felipe = total - resultado;
		
		
		    
		System.out.println("Carlos deve pagar: R$ " + resultado);
		System.out.println("André deve pagar: R$ " + resultado);
		System.out.println("Felipe deve pagar: R$ " + felipe);
		}
	}
