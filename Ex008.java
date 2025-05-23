/******************************************************************************
João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar
o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior
que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos)
deve pagar uma multa de R$ 4,00 por quilo excedente.
João precisa que você faça um programa que leia a variável peso (peso de peixes)
e calcule o excesso.
Gravar na variável excesso a quantidade de quilos além do limite e na variável
multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens adequadas.
*******************************************************************************/

import java.util.Scanner;
public class Ex008
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double peso, excesso, multa;
	    
		System.out.println("Entre com o peso da pesca feita hoje: ");
		peso = ler.nextDouble ();
		
		excesso = peso - 50;
		multa = excesso * 4;
		
		if (peso > 50){ 
		System.out.println("O excesso da pesca foi de:  " + excesso );
		System.out.println("O valor da multa a pagar é: R$" + multa);
		}
		else {
		    System.out.println("Não há multa!");
		}
	}
}