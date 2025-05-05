/******************************************************************************

Exercicio 021

Crie um vetor de 10 inteiros e inicialize-o com valores sequenciais (1, 2, 3, ..., 10).
Em seguida, imprima todos os valores do vetor na tela.


*******************************************************************************/

public class Ex021
{
	public static void main(String[] args) {
	    int [] vet = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    
	    for (int i = 0; i < vet.length; i++){
	       System.out.print(vet[i] + " "); 
	    }
	}
}


