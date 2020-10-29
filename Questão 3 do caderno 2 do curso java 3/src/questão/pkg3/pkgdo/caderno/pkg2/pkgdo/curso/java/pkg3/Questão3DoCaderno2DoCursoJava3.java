package questão.pkg3.pkgdo.caderno.pkg2.pkgdo.curso.java.pkg3;

import java.util.Scanner;

public class Questão3DoCaderno2DoCursoJava3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]Vetnome = new String[8];
        int[]Vetdvd = new int[8];
        int[]Vetgratis = new int[8];
        String nome;
        int cont,num;
        
        for(cont = 0;cont < Vetnome.length;cont++){
            System.out.print("Informe o nome do " + (cont+1) + "º cliente: ");
            nome = input.nextLine();
            Vetnome[cont] = nome;
            System.out.print("Informe a quantidade de locações do " + (cont+1) + "º cliente: ");
            num = input.nextInt(); input.nextLine();
            Vetdvd[cont] = num;
        }
        
        for(cont = 0;cont < Vetnome.length;cont++){
            Vetgratis[cont] = Vetdvd[cont]/10;
        }
        
        for(cont = 0;cont < Vetnome.length;cont++){
            System.out.println("O cliente " + Vetnome[cont] + " tem direito à " + Vetgratis[cont] + " locações grátis");
        }
    }   
}