/******************************************************************************


Ex09 - Construa um algoritmo para calcular o
valor a ser pago pelo período de estacionamento do automóvel (PAG). O usuário
entra com os seguintes dados: hora (HE) e minuto (ME) de entrada, hora (HS) e
minuto (MS) de saída. Sabe-se que este estacionamento cobra hora cheia, ou
seja, se passar um minuto ele cobra a hora inteira. O valor cobrado pelo
estacionamento é: 
•R$ 4,00 para 1 hora de estacionamento 
•R$ 6,00 para 2 horas de estacionamento 
•R$ 1,00 por hora adicional (acima de 2 horas)

*******************************************************************************/

import java.util.Scanner;
public class Ex09
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int he, me, hs, ms, th, tm, vt;
	    
		System.out.println("Entre com a hora de entrada: ");
		he = ler.nextInt ();
		System.out.println("Entre com os minutos desta hora: ");
		me = ler.nextInt ();
		System.out.println("Entre com a hora de saída: ");
		hs = ler.nextInt ();
		System.out.println("Entre com os minutos desta hora: ");
		ms = ler.nextInt ();
		
		th = hs - he;
		tm = ms - me + (th*60);
		
		if (tm >= 60 && tm < 120 ){
		 System.out.println("O valor a pagar pelo o tempo estacionado é R$ 4,00");
	 } else if (tm >= 120 && tm < 180)  {
	     System.out.println("O valor a pagar pelo o tempo estacionado é R$ 6,00");
	 } else {
	     vt = th * 1;
	     System.out.println("O valor a pagar pelo tempo estacionado é R$ " + vt);
	 }
}
}
