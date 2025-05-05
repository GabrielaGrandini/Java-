/******************************************************************************
Exercicio 022

Crie um vetor de 5 números inteiros, preencha com valores de sua escolha e 
calcule a soma de todos os elementos desse vetor. Exiba o resultado.


*******************************************************************************/

import java.util.Scanner;
public class Ex022
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int [] vet = {2, 4, 6, 8, 10};
	    int soma = 0;
	    
	    for (int i = 0; i < vet.length; i++){
	        soma += vet[i];
	    }
		System.out.println("A soma do vetor 'vet' com os valores sendo: 2, 4, 6, 8, 10 é: " + soma);
	} 
}
