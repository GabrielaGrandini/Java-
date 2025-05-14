/******************************************************************************
Desenvolver um sistema bancC!rio bC!sico que permita criar contas para mC:ltiplos usuC!rios,
realizar depC3sitos, saques e consultar saldos, utilizando apenas arrays e estruturas de controle fundamentais do Java.

String[] nomes = new String[5];
double[] saldos = new double[5];
double[] conta = new double [5];

DescriC'C#o:

 - Permitir o cadastro de novos usuC!rios, associando-os a uma conta bancC!ria identificada por um nC:mero C:nico.
 - Cada usuC!rio deve ter um nome e um nC:mero de conta.
 - As informaC'C5es dos usuC!rios devem ser armazenadas em um array de objetos.
 - As informaC'C5es das contas (nC:mero da conta e saldo) devem ser armazenadas em um array de objetos separado.
 - Permitir que o usuC!rio realize depC3sitos em sua conta, aumentando o saldo correspondente.
 - Permitir que o usuC!rio realize saques, diminuindo o saldo correspondente, desde que haja saldo suficiente.
 - Permitir que o usuC!rio consulte o saldo de sua conta.
 - Coletar entradas do usuC!rio e exibir mensagens.
 - O programa deve oferecer um menu com as opC'C5es disponC-veis e permitir que o usuC!rio escolha qual operaC'C#o deseja realizar.
 - O programa deve continuar executando atC) que o usuC!rio escolha a opC'C#o de sair.

Requisitos TC)cnicos:

 - Utilizar apenas arrays e estruturas de controle bC!sicas do Java(como for, if, else, while, switch).
 - Implementar validaC'C5es bC!sicas, como verificar se o nC:mero da conta existe antes de realizar operaC'C5es.
 - Exibir mensagens claras para o usuC!rio, indicando o sucesso ou falha das operaC'C5es realizadas.

*******************************************************************************/

import java.util.Scanner;
public class Ex55
{
	public static void main(String[] args) {
        String[] nomes = new String[5];
        double[] saldos = new double[5];
        int contas = 0, escolha;

        Scanner ler = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.print("Escolha o que deseja fazer: ");
            escolha = ler.nextInt();
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
        }
    }
}