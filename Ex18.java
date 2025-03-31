/******************************************************************************

18) Leia a idade de 20 pessoas e exiba a soma das idade, a média das idades e
quantas pessoas são maiores de idade.

*******************************************************************************/

import java.util.Scanner;
public class Ex18

{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int idade, media = 0, res, total=0;
	    
	    for(int i = 0; i <= 20; i++){
		System.out.println("Entre com a sua idade: ");
		idade = ler.nextInt ();
		media = (idade + media);
		res = media /20;
		if (idade >= 18)
		    total = total + 1;
		    //total++;
		   System.out.println("A média das idades é: " + res );
	}
	    
	    System.out.println("A soma das idades é: " + media );
	    System.out.println("Está é a quantidade de pessoas maiores de idade: " + total);
	
	}
}
