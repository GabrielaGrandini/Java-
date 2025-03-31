/******************************************************************************

 19) Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
*******************************************************************************/

import java.util.Scanner;
public class Ex19
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int idade, idademenor=200;
	    String nome, nomemenor = "";
	    
	    for (int i = 1; i <= 10; i++){
	    
		System.out.println("Entre com o seu nome: ");
		nome = ler.nextLine ();
		
		System.out.println ("Entre com a sua idade: ");
		idade = ler.nextInt ();
		
		if (idade < idademenor){
		    idademenor = idade;
		    nomemenor = nome;
		    
		}
		//limpar o buffer de memória
		ler.nextLine();
		
		} 
		System.out.println ("A pessoa mais nova possui: " + idademenor);
	    System.out.println ("Está é a pessoa mais nova: " + nomemenor);
	}
}

