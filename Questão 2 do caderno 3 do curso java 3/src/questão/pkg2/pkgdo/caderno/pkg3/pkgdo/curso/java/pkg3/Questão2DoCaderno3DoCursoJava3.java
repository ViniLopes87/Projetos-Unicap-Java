package questão.pkg2.pkgdo.caderno.pkg3.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão2DoCaderno3DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][]mat = new int [10][10];
        int L,C;
        double media = 0;
        
        for(L = 0;L < 10;L++){
            for(C = 0;C < 10;C++){
                System.out.print("Informe o valor da posição [" + (L+1) + "] [" + (C+1) + "]: ");
                mat[L][C] = input.nextInt();
            }
        }
        
        for(L = 0;L < 10;L++){
            media = media + mat[L][L];
        }
        
        media = media/10;
        System.out.println("A média dos valores da diagonal principal é de " + media);
    }
}