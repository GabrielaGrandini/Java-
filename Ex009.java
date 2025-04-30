/******************************************************************************
Exercicio 009
Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em
metros quadrados da área a ser pintada.
Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e
que a tinta é vendida em latas de 18 litros, que custam R$ 80,00.
Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

*******************************************************************************/

import java.lang.Math;
import java.util.Scanner;
public class Ex009
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int metrosq;
	    double preco, qntdlatas, latas;  ;
	    
	    System.out.println("Entre com o tamanho do lugar que irá ser pintado em metros quadrados: ");
	    metrosq = ler.nextInt ();
	    
	    qntdlatas = metrosq/ 3;
	    latas = (Math.ceil(qntdlatas/ 18));
	    preco = latas * 80;
	    
	    System.out.println("A quantidade de latas a serem usadas: " + latas);
	    System.out.println("O preço total a pagar será: R$" + preco);
	}
}