/******************************************************************************

22)Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 

*******************************************************************************/

import java.util.Scanner;
public class Ex22
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int idade = 0, i, m=0, h=0;
	    double mdt = 0, md1= 0, md2=0;
	    String genero = " ";
	    
	    for(i = 1;  i <= 7; i++){
	       System.out.println("Entre com o seu sexo: ");
	        genero = ler.nextLine ();
	       System.out.println("Entre com a sua idade: ");
	        idade = ler.nextInt ();
	        
	        mdt = mdt + idade;
	        
	        if (genero.equals("Mulher")){
	            md1 = (md1 + idade);
	            m++;
	        }
	        else
	        {
	            md2 = (md2 + idade);
	            h++;;
	        }
	        ler.nextLine ();
	    }
	    
	    mdt = mdt / i;
	    
	    md1 = md1 / m;
	    md2 = md2 / h;
	   

	    System.out.println("A média do grupo é: " + mdt);
	    System.out.println("A média das mulheres deste grupo é: " + md1);
	    System.out.println("A média dos homens deste grupo é: " + md2);
	}
}
