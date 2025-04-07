/******************************************************************************
35) Faça um programa que leia o nome e o valor de 10 produtos, calcule o valor 
total da compra e após escolha a forma de pagamento:

 1 - À Vista em Dinheiro ou Pix, recebe 8% de desconto.

 2 - À Vista no cartão de crédito, recebe 3% de desconto.

 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros.

 4 - Parcelado no cartão em três vezes ou até 10 parcelas, preço normal do
 produto mais juros de 10%.

 * Montar um menu com os itens acima para o usuário escolher a forma de pagamento
  e mostrar a lista dos produtos comprados e o valor a ser pago.


*******************************************************************************/

import java.util.Scanner;
public class Ex35
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int i = 0;
	    String produto;
	    double valor, p1 = 0, total1, total;
	    char pg;
	    
	    do {
	        System.out.println("Entre com o nome produto: ");
	        produto = ler.nextLine  ();
	        System.out.println("Entre com o valor deste produto: ");
	        valor = ler.nextDouble ();
	        
	         p1 += valor;
	        i++;
	        ler.nextLine();
	        
	    }  while ( i <= 1 );
	    
	    System.out.println("Valor total " + p1);
	    
	     System.out.println("Segue as formas de pagamento: ");
	     System.out.println("[P] Pix, com 8% de desconto, [V] À vista no cartão com 4% de desconto, [N] Parcelado 2 vezes, sem juros, [J] Parcelado, com juros de 10%: ");
	     pg = ler.next().charAt(0);
	     
	     if (pg == 'P'){
	         total1 = (0.08 * p1);
	         total = p1 - total1;
	         System.out.println ("O total a pagar pelo produto é: " + total);
	         
	     } else if (pg == 'V'){
	         total1 = (0.04 * p1);
	         total = p1 - total1;
	         System.out.println ("O total a pagar a vista pelo produto é: " + total);
	         
	     } else if (pg == 'N'){
	         System.out.println ("O total a pagar pelo produto é: " + p1);
	         
	     }	else if (pg == 'J'){
	        total1 = 0.1 * p1;
	         total = p1 + total1;
	         System.out.println ("O total a pagar pelo produto é: " + total);
	   
	     }
	}
}