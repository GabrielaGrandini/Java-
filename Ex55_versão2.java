/******************************************************************************
Desenvolver um sistema bancário básico que permita criar contas para múltiplos usuários, 
realizar depósitos, saques e consultar saldos, utilizando apenas arrays e estruturas de controle fundamentais do Java.

String[] nomes = new String[5];
double[] saldos = new double[5];
double[] conta = new double [5];

Descrição:

 - Permitir o cadastro de novos usuários, associando-os a uma conta bancária identificada por um número único.
 - Cada usuário deve ter um nome e um número de conta.
 - As informações dos usuários devem ser armazenadas em um array de objetos.
 - As informações das contas (número da conta e saldo) devem ser armazenadas em um array de objetos separado.
 - Permitir que o usuário realize depósitos em sua conta, aumentando o saldo correspondente.
 - Permitir que o usuário realize saques, diminuindo o saldo correspondente, desde que haja saldo suficiente.
 - Permitir que o usuário consulte o saldo de sua conta.
 - Coletar entradas do usuário e exibir mensagens.
 - O programa deve oferecer um menu com as opções disponíveis e permitir que o usuário escolha qual operação deseja realizar.
 - O programa deve continuar executando até que o usuário escolha a opção de sair.
 
Requisitos Técnicos:

 - Utilizar apenas arrays e estruturas de controle básicas do Java(como for, if, else, while, switch).
 - Implementar validações básicas, como verificar se o número da conta existe antes de realizar operações.
 - Exibir mensagens claras para o usuário, indicando o sucesso ou falha das operações realizadas.
 
*******************************************************************************/

import java.util.Scanner;
public class Ex55_versão2
{
	public static void main(String[] args) {
	    Scanner ler = new Scanner (System.in);
	     String[] nomes = new String[5];
        double[] saldos = new double[5];
        int contas = 0, escolha;
    
     do {
        System.out.println("=====Sistema bancário=====");
        System.out.println("1. Criar nova conta");
        System.out.println("2. Depositar");
        System.out.println("3. Sacar");
        System.out.println("4. Consultar saldo");
        System.out.println("5. Sair");
	    escolha = ler.nextInt ();
	    
	    ler.nextLine();
	    switch (escolha) {
                case 1:
                    if (contas < 5) {
                        System.out.print("Digite o nome do cliente: ");
                        String nome = ler.nextLine();
                        nomes[contas] = nome;
                        saldos[contas] = 0.0;
                        contas++;
                        System.out.println("Conta criada com sucesso!");
                    } else {
                        System.out.println("Limite de contas atingido.");
                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeDeposito = ler.nextLine();
                    boolean depositoEncontrado = false;
                    for (int i = 0; i < contas; i++) {
                        if (nomes[i].equals(nomeDeposito)) {
                            System.out.print("Digite o valor a ser depositado: R$ ");
                            double valorDeposito = ler.nextDouble();
                            saldos[i] += valorDeposito;
                            System.out.println("Depósito realizado com sucesso!");
                            depositoEncontrado = true;
                            break;
                        }
                    }
                    if (!depositoEncontrado) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeSaque = ler.nextLine();
                    boolean saqueEncontrado = false;
                    for (int i = 0; i < contas; i++) {
                        if (nomes[i].equals(nomeSaque)) {
                            System.out.print("Digite o valor a ser sacado: R$ ");
                            double valorSaque = ler.nextDouble();
                            if (saldos[i] >= valorSaque) {
                                saldos[i] -= valorSaque;
                                System.out.println("Saque realizado com sucesso!");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            saqueEncontrado = true;
                            break;
                        }
                    }
                    if (!saqueEncontrado) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeConsulta = ler.nextLine();
                    boolean consultaEncontrada = false;
                    for (int i = 0; i < contas; i++) {
                        if (nomes[i].equals(nomeConsulta)) {
                            System.out.println("Saldo de " + nomes[i] + ": R$ " + saldos[i]);
                            consultaEncontrada = true;
                            break;
                        }
                    }
                    if (!consultaEncontrada) {
                        System.out.println("Cliente não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo... Obrigada por usar o nosso sistema!");
                    ler.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
     }
	} while (escolha != 5);
  }
}