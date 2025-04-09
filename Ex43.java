/******************************************************************************

43 - Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

*******************************************************************************/

import java.util.Scanner; 
public class Ex43
{
	public static void main(String[] args) {
	    Scanner a = new Scanner (System.in);
	    double si, aumento, sa, sci, sf, desconto;
	    
		System.out.println("Entre com o seu salário: ");
		si = a.nextInt ();
	
	    aumento = si * 0.15;
	    sa = aumento + si;
	   
	    sci = sa * 0.08;
	    sf =  sa - sci;
	    
	    System.out.println("Este é o salário inicial: R$" +si);
	    System.out.println("Este é o salário com aumento: R$" +sa);
	    System.out.println("Este é o salário final (descontado 8% dos impostos): R$" +sf);
	}
}