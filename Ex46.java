/******************************************************************************
 * 
46 - Desenvolver um programa com  Ao iniciar o programa, exiba o seguinte menu de opções:

--- Calculadora de Áreas --- 
1. Calcular Área do Retângulo 
2. Calcular Área do Triângulo 
3. Calcular Área do Círculo 
0. Sair 
-- Escolha uma opção:

*******************************************************************************/

import java.util.Scanner; 
public class Ex46
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int opcao;
	    double ar, at, br, bt, ht, hr, r;
	    double x = 2;
	    
		do {
		    	System.out.println("--- Calculadora de Áreas --- ");
        		System.out.println("1. Calcular Área do Retângulo ");
        		System.out.println("2. Calcular Área do Triângulo");
        		System.out.println("3. Calcular Área do Círculo ");
        		System.out.println("0. Sair  ");
        		System.out.println("-- Escolha uma opção: ");
        		
        		opcao = ler.nextInt ();
        		switch (opcao) {
        		    case 1:
        		        System.out.println("Informe a base do retângulo: ");
        		        br = ler.nextInt ();
        		        System.out.println("Informe altura do retângulo: ");
        		        hr = ler.nextInt ();
        		        ar = br * hr;
        		        System.out.println("Está é sua área: " + ar);
        		         break;
        		   case 2:
        		        System.out.println("Informe a base do triângulo: ");
        		        bt = ler.nextInt ();
        		        System.out.println("Informe altura do triângulo: ");
        		        ht = ler.nextInt ();
        		        at = (bt * ht) / 2;
        		        System.out.println("Está é sua área: " + at);
        		        break;
        		    case 3: 
        		        System.out.println("Entre com o raio de sua circunferência: ");
        		        r = ler.nextInt ();
        		        System.out.println("A sua área é: " + Math.pow (r, x) * 3.14);
        		        break;
		            } 
		  
		        } while (opcao != 0 );
		
		        ler.close ();
		
	}
}