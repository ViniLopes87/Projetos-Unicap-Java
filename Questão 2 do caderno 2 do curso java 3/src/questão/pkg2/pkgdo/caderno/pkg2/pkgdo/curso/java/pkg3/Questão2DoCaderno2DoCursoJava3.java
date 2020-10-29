package questão.pkg2.pkgdo.caderno.pkg2.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão2DoCaderno2DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[]Vet = new int[5];
        int num,cont,total = 0;
        
        for(cont = 0;cont < Vet.length;cont++){
            System.out.print("Informe o " + (cont+1) + "º número: ");
            num = input.nextInt();
            Vet[cont] = num;
        }
        
        for(cont = 0;cont < Vet.length;cont++){
            total = total + Vet[cont];
        }
        System.out.println("A soma dos valores digitado foi de " + total);
    }   
}