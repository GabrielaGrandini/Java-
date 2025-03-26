/******************************************************************************

Ex 01 - Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado

*******************************************************************************/

import java.util.Scanner;
public class Ex01
{
	public static void main(String[] args) {
	    double n1, n2, media;
	    Scanner li = new Scanner (System.in);
	    
    	System.out.println("Informe a sua primeira nota: ");
    	n1 = li.nextDouble ();
    	System.out.println("Informe a sua segunda nota: ");
    	n2 = li.nextDouble ();
    	
    	media = (n1 + n2) / 2;
    	
    	if (media >= 7)
    	 System.out.println("Você foi aprovado!");
    	else
    	  System.out.println("Você foi reprovado!");
	}
}
