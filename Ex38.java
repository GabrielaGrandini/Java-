/******************************************************************************
 * 
38 -  A padaria Hotpão vende uma certa quantidade de pães franceses e uma quantidade
de broas a cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final
do dia, o dono quer saber quanto arrecadou com a venda dos pães e broas (juntos),
e quanto deve guardar numa conta de poupança (10% do total arrecadado).
Você foi contratado para fazer os cálculos para o dono. Com base nestes fatos,
faça um algoritmo para ler as quantidades de pães e de broas, e depois calcular
os dados solicitados.


*******************************************************************************/

import java.util.Scanner;
public class Ex38
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int pao, broa, soma;
	    double tp, tb, totalv, poupanca, resultado;
	    
		System.out.println("Entre com a quantidade de pães vendidos: ");
		pao = ler.nextInt ();
		tp = pao * 0.12;
		System.out.println("Entre com a quantidade de broas vendidas: ");
		broa = ler.nextInt ();
		tb = broa * 1.50;
		
		totalv = tb + tp;
		poupanca = totalv * 0.1;

	    System.out.println("Este foi o valor arrecado pelas vendas de pães e broas: R$" + totalv);
	    System.out.println("Este é o valor que deve ser retirado para a poupança: R$" + poupanca);
	}
}