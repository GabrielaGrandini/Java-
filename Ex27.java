/******************************************************************************

27. Faça um programa, utilizando while, que permita o usuário escrever o nome de
cinco pessoas e os mostre na tela.

*******************************************************************************/

import java.util.Scanner;
public class Ex27
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    String nome = " ";
	    int i = 1;
	   
	    
	    while (i <= 5){
		System.out.println("Insira um nome: ");
		nome = ler.nextLine();
		
		System.out.println(i + "º Nome inserido: " + nome);
		i++;
	    }	
	    
	}
}
