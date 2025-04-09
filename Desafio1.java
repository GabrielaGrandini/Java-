/******************************************************************************

1- Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário 
digite 0. O programa deve validar se o voto é válido (1, 2, 3) e exibir ao final 
a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.

*******************************************************************************/

import java.util.Scanner;
public class Desafio1
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	    int voto, voto1 = 0, voto2 = 0, voto3 = 0;
	    
	    do {
	        System.out.println(" ----Escolha em quem votar! ---- ");
	        System.out.println(" 1. Fulano ");
	        System.out.println(" 2. Ciclano ");
	        System.out.println(" 3. Jussara ");
	        System.out.println(" 0. Finalizar votação ");
	        voto =  ler.nextInt ();
	        
	        if (voto == 1){
	            voto1++;
	        } else if (voto == 2){
	            voto2++;
	        } else if (voto == 3){
	            voto3++;
	        } else if ( voto == 0){
	            System.out.println("A votação está sendo encerrada... Aguarde um momento");
	        } else {
	            System.out.println("Candidato inválido!");
	        }
	          
	    } while (voto != 0);
	    
	       System.out.println("Cadidato 1 obteve: " + voto1++ + " votos" );
	       System.out.println("Cadidato 2 obteve: " + voto2++ + " votos" );
	       System.out.println("Cadidato 3 obteve: " + voto3++ + " votos" );
	       
	       if ( voto1 > voto2 && voto1 > voto3){
	           System.out.println("O vencedor das eleições foi Fulano!");
	            }else if (voto1 == voto2 && voto1 > voto3){
	            System.out.println("Empate: Fulano e Ciclano");
	            } else if (voto1 == voto3 && voto1 > voto2){
	            System.out.println("Empate: Fulano e Jussara!");
	            } else if (voto1 < voto2 && voto2 > voto3) {
	           System.out.println("O vencedor das eleições foi Ciclano!");
	            }else if (voto3 == voto2 && voto2 > voto1){
	            System.out.println("Empate: Ciclano e Jussara");
	            }else if (voto1 < voto3 && voto2 > voto3){
	           System.out.println("O vencedor das eleições foi Jussara!");
	            }else if (voto1 == voto2 && voto2 == voto3){
	           System.out.println("Todos os canditados empataram!");
	            }
	    
	     ler.close();
	}
}
