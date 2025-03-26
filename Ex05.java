/******************************************************************************


Ex05 - Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.

*******************************************************************************/

import java.util.Scanner;
public class Ex05

{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    double ve, np, s, e, sm;
	    
		System.out.println("Informe o seu salário: ");
		s = ler.nextDouble ();
		System.out.println("Informe o valor do empréstimo: ");
		ve = ler.nextDouble ();
		System.out.println("Informe a quantidade de parcelas a se realizadas: ");
		np = ler.nextDouble ();
		
		sm = s * 0.3;
		e = ve / np;
		
		if (sm < e) {
		    System.out.println("Seu empréstimo foi negado!");
		} else {
		    System.out.println("Seu empréstimo foi aprovado!");
		}
		
	}
}
