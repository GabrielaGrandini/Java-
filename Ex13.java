/******************************************************************************

Ex13 - Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
-
 - Abaixo de 100m² = TERRENO POPULAR
 - Entre 100m² e 500m² = TERRENO MASTER
 - Acima de 500m² = TERRENO VIP
 
*******************************************************************************/

import java.util.Scanner; 
public class Ex13
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int l, c, a;
	    
		System.out.println("Entre com a largura do terreno em metros: ");
		l = ler.nextInt ();
		System.out.println("Entre com o comprimento do terreno em metros: ");
		c = ler.nextInt ();
		
		a = l * c;
		
		if (a < 100) {
		   System.out.println("Seu terreno é popular, pois mede " + a + " m²");
		}else if (a >= 100 && a < 500){
		System.out.println("Seu terreno é Master, pois mede " + a + " m²");
		}else {
		    System.out.println("Seu terreno é VIP, pois mede " + a + " m²");
		}
	}

}
