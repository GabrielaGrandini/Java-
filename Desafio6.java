/******************************************************************************
6 - Faça um programa em Java para resolver a equação de 2º grau.        
        Pedir para o usuário entrar com as variáveis A, B e C .
        Mostrar o valor de x1, x2 e delta.
       
        Usar a biblioteca:
          import java.lang.Math;
          Usar o "Math.sqrt" para encontrar a raiz quadrada. 
          Ex.: raiz = Math.sqrt(9); // = 3
          Usar o "Math.pow" para fazer a potenciação 
          Ex.: potencia= Math.pow(5,2); // = 25
          *Usar double se resultar em números decimais

*******************************************************************************/

import java.lang.Math;
import java.util.Scanner;
public class Desafio6
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double a, b, c, p = 2, deltab, delta, x1, x2, x11, x21, raiz;
	    
		System.out.println("Programa de cálculo: Equação de 2º grau");
		System.out.println("Entre com a variável a: ");
		a =  ler.nextDouble ();
		System.out.println("Entre com a variável b: ");
		b = ler.nextDouble ();
		System.out.println("Entre com a variável c: ");
		c = ler.nextDouble ();
		
		deltab = Math.pow(b, p);
		delta = deltab * -4 * a * c;
		
		raiz = Math.sqrt(delta);
		x11 = (-b - raiz);
		x1 = x11 / (2 * a);
		x21 = (-b + raiz);
		x2 = x21 / (2 * a);
		
		System.out.println("O valor de delta é: " + delta);
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: "+x2);
	}
}

