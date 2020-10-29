package programa.para.calcular.a.transposta.de.uma.matriz.matriz;

import java.util.Scanner;

public class ProgramaParaCalcularATranspostaDeUmaMatrizMatriz {
    public static void Preencher1(int[][]mat){
        Scanner input = new Scanner(System.in);
        int L,C;
        
        for(L = 0;L < mat.length;L++){
            for(C = 0;C < mat[L].length;C++){
                System.out.print("[" + (L+1) + "][" + (C+1) + "] = ");
                mat[L][C] = input.nextInt();
            }
        }
    }
    public static void Preencher2(int[][]mat1,int[][]mat2){
        int L,C;
        
        for(L = 0;L < mat1.length;L++){
            for(C = 0;C < mat1[L].length;C++){
                mat2[C][L] = mat1[L][C] ;
            }
        }
    }
    public static void Exibir(int[][]mat){
        int L,C;
        
        System.out.println("Matriz 2:");
        for(L = 0;L < mat.length;L++){
            for(C = 0;C < mat[L].length;C++){
                System.out.print(mat[L][C] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][]Matriz1;
        Matriz1 = new int[3][4];
        int[][]Matriz2;
        Matriz2 = new int[4][3];
        
        System.out.println("Informe os elementos da 1ª matriz:");
        Preencher1(Matriz1);
        Preencher2(Matriz1,Matriz2);
        Exibir(Matriz2);
    }   
}