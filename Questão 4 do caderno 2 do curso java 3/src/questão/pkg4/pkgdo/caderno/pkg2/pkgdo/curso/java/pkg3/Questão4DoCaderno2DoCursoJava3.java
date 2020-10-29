package questão.pkg4.pkgdo.caderno.pkg2.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão4DoCaderno2DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]VetA = new int[5];
        int[]VetB = new int[5];
        int num,cont,cont2 = 4;
        
        for(cont = 0;cont < VetA.length;cont++){
            System.out.print("Informe número do " + (cont+1) + "º elemento de A: ");
            num = input.nextInt();
            VetA[cont] = num;
        }
        
        for(cont = 0;cont < VetB.length;cont++){
            System.out.print("Informe número do " + (cont+1) + "º elemento de B: ");
            num = input.nextInt();
            VetB[cont] = num;
        }
        
        for(cont = 0;cont < VetA.length;cont++){
            VetA[cont] = VetA[cont] - VetB[cont2];
            cont2--;
        }
        
        for(cont = 0;cont < VetA.length;cont++){
            System.out.println("O resultado das subtrações é de " + VetA[cont]);
        }
    }   
}