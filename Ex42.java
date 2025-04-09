/******************************************************************************

42 - Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.


*******************************************************************************/

import java.util.Scanner;
public class Ex42
{
	public static void main(String[] args) {
	    Scanner mds = new Scanner (System.in);
	    int p, m, g, valor, tp, tm, tg;
	    
		System.out.println("Entre com a quantidade de camisetas pequenas vendidas: ");
		p = mds.nextInt ();
		System.out.println("Entre com a quantidade de camisetas médias vendidas: ");
		m = mds.nextInt ();
		System.out.println("Entre com a quantidade de camisetas grandes vendidas: ");
		g = mds.nextInt ();
		
		tp = p * 10;
		tm = m * 12;
		tg = g * 15;
		
		valor =  tp + tm + tg;
		
		System.out.println("O valor arrecado por esta venda é: R$ " + valor);
	}
}