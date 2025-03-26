/******************************************************************************

Ex 02 - Faça um algoritmo que receba a idade
do usuário e verifique se ele tem 18 anos ou mais. 

*******************************************************************************/
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner (System.in);
	    int idade;
	    
    	System.out.println("Informe a sua idade: ");
    	idade = leia.nextInt ();
    	
    	if  (idade >= 18)
    	 System.out.println("Maior de idade");
    	else 
    	 System.out.println("Menor de idade");
	}
}
