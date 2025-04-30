/******************************************************************************
Exercicio 019

O Departamento Estadual de Meteorologia lhe contratou para desenvolver um programa
que leia as um conjunto indeterminado de temperaturas, e informe ao final a menor
e a maior temperaturas informadas, bem como a mC)dia das temperaturas.

*******************************************************************************/
import java.lang.Math;
import java.util.Scanner;
public class Ex019
{
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int temperatura, tudo = 0, soma1 = 0, maior = 0, menor = Integer.MAX_VALUE;
		double media;
		String sn = " ";


		do {
			System.out.println("Digite o valor da temperatura: ");
			tudo++;
			temperatura = ler.nextInt ();
			soma1 += temperatura;
			media = soma1 / tudo;

			System.out.println("(para finalizar o programa digite: pare)");
			sn = ler.next ();


			if (temperatura < menor ) {
				menor = temperatura;
			}

			if (maior < temperatura) {
				maior = temperatura;
			}

			ler.nextLine();
		}

		while (!sn.equals("pare"));
		System.out.println("Esta C) a maior temperatura: " + maior);
		System.out.println("Esta C) a menor temperatura: " + menor);
		System.out.println("Esta C) a mC)dia das temperaturas: " + media);
	}
}