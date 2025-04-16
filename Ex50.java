/******************************************************************************

50. Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma
compra no final mostre o valor gasto e o imposto.

a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar
imposto de 0.8%.

b) Mostrar os valores finais com e sem imposto.

*******************************************************************************/

import java.util.Scanner;
public class Ex50
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double[] preco = new double [10];
	    double imposto, impostor, total = 0;
	    
	    for (int i = 0; i < 10; i++){
		System.out.println("Entre com o valor do " + (i + 1) + "º produto: ");
		preco[i] = ler.nextDouble ();
		
		total += preco[i];
	}
	    for (int i = 0; i < 1; i++){
		    if (total > 1200) {
		        imposto = total * 2.5;
		        impostor = imposto + total;
		        System.out.println("O valor total do imposto é: R$" +imposto);
		        System.out.println("O valor total a pagar pelo produto com imposto é: R$" + impostor);
		        System.out.println("O valor total a pagar pelo produto sem imposto é: R$" + total);
		    } else {
		        imposto = total * 0.8;
		        impostor = imposto + total;
		        System.out.println("O valor total do imposto é: R$" +imposto);
		        System.out.println("O valor total a pagar pelo produto é: R$" + impostor);
		        System.out.println("O valor total a pagar pelo produto sem imposto é: R$" + total);
		    }
	    }
	}
}