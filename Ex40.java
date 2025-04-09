/******************************************************************************

40 -  Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o
preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu colocar no
tanque.

*******************************************************************************/

import java.util.Scanner;
public class Ex40
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double dinheiro, total;
	    
	    System.out.println("Gasolina = R$ 6,20 por litro");
		System.out.println("Escreva quantos reais deseja por de gasolina: ");
		dinheiro = ler.nextDouble ();
		
		total =  dinheiro / 6.2;
		
		System.out.println("Esta é quantidade de litros preenchida considerando o valor a pagar: " +total);
		
	}
}