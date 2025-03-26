/******************************************************************************

Ex11 -  Um banco concederá um crédito especial aos seus clientes, variável com o 
saldo médio no último ano. Faça um algoritmo que leia o saldo médio de um
cliente e calcule o valor do crédito de acordo com a tabela abaixo. Mostre uma 
mensagem informando o saldo médio e o valor do crédito.
de 0 a 200 - nenhum crédito
de 201 a 400 - 20% do valor do saldo médio
de 401 a 600 - 30% do valor do saldo médio
acima de 601 - 40% do valor do saldo médio

*******************************************************************************/

import java.util.Scanner;
public class Ex11

{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double sm, c, t;
	    
	    
		System.out.println("Informe o seu saldo médio no último ano: ");
		sm = ler.nextDouble ();
		
		if (sm >= 0 && sm <=200 ){
		    System.out.println("Você não possui crédito, mas este é seu saldo médio: " + sm);
		} else if (sm >= 200 && sm <= 400) {
		    c = sm * 0.2;
		    t = sm + c;
		    System.out.println("Este é o valor do seu saldo médio: " + sm);
		    System.out.println("Este é o valor do seu crédito: " + c);
		    System.out.println("Este é o total a receber: " + t);
		} else if (sm >= 400 && sm <= 600){
		    c = sm * 0.3;
		    t = sm + c;
		    System.out.println("Este é o valor do seu saldo médio: " + sm);
		    System.out.println("Este é o valor do seu crédito: " + c);
		    System.out.println("Este é o total a receber: " + t);
		} else {
		    c = sm * 0.4;
		    t = sm + c;
		    System.out.println("Este é o valor do seu saldo médio: " + sm);
		    System.out.println("Este é o valor do seu crédito: " + c);
		    System.out.println("Este é o total a receber: " + t);
		}
		}
	}

