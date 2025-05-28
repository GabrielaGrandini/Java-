/*******************************************************************************
 4. Crie um algoritmo que leia uma matriz 3x3 e crie uma nova matriz que seja a matriz
transposta da primeira (troque as linhas por colunas)
******************************************************************************/


public class Matriz4 {

    public static void main(String[] args) {
        int linha =3, coluna =3;
        int  [][] matriz= new int [3][3];
        
        matriz [0][0] = 1;
		matriz [0][1] = 2;
		matriz [0][2] = 3;
		matriz [1][0] = 4;
		matriz [1][1] = 5;
		matriz [1][2] = 6;
		matriz [2][0] = 7;
		matriz [2][1] = 8;
		matriz [2][2] = 9;
        
            nm(matriz);
            
            int[][] transposta = new int [coluna][linha];
            for (int i = 0; i < linha; i++){
                 for (int j = 0; j < coluna; j++){
                     transposta[j][i] = matriz [i][j];
                 }
            }
            
            nm(transposta);
        }
        
        public static void nm(int[][] matriz) {
            System.out.println("A matriz é: ");
            for(int[] linha : matriz){
                for (int coluna : linha){
                    System.out.print(coluna + "     ");
                }
                System.out.println();
            }
        }
    }  