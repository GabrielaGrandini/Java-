/******************************************************************************

21)Faça um programa que receba a idade, o peso, a altura, a cor dos olhos 
(A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos (P – Preto,
C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre:
A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 

*******************************************************************************/

import java.util.Scanner;
public class Ex21
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int idade = 0, peso = 0, t1 = 0, t4 = 0;
	    double altura = 0, md = 0, por = 0, t3 = 0, t2 = 0, t;
	    char olhos, cabelos;
	    
	    for(int i = 1; i <= 15; i++){
	       System.out.println("Entre com a cor de seus cabelos P – Preto, C- Castanho, L – Louro e R-Ruivo): "); 
	       cabelos = ler.next().charAt(0);
	       System.out.println("Entre com a cor de seus olhos (A – Azul, P- Preto, V- Verde e C- Castanho): "); 
	       olhos = ler.next().charAt(0);
	       System.out.println("Entre com a sua idade: "); 
	       idade = ler.nextInt ();
	       System.out.println("Entre com o seu peso: "); 
	       peso = ler.nextInt ();
	       System.out.println("Entre com a sua altura: "); 
	       altura = ler.nextDouble();
	       
	       /*
	            A média das idades das pessoas com altura inferior a 1,50;
                A porcentagem de pessoas com olhos azuis entre as pessoas analisadas;
                A quantidade de pessoas ruivas que não possuem olhos azuis; 
	       */
	       if (idade > 50 && peso < 60 ){
	           t1 = t1 + 1;
	       } 
	       if   ( altura < 1.50 ) {
	           t2 = t2 + 1;
	       } 
	       if ( olhos == 'A' ) {
	           t3 = t3 + 1;
	       } 
	       if( cabelos == 'R' && olhos != 'A') {
	           t4 = t4 + 1;
	       }
	       //buffer limpeza
	      ler.nextLine();
	    }
	     
	       md = t2 / 15;
	       por = (t3/15) * 100;
	       
	       
	       System.out.println("Está é a quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + t1);
	       System.out.println("Está é a média de pessoas com a altura inferior a 1.50: "+ md);
	       System.out.println("Está é a porcentagem de pessoas com olhos azuis analisadas: " + por);
	       System.out.println("Está é a quantidade de pessoas ruivas que não possuem olhos azuis: " + t4);
	    
		
	}
}
