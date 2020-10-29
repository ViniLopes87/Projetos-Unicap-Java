package programa.para.verificar.se.é.ou.não.uma.matriz.simétrica.matriz;

import java.util.Scanner;

public class ProgramaParaVerificarSeÉOuNãoUmaMatrizSimétricaMatriz {
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
    public static int Verificar(int[][]mat1,int[][]mat2){
        int aux = 0,L,C;
        
        for(L = 0;L < mat1.length;L++){
            for(C = 0;C < mat1[L].length;C++){
                if(mat1[L][C] == mat2[L][C]){
                    aux = aux + 1;
                }
                else{
                    aux = aux + 0;
                }
            }
        }
        if(aux/(Math.pow(mat1.length, 2)) == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int V,n;
        
        System.out.print("Informe a ordem da matriz: ");
        n = input.nextInt();
        
        int[][]Matriz1;
        Matriz1 = new int[n][n];
        int[][]Matriz2;
        Matriz2 = new int[n][n];
        
        System.out.println("Informe os elementos da 1ª matriz:");
        Preencher1(Matriz1);
        Preencher2(Matriz1,Matriz2);
        V = Verificar(Matriz1,Matriz2);
        
        if(V == 1){
            System.out.println("A matriz é simétrica");
        }
        else{
            System.out.println("A matriz não é simétrica");
        }
    }   
}