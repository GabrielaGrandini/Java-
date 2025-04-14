/******************************************************************************

4 - Caixa eletrônico com cédulas disponíveis
Simule um caixa eletrônico. O usuário informa o valor do saque, e o programa 
informa quantas cédulas de R$100, R$50, R$20, R$10 e R$5 serão entregues, com 
base nas cédulas disponíveis. Caso não seja possível realizar o saque com as 
cédulas, exiba uma mensagem de erro.

*******************************************************************************/

import java.util.Scanner;
public class Desafio4
{
	public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    int saque, qntd, cedula = 100;
    
		System.out.print("Informe o valor do saque: R$");
		saque = ler.nextInt ();
	    

		if (saque <= 0 || saque% 5 != 0) {
		     System.out.println("ERRO");
		     return;
		}
		
		while (saque > 0) {
		    qntd = saque / cedula;
		    
		    if (qntd > 0){
		        System.out.println("Aqui está: "+ qntd + " cédula(s) de R$" +cedula);
                saque = saque % cedula;
		    }
		
		    
	    	if (cedula == 100) {
		    cedula = 50;
	      } else if (cedula == 50) {
		    cedula = 20;
		    } else	if (cedula == 20) {
		    cedula = 10;
		    } else if (cedula == 10) {
		    cedula = 5;
		    } else {
		    break;
		    
		    }
		}
		    if (saque != 0) {
		    System.out.println("ERRO");
		    }
		
	}
}

