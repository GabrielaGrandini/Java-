/******************************************************************************
 * 
36) Desenvolver um programa com menu para simular uma conta corrente:    
     a) Depósito bancário
     b) Saque
     c) Saldo
     d) Sair
  * A cada ação favor montar o menu novamente.

*******************************************************************************/
import java.util.Scanner;

public class Ex36 
{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo = 0, deposito, saque;
        String opcao;

        do {
            System.out.println("Menu");
            System.out.println("a) Depósito bancário");
            System.out.println("b) Saque");
            System.out.println("c) Saldo");
            System.out.println("d) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.next(); 

            if (opcao.equals("a")) {
                System.out.print("Digite o valor do depósito: R$ ");
                deposito = ler.nextDouble();
                saldo += deposito;
                System.out.println("Depósito realizado com sucesso!");
            } else if (opcao.equals("b")) {
                System.out.print("Digite o valor do saque: R$ ");
                saque = ler.nextDouble();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso!");
                } else {
                    System.out.println("Saldo insuficiente para o saque.");
                }
            } else if (opcao.equals("c")) {
                System.out.println("Seu saldo atual é: R$ " + saldo);
            } else if (opcao.equals("d")) {
                System.out.println("Saindo... Obrigado por usar nosso sistema.");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (!opcao.equals("d")); 

        ler.close();
    }
}



