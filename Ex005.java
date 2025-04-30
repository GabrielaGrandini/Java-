/******************************************************************************

Exercicio 005
Faça um Programa que pergunte quanto você ganha por hora e o número de horas 
trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

*******************************************************************************/

import java.util.Scanner;
public class Ex005
{
	public static void main(String[] args) {
	     Scanner ler = new Scanner (System.in);
	     double horat, valortotald, valortotalm, horas;
	     
		System.out.println("Entre com a quantidade de dinheiro que você ganha por hora trabalhada: R$");
		horat = ler.nextDouble ();
		System.out.println("Entre com a quantidade de horas que você trabalha: ");
		horas = ler.nextDouble ();
		
		valortotald = horat * horas;
		valortotalm = valortotald * 22;
		
		System.out.println("Este é o valor total a receber considerando 22 dias utéis: R$" + valortotalm);	
	
	}
}