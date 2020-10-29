package questão.pkg1.pkgdo.caderno.pkg2.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão1DoCaderno2DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]Vetnome = new String[10];
        int[]Vetcodigo = new int[10];
        double[]Vetpreco = new double[10];
        String nome;
        double preco,novopreco;
        int cont,codigo;
        
        for(cont = 0;cont < Vetnome.length;cont++){
            System.out.print("Informe o nome do " + (cont+1) + "º produto: ");
            nome = input.nextLine();
            Vetnome[cont] = nome;
            System.out.print("Informe o código do " + (cont+1) + "º produto: ");
            codigo = input.nextInt();
            Vetcodigo[cont] = codigo;
            System.out.print("Informe o preço do " + (cont+1) + "º produto: ");
            preco = input.nextDouble(); input.nextLine();
            Vetpreco[cont] = preco;
        }
        
        for(cont = 0;cont < Vetnome.length;cont++){
            if(Vetcodigo[cont]%2 == 0 && Vetpreco[cont] > 1000){
                novopreco = Vetpreco[cont] * 0.2 + Vetpreco[cont];
                Vetpreco[cont] = novopreco;
            }
            else if(Vetcodigo[cont]%2 == 0){
                novopreco = Vetpreco[cont] * 0.15 + Vetpreco[cont];
                Vetpreco[cont] = novopreco;
            }
            else if(Vetpreco[cont] > 1000){
                novopreco = Vetpreco[cont] * 0.1 + Vetpreco[cont];
                Vetpreco[cont] = novopreco;
            }
        }
        
        for(cont = 0;cont < Vetnome.length;cont++){
            System.out.println("O nome do " + (cont+1) + "º produto é " + Vetnome[cont]);
            System.out.println("O código do " + (cont+1) + "º produto é " + Vetcodigo[cont]);
            System.out.println("O preço do " + (cont+1) + "º produto é " + Vetpreco[cont]);
        }
    }   
}