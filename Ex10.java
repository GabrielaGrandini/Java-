/******************************************************************************

Ex10 - Construa um algoritmo que determine
quanto será gasto para encher o tanque de um carro (VG), sabendo-se que o preço
da gasolina é de R$ 1,80 e o preço do álcool é de R$ 1,00. O usuário fornecerá
os seguintes dados: Tipo de carro (TC) (G – gasolina ou A – álcool) e
Capacidade do tanque (CT), em litros

*******************************************************************************/

import java.util.Scanner;
public class Ex10
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    String tc;
	    double ct, vt; 
	    
		System.out.println("Informe qual é o tipo do tanque do carro (Gasolina ou Álcool): ");
		tc = ler.nextLine ();
		System.out.println("Informe qual é a capacidade do tanque: ");
		ct = ler.nextDouble ();
		
		if (tc == "Gasolina"){
		    vt = ct * 1.80;
		    System.out.println("Será gasto está quantia para encher o tanque do carro R$ " + vt);
		} else {
		    vt = ct * 1.00;
		    System.out.println("Será gasto está quantia para encher o tanque do carro R$ " + vt);
		}
	}
}
