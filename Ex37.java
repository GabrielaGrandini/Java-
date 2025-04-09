/******************************************************************************

37 - Faça um algoritmo para calcular quantas ferraduras são necessárias para
equipar todos os cavalos comprados para um haras.

*******************************************************************************/

import java.util.Scanner;
public class Ex37
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int cavalos, ferraduras, multi;
	    
	    
		System.out.println("Entre com a quantidade de cavalos comprados: ");
		cavalos = ler.nextInt ();
		
		multi =  cavalos * 4;
		
		System.out.println("Está e a quantidade de ferraduras necessárias para equipar todos os valos: " + multi);
		
	}
}