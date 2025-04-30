/******************************************************************************

Exercicio 014
As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
e lhe contrataram para desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o 
seguinte critério, baseado no salário atual:

salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% 

Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.

*******************************************************************************/

import java.util.Scanner;
public class Ex014
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double salario, aumento, salarionovo;
	    
		System.out.println("Entre com o salário atual: ");
		salario = ler.nextDouble ();
		
		if (salario <= 280){
		    aumento =  salario * 0.2;
		    salarionovo =  salario + aumento;
		    System.out.println("Este é o salário inicial: R$" + salario);
		    System.out.println("A porcentagem do aumento é 20% ");
		    System.out.println("O valor do aumento é: " + aumento);
		    System.out.println("Este é o valor do novo salário, após o aumento: R$" + salarionovo);
		} else if ( salario > 280 && salario <= 700){
		    aumento =  salario * 0.15;
		    salarionovo = salario + aumento;
		    System.out.println("Este é o salário inicial: R$" + salario);
		    System.out.println("A porcentagem do aumento é 15% ");
		    System.out.println("O valor do aumento é: " + aumento);
		    System.out.println("Este é o valor do novo salário, após o aumento: R$" + salarionovo);
		} else if (salario > 700 && salario < 1500){
		    aumento =  salario * 0.1;
		    salarionovo = salario + aumento;
		    System.out.println("Este é o salário inicial: R$" + salario);
		    System.out.println("A porcentagem do aumento é 10% ");
		    System.out.println("O valor do aumento é: " + aumento);
		    System.out.println("Este é o valor do novo salário, após o aumento: R$" + salarionovo);
		} else {
		    aumento =  salario * 0.05;
		    salarionovo = salario + aumento;
		    System.out.println("Este é o salário inicial: R$" + salario);
		    System.out.println("A porcentagem do aumento é 5% ");
		    System.out.println("O valor do aumento é: " + aumento);
		    System.out.println("Este é o valor do novo salário, após o aumento: R$" + salarionovo);
		}
	}
}