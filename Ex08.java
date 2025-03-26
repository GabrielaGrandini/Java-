/******************************************************************************

Ex08 - Construa um algoritmo que, tendo como
dados de entrada a altura (H) e o sexo (S) de uma pessoa calcule e apresente
seu peso ideal utilizando as seguintes fórmulas: Para homens: Peso ideal (P) =
(72,7 * H) – 58 Para mulheres: Peso ideal (P) = (62,1 * H) – 44,7

*******************************************************************************/

import java.util.Scanner;
public class Ex08
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double h, p;
	    String s;
	    
	    System.out.println("Informe o seu sexo (feminino ou masculino):  ");
		s = ler.nextLine();
		
		System.out.println("Informe a tua altura: ");
		h = ler.nextDouble ();

		
		if (s == "feminino"){
		 p = (62.1 * h) - 44.7;
		 System.out.println("O seu peso ideal é: " + p);
		} else {
		 p = (72.7 * h) - 58;
		 System.out.println("O seu peso ideal é: " + p);
		}
	}
}
