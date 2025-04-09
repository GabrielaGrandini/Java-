/******************************************************************************

45 - A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra. 

*******************************************************************************/

import java.util.Scanner;
public class Ex45
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double nq = 1, np = 1, nr = 1, qq, qp, qr, qs;
	    
		System.out.println("Entre com a quantidade de sanduíches a fazer: ");
		qs = ler.nextInt ();
		
		if (qs > 1){
		qq = qs * nq * 0.1;
		qp = np * qs * 0.05;
		qr = nr * qs * 0.1;
		System.out.println("Está é a quantidade necessária de queijo para a compra: " +qq+ " kg");
		System.out.println("Está é a quantidade necessária de presunto para a compra: "+qp +" kg");
		System.out.println("Está é a quantidade necessária de rodela para a compra: "+qr +" kg");
		} else {
		System.out.println("A quantidade necessária de queijo para a compra: 0.1 kg");
		System.out.println("A quantidade necessária de presunto para a compra: 0.05 kg");
		System.out.println("A quantidade necessária de rodela para a compra: 0.1 kg");
		}


	}
}