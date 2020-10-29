package programa.com.idade.altura.peso.cor.dos.olhos.e.cabelo;

import java.util.Scanner;

public class ProgramaComIdadeAlturaPesoCorDosOlhosECabelo {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int I,QP,cont,cont2 = 0,cont3 = 0,contA = 0,contR = 0;
         double P,A,MI,PA,somaI = 0;
         char CO,CB;
         
         System.out.print("Informe a quantidade de pessoas: ");
         QP = input.nextInt();
         
         while(QP < 1){
             System.out.println("Quantidade inválida");
             System.out.print("Informe a quantidade de pessoas: ");
             QP = input.nextInt();
         }
         
         for(cont = 0;cont != QP;cont = cont + 1){
             System.out.print("Informe a idade de 1 a 120: ");
             I = input.nextInt();
             
             while(I < 1 || I > 120){
                 System.out.println("Idade inválida");
                 System.out.print("Informe a idade de 1 a 120: ");
                 I = input.nextInt();
             }
             
             System.out.print("Informe o peso de 3 a 300: ");
             P = input.nextDouble();
             
             while(P < 3 || P > 300){
                 System.out.println("Peso inválido");
                 System.out.print("Informe o peso de 3 a 300: ");
                 P = input.nextDouble();
             }
             
             System.out.print("Informe a altura de 0,5 a 2,5: ");
             A = input.nextDouble();
             
             while(A < 0.5 || A > 2.5){
                 System.out.println("Altura inválida");
                 System.out.print("Informe a altura de 0,5 a 2,5: ");
                 A = input.nextDouble();
             }
             
             System.out.println("Cor do olho:");
             System.out.println("A - Azul");
             System.out.println("V - verde");
             System.out.println("P - Preto");
             System.out.println("C - Castanho");
             System.out.print("Informe a cor do olho: ");
             CO = input.next().charAt(0);
             
             while(CO != 'A' && CO != 'V' && CO != 'P' && CO != 'C'){
                 System.out.println("Cor do olho inválida");
                 System.out.print("Informe a cor do olho: ");
                 CO = input.next().charAt(0);
             }
             
             System.out.println("Cor do cabelo:");
             System.out.println("P - Preto");
             System.out.println("C - Castanho");
             System.out.println("L - Loiro");
             System.out.println("R - Ruivo");
             System.out.print("Informea cor do cabelo: ");
             CB = input.next().charAt(0);
             
             while(CB != 'P' && CB != 'C' && CB != 'L' && CB != 'R'){
                 System.out.println("Cor do cabelo inválida");
                 System.out.print("Informe a cor do cabelo: ");
                 CB = input.next().charAt(0);
             }
             
             if(I > 50 && P < 60){
                 cont2 = cont2 + 1;
             }
             
             if(A < 1.5){
                 somaI = somaI + I;
                 cont3 = cont3 + 1;            
             }
             
             if(CO == 'A'){
                 contA = contA + 1;              
             }
             
             if(CB == 'R' && CO != 'A'){
                 contR = contR + 1;
             }
         }
             MI = somaI/cont3;
             PA = (contA * 100.0)/cont;
             System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 Kg é de " + cont2);
             System.out.println("A média das idades das pessoas com altura inferior a 1,5 é de " + MI + " anos");
             System.out.println("A percentagem de pessoas com olhos azuis dentre todas as outras é de " + PA + "%");
             System.out.println("A quantidade de pessoas ruivas e que não tem olhos azuis é de " + contR);
    }
}