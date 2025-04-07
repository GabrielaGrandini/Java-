
/******************************************************************************
 * 
8) Desenvolva um programa em Java que simule um sistema de login simples para uma 
conta corrente. O programa deve:Solicitar ao usuário que insira um nome de usuário 
e senha. Comparar o nome de usuário e senha inseridos com um nome de usuário e 
senha predefinidos .Permitir que o usuário tente fazer login no máximo 3 vezes.
Exibir uma mensagem de sucesso se o login for bem-sucedido ou uma mensagem de erro 
se o login falhar após 3 tentativas.

*******************************************************************************/

import java.util.Scanner;
public class Pesquisa8 {
 public static final String Login = "BagAyu123F";
 public static final String Senha = "SalsichaF";

	public static void main(String[] args) {
	   String login, senha;
	    Scanner ler = new Scanner (System.in);
	    
	    for (int i = 0; i <= 3; i++) {
		System.out.println("Entre com o seu login: ");
		login = ler.nextLine ();
		System.out.println("Entre com a sua senha: ");
		senha = ler.nextLine ();
	    	if (login.equals(Login) && senha.equals(Senha)) {
           System.out.println("Sucesso!");
           ler.close ();
           return;
           } else {
            System.out.println("Erro.");
           }
           
        if (i == 2) {
         System.out.println("Erro, número máximo de tentativas atingidas");
            }
	
	} 
	ler.close ();
	}
}
