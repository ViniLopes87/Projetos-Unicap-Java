package programa.de.uma.matriz.quadrado.mágico.matriz;

import java.util.Scanner;

public class ProgramaDeUmaMatrizQuadradoMágicoMatriz {
    public static void Preencher(int[][]mat){
        Scanner input = new Scanner(System.in);
        int L,C;
        
        System.out.println("Informe os elementos da matriz:");
        for(L = 0;L < mat.length;L++){
            for(C = 0;C < mat[L].length;C++){
                System.out.print("[" + (L+1) + "][" + (C+1) + "] = ");
                mat[L][C] = input.nextInt();
            }
        }
    }
    public static int Calcular(int[][]mat){
        int L,C,i,somaL = 0,somaC = 0,somadig1 = 0,somadig2 = 0;
        
        for(L = 0;L < mat.length;L++){
            somaL = 0;
            for(C = 0;C < mat[L].length;C++){
                somaL = somaL + mat[L][C];
            }
        }
        for(C = 0;C < mat[0].length;C++){
            somaC = 0;
            for(L = 0;L < mat.length;L++){
                somaC = somaC + mat[L][C];
            }
        }
        for(i = 0;i < mat.length;i++){
            somadig1 = somadig1 + mat[i][i];
            somadig2 = somadig2 + mat[i][mat.length - 1 - i];
        }
        if(somaL == somaC && somadig1 == somadig2 && somaL == somadig1){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,QM;
        
        System.out.print("Informe a ordem da matriz: ");
        n = input.nextInt();
        
        int[][]Matriz;
        Matriz = new int[n][n];
        
        Preencher(Matriz);
        QM = Calcular(Matriz);
        
        if(QM == 0){
            System.out.println("A matriz é um quadrado mágico");
        }
        else{
            System.out.println("A matriz não é um quadrado mágico");
        }
    }
}