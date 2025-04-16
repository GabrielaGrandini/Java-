/******************************************************************************

52 - Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array, 
calcule e apresente a soma das idades. Verificar as idades e apresentar se a 
pessoa é " Melhor idade", " Adulto" ou "Criança".

*******************************************************************************/

import java.util.Scanner;
public class Ex52
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int[] idades = new int [5];
	    String [] nomes = new String [5];
	    double soma = 0;
	    double media;
	    
	    for(int i = 0; i < 5; i++){
	        System.out.println("Entre com o " + (i + 1) +"º nome: ");
	        nomes[i] = ler.nextLine ();
	        
	        System.out.println("Entre com a " + (i + 1) + "° idade: ");
		    idades[i] = ler.nextInt ();
		    
		    soma += idades[i]; 
		      ler.nextLine();
	    }
	    
	    for (int i = 0; i < 5; i++){
		    if (idades[i] >= 18 && idades[i] <= 59) {
		        System.out.println("Está pessoa é adulta: " + nomes[i] +  ", possui " + idades[i] +  " anos");
		    } if (idades[i] < 18 ) {
		        System.out.println("Está pessoa é uma criança: " + nomes[i] +  ", possui " + idades[i] +  " anos");
		    } if (idades[i] >= 60){
		        System.out.println("Está pessoa está na melhor idade: " + nomes[i] +  ", possui " + idades[i] +  " anos");
		    }
	    } 
	    
	    media = soma / 5;
	    
	    System.out.println("Este é o valor da soma de todas as idades: " + soma);
	    System.out.println("Este é o valor da média de todas as idades: " + media);
	}
}
