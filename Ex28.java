/******************************************************************************

28. Faça um programa, utilizando while, que permita o usuário fazer contas de
adição enquanto quiser.

*******************************************************************************/

import java.util.Scanner;
public class Ex28
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    char sn =  's';
	    int n1, n2, soma;
	    
	    while (sn == 's' || sn == 'S' ) {
	        
	        System.out.println ("Entre com um número: ");
	        n1 = ler.nextInt ();
	        System.out.println ("Entre com um número: ");
	        n2 = ler.nextInt ();
	        
	        soma = n1 + n2;
	        System.out.println ("A soma deste números são: " + soma);
	        
	        System.out.println ("Deseja continuar com as contas? [S] para sim / [N] para não? ");
	         sn = ler.next().charAt(0);
	    } 
	    System.out.println("Programa encerrado.");
	    ler.close ();
	} 
	}
