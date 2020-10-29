package pkg4ª.questão.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class QuestãoDoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String c;
        double n;
        int contA = 0,contB = 0, contC = 0, contD = 0, contE = 0;
        
        for(int cont = 1;cont <= 75;cont++){
            System.out.print("Informe o código do " + cont + "º aluno: ");
            c = input.nextLine();
            System.out.print("Informe a nota do " + cont + "º aluno: ");
            n = input.nextDouble(); input.nextLine();
            
            if(n == 0|| n <= 2.9){
                contE++;
            }
            else if(n == 3 || n <= 4.9){
                contD++;
            }
            else if(n == 5 || n <= 6.9){
                contC++;
            }
            else if(n == 7 || n <= 8.9){
                contB++;
            }
            else if(n == 9 || n <= 10){
                contA++;
            }
        }
        
        System.out.println("A quantiade de alunos no coceito A é de " + contA);
        System.out.println("A quantiade de alunos no coceito B é de " + contB);
        System.out.println("A quantiade de alunos no coceito C é de " + contC);
        System.out.println("A quantiade de alunos no coceito D é de " + contD);
        System.out.println("A quantiade de alunos no coceito E é de " + contE);
    }   
}