/******************************************************************************


Ex07. Tendo como entrada o total vendido por
um funcionário no mês de abril, faça um algoritmo que calcule e mostre a sua
comissão e seu salário bruto neste mês, sabendo que o seu salário base é
R$1.200,00 e sua comissão é de 10% sobre o total vendido. O funcionário só
ganhará comissão se o valor total vendido for maior que R$2.000,00.

*******************************************************************************/

import java.util.Scanner;
public class Ex07
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double c, sdv, sc;
	    
		System.out.println("Informe o valor vendido pela comissão: ");
		c = ler.nextDouble ();
		
		if (c > 2000){
		 sdv = c * 0.10 + 1200;
		 sc = c * 0.10;
		 System.out.println("O valor do salário a ser entregue em decorrência os valores da comissão é: " + sdv);
		 System.out.println("O valor da comissão é: " + sc );
		} else {
		    System.out.println("O valor do salário a ser entregue em decorrência os valores da comissão é de R$ 1.200,00  ");
		}
		}
	}

