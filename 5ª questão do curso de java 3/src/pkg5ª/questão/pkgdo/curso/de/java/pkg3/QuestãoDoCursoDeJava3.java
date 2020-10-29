package pkg5ª.questão.pkgdo.curso.de.java.pkg3;

import java.util.Scanner;

public class QuestãoDoCursoDeJava3 {
    public static void Menu(){
        System.out.println("Menu de opções:");
        System.out.println("1 - Média Aritmética");
        System.out.println("2 - Média ponderada");
        System.out.println("3 - Sair");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OP;
        double n1,n2,n3,p1,p2,p3,MA,MP;
        
        do{
            Menu();
            System.out.print("Opção: ");
            OP = input.nextInt();
           switch(OP){
                case 1: System.out.print("Informe a 1ª nota: ");
                        n1 = input.nextDouble();
                        System.out.print("Informe a 2ª nota: ");
                        n2 = input.nextDouble();
                        MA = (n1+n2)/2;
                        System.out.println("A média foi de " + MA);
                        break;
                case 2: System.out.print("Informe a 1ª nota: ");
                        n1 = input.nextDouble();
                        System.out.print("Informe a 2ª nota: ");
                        n2 = input.nextDouble();
                        System.out.print("Informe a 3ª nota: ");
                        n3 = input.nextDouble();
                        System.out.print("Informe o peso da 1ª prova: ");
                        p1 = input.nextDouble();
                        System.out.print("Informe o peso da 2ª prova: ");
                        p2 = input.nextDouble();
                        System.out.print("Informe o peso da 3ª prova: ");
                        p3 = input.nextDouble();
                        MP = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
                        System.out.println("A média foi de " + MP);
                        break;
                case 3: break;
                default: System.out.println("Opção inválida");
           }
        }while(OP != 3);
    }   
}