package programa.pkgdo.mercadinho.da.maria.matriz;

import java.util.Scanner;

public class ProgramaDoMercadinhoDaMariaMatriz {
    public static void Menu(){
        System.out.println("Menu de operações do mercadinho:");
        System.out.println("0 - Para sair");
        System.out.println("1 - Para ver o faturamento médio por mês");
        System.out.println("2 - Para ver o faturamento anual de uma fruta");
        System.out.println("3 - Para ver o faturamento de um mês");
        System.out.println("4 - Para ver o faturamento anual");
        System.out.println("5 - Para exibir a tabela de valores");
    }
    public static void Preencher(double[][]mat, String[]VetM, String[]VetF){
        Scanner input = new Scanner(System.in);
        int L,C,i;
        double somaL,somaC;
        
        for(i = 0;i < VetF.length;i++){
            System.out.print("Informe as frutas do mercadinho: ");
            VetF[i] = input.nextLine();
        }
        
        for(C = 0;C < mat[0].length - 1;C++){
            for(L = 0;L < mat.length - 1;L++){
                System.out.print("Informe o valor arrecadado em " + VetM[C] + " com a venda de " + VetF[L] + ": ");
                mat[L][C] = input.nextDouble();
            }
        }
        for(L = 0;L < mat.length - 1;L++){
            somaL = 0;
            for(C = 0;C < mat[L].length - 1;C++){
                somaL = somaL + mat[L][C];
            }
            mat[L][12] = somaL;
        }
        for(C = 0; C < mat[0].length; C++) {
            somaC = 0;
            for(L = 0;L < mat.length - 1; L++) {
                somaC = somaC + mat[L][C];
            }
            mat[8][C] = somaC;
        }
    }
    public static double FatMédio(double[][]mat){
        int L;
        double soma = 0;
        
        for(L = 0;L < mat.length - 1;L++){
            soma = soma + mat[L][12];
        }
        return soma/12;
    }
    public static double FatM(double[][]mat, int M){
        return mat[8][M - 1];
    }
    public static double FatA(double[][]mat){
        int L;
        double somaL = 0;
        
        for(L = 0;L < mat.length - 1;L++){
               somaL = somaL + mat[L][12];
        }
        return somaL;
    }
    public static double FatF(double[][]mat, String[]VetF, int F){
        return mat[F - 1][12];
    }
    public static void Exibir(double[][]mat){
        int L,C;
        
        for(L = 0;L < mat.length;L++){
            for(C = 0;C < mat[L].length;C++){
                System.out.print(mat[L][C] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int M,OP,F;
        double FME,FF,FM,FA;
        
        String[]VetM = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};
        String[]VetF;
        VetF = new String[8];
        double[][]Matriz;
        Matriz = new double[9][13];
        
        System.out.println("Mercadinho:");
        Preencher(Matriz,VetM,VetF);
        
        do{
        Menu();
        System.out.print("Escolha uma operação: ");
        OP = input.nextInt();
        switch(OP){
            case 0: break;
            case 1: FME = FatMédio(Matriz);
                    System.out.println("O faturamento médio por mês é de " + FME + " reias");
                    break;
            case 2: for(int i = 0;i < VetF.length;i++){
                        System.out.println((i+1) + " - " + VetF[i]);
                    }
                    System.out.print("Informe o número da fruta que deseja consultar o faturamnto: ");
                    F = input.nextInt();
                    FF = FatF(Matriz,VetM,F);
                    System.out.println("O faturamento com " + VetM[F - 1] + " foi de " + FF + " reais");
                    break;
            case 3: System.out.print("Informe o número do mês que deseja consultar o faturamnto: ");
                    M = input.nextInt();
                    FM = FatM(Matriz,M);
                    System.out.println("O faturamento do mês de " + VetM[M-1] + " é de " + FM + " reais");
                    break;
            case 4: FA = FatA(Matriz);
                    System.out.println("O faturamento anual é de " + FA + " reais");
                    break;
            case 5: Exibir(Matriz);
                    break;
            default: System.out.println("Opção inválida");
                     break;
        }
        }while(OP != 0);
    }
}