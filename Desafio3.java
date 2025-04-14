
/******************************************************************************

3 - Cadastro de notas com classificação
O programa deve permitir o cadastro de várias notas (entre 0 e 10). A cada nota
inserida, o sistema deve classificar como:

Excelente (>= 9)
Bom (>= 7)
Regular (>= 5)
Insuficiente (< 5)
*Quando o usuário digitar -1, o programa termina e exibe a média geral e a 
contagem de cada classificação.

*******************************************************************************/

import java.util.Scanner;
public class Desafio3
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int nota, notae = 0, notab = 0, notar = 0, notai = 0;
	    double media, media2, soma, in = 0, e = 0, b = 0, r = 0; 
	    
	    
	   do {
		System.out.println("Entre com a nota de  0 a 10: ");
		nota = ler.nextInt ();
		
			
		 if (nota >= 9 && nota <= 10) {
		    notae = (notae + nota);
		    e++;
		 } else if ( nota >= 7 && nota < 9){
		     notab = (notab + nota);
		     b++;
		 } else if (nota >= 5 && nota < 7){
		     notar = (notar + nota);
		     r++;
		 } else if ( nota >= 0 && nota < 5) {
		     notai = (notai + nota);
		     in++;
		 } else if (nota == -1) {
		   System.out.println("Encerrando o programa...");
		 } else {
		     System.out.println("Nota inválida!");
		 }
	   }
		 
      while (nota != -1);
      soma = e + b + r + in;
      media = (notae + notab + notar + notai);
      media2 = media / soma;
      System.out.println("A quantidade de notas excelentes é: " + e++);
      System.out.println("A quantidade de notas boas é: " + b++);
      System.out.println("A quantidade de notas regulares é: " + r++);
      System.out.println("A quantidade de notas insuficientes é: " + in++);
      System.out.println("A média das notas são: " + media2);
      
       ler.close ();
	} 
}

