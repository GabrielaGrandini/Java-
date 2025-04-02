/******************************************************************************

23)  Faça um programa que usando laços de repetição receba a idade e o peso de 15 pessoas.
Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. As faixas etárias
são: de 1 a 10 anos, de ll a 20 anos, de 21 a 30 anos e maiores de 31 anos.

*******************************************************************************/

import java.util.Scanner;
public class Ex23
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int idade, peso, c = 0, j = 0, a = 0, v = 0;
	    double md1 = 0, md2 = 0, md3 = 0, md4 = 0;
	    
	    for(int i = 1; i <= 15; i++){
	        System.out.println("Entre com a sua idade: ");
	        idade = ler.nextInt ();
	        System.out.println("Entre com o seu peso: ");
	        peso = ler.nextInt ();
	        
	        if (idade >= 1 && idade <=10){
	            md1 = (md1 + peso);
	            c++;
	        }else if (idade >= 11 && idade <= 20){
	            md2 = (md2 + peso);
	            j++;
	        } else if  (idade >= 21 && idade <= 30){
	            md3 = (md3 + peso);
	            a++;
	        } else if ( idade >= 31){
	           md4 = (md4 + peso);
	            v++;
	        }
	    }
	    
	    md1 = md1 / c;
	    md2 = md2 / j;
	    md3 = md3 / a;
	    md4 = md4 / v;
	    
	    System.out.println("A média da faixa etária entre 1 a 10 anos é: " + md1);
	    System.out.println("A média da faixa etária entre 11 a 20 anos é: " + md2);
		System.out.println("A média da faixa etária entre 21 a 30 anos é: " + md3);
		System.out.println("A média da faixa etária superior a 31 anos é: " + md4);
	} 

}
