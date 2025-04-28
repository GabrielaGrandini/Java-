/******************************************************************************
1) Desenvolver o jogo da Forca. Favor seguir algumas regras:
    a) Pedir para o jogador 1 digitar a palavra que será adivinhada pelo jogador 2
    b) Digitar o nome do jogador 2 para iniciar o jogo.
    c) A cada letra digitada mostrar a letra certa / errada e um desenho mostrando
    a perda de uma parte do corpo, se a letra estiver errada.
    d) O jogador 2 terá 5 tentativas de adivinhar a palavra correta.
    e) Se o jogo finalizar, mostrar o nome do jogador 2 e se ele ganhou ou perdeu.
*******************************************************************************/
import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome1, nome2;
        String palavrasecreta;
        int tentativa = 5;
        int acertos = 0;
        char letra;
        

        System.out.println("Jogador 1, digite a palavra que o jogador 2 tentará adivinhar: ");
        palavrasecreta = ler.nextLine().toLowerCase();

     
        System.out.print("\033[H\033[2J");
        

      
        System.out.println("Digite o nome do jogador 2: ");
        nome2 = ler.nextLine();

    
        char[] letras = new char[palavrasecreta.length()];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = '_'; 
        }

        System.out.println("===INÍCIO===");

        while (tentativa > 0 && acertos < palavrasecreta.length()) {
         
            System.out.print("Palavra: ");
            for (char letraO : letras) {
                System.out.print(letraO + " ");
            }
            System.out.println("\nTentativas restantes: " + tentativa);
            System.out.println("Digite uma letra: ");
            letra = ler.nextLine().toLowerCase().charAt(0);

            int novosAcertos = 0; 

          
            for (int i = 0; i < palavrasecreta.length(); i++) {
                if (palavrasecreta.charAt(i) == letra && letras[i] == '_') {
                    letras[i] = letra;  
                    novosAcertos++; 
                    acertos++;  
                }
            }

         
            if (novosAcertos == 0) {
                tentativa--;  
                desenharForca(tentativa); 
            }
        }

 
        if (acertos == palavrasecreta.length()) {
            System.out.println(nome2 + ", você ganhou!");
        } else {
            System.out.println(nome2 + ", você perdeu!");
            System.out.println("A palavra era: " + palavrasecreta);
        }
    }


    public static void desenharForca(int tentativa) {
        if (tentativa == 0) {
            System.out.println("                _____");
            System.out.println("                |   |");
            System.out.println("                |   O");
            System.out.println("                |   ");
            System.out.println("                |   ");
            System.out.println("                |   ");
            System.out.println("              __|__ ");
        } else if (tentativa == 1) {
            System.out.println("                _____");
            System.out.println("                |   |");
            System.out.println("                |   O");
            System.out.println("                |   |");
            System.out.println("                |   ");
            System.out.println("                |   ");
            System.out.println("              __|__ ");
        } else if (tentativa == 2) {
            System.out.println("                _____");
            System.out.println("                |   |");
            System.out.println("                |   O");
            System.out.println("                |  /|");
            System.out.println("                |   ");
            System.out.println("                |   ");
            System.out.println("              __|__ ");
        } else if (tentativa == 3) {
            System.out.println("                _____");
            System.out.println("                |   |");
            System.out.println("                |   O");
            System.out.println("                |  /|\\");
            System.out.println("                |   ");
            System.out.println("                |   ");
            System.out.println("              __|__ ");
        } else if (tentativa == 4) {
            System.out.println("                _____");
            System.out.println("                |   |");
            System.out.println("                |   O");
            System.out.println("                |  /|\\");
            System.out.println("                |  / \\");
            System.out.println("                |   ");
            System.out.println("              __|__ ");
        }
    }
}

