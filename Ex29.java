/******************************************************************************

29. Escreva um programa que pergunte ao usuário quantos alunos ele
tem em sua academia. Em seguida, através de um laço while, o usuário
digita o peso de todos os alunos, um por vez, e por fim, o programa deve
mostrar a média de peso dos clientes.

*******************************************************************************/

import java.util.Scanner;
public class Ex29
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int n, i = 1, peso, soma = 0;
	    double media;
	    
	    System.out.println("Informe a quantidade de pessoas existem na academia: ");
	    n = ler.nextInt ();
	    
	    
	    while (i <= n){
	    System.out.println("Digite o peso de cada aluno: ");
	      
	    peso = ler.nextInt ();
	    soma += peso;
	    media = soma/n;
	    i++;
	    
	    System.out.println("Está é a média de peso dos seus clientes, de acordo com as informações dadas até agora: " + media);
	    }
	}
}
