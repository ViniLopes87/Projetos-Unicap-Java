package programa.pkgdo.giro;

import java.util.Scanner;

public class ProgramaDoGiro {
    public static void MenuInicial(){
        System.out.println("1 - Login");
        System.out.println("2 - Registro");
    }
    public static void MenuPrincipal(){
        System.out.println("Bem-vindo ao projeto Giro");
        System.out.println("1 - Promoção do dia");
        System.out.println("2 - Camisetas");
        System.out.println("3 - Cosméticos");
        System.out.println("4 - Adubos");
        System.out.println("5 - Catálogo de compra de produtos para reciclagem");
        System.out.println("6 - Fazer doação");
        System.out.println("7 - Finalizar compra");
        System.out.println("0 - Sair");
    }
    public static void Catalogo(){
        System.out.println("1 - Garrafa PET");
        System.out.println("2 - Lâmpada");
        System.out.println("3 - Metal");
        System.out.println("4 - Coco");
        System.out.println("0 - Sair");
    }
    public static int Garrafa(int n,int[]VetQP){         
        if(VetQP[3] >= n){
            VetQP[3] = VetQP[3] - n;
            return n * 5;
        }
        else{
            System.out.println("Quantidade de produto no estoque insuficiente");
            return 0;
        }
    }
    public static int Lampada(int n,int[]VetQP){
        if(VetQP[4] >= n){
            VetQP[4] = VetQP[4] - n;
            return  n * 10;
        }
        else{
            System.out.println("Quantidade de produto no estoque insuficiente");
            return  0;
        }
    }
    public static int Metal(int n,int[]VetQP){
        if(VetQP[5] >= n){
            VetQP[5] = VetQP[5] - n;
            return n * 12;
        }
        else{
            System.out.println("Quantidade de produto no estoque insuficiente");
            return 0;
        }
    }
    public static int Coco(int n,int[]VetQP){
        if(VetQP[6] >= n){
            VetQP[6] = VetQP[6] - n;
            return n * 5;
        }
        else{
            System.out.println("Quantidade de produto no estoque insuficiente");
            return 0;
        }
    }
    public static int GarrafaDoar(int n,int[]VetQP){         
        return VetQP[3] + n;
    }
    public static int LampadaDoar(int n,int[]VetQP){
        return  VetQP[4] + n;
    }
    public static int MetalDoar(int n,int[]VetQP){
        return VetQP[5] + n;
    }
    public static int CocoDoar(int n,int[]VetQP){
        return VetQP[6] + n;
    }
    public static int camisa(int n,int[]VetQP){
        if(VetQP[0] >= n){
            VetQP[0] = VetQP[0] - n;
            return n * 15;
        }
        else{
            System.out.println("Quantidade de produto no estoque insuficiente");
            return 0;
        }
    }
    public static int adubo(int n,int[]VetQP){
        if(VetQP[2] >= n){
            VetQP[2] = VetQP[2] - n;
            return n * 12;
        }
        else{
            System.out.println("Quantidade de produto no estoque insuficiente");
            return 0;
        }
    }
    public static int Promocao(int n,int[]VetQP){
        if(VetQP[0] >= n){
            VetQP[0] = VetQP[0] - n;
            return n * 12;
        }
        else{
            System.out.println("Quantidade de produto no estoque insuficiente");
            return 0;
        }
    }
    public static int cosmetico(int n,int[]VetQP){
        if(VetQP[1] >= n){
            VetQP[1] = VetQP[1] - n;
            return n * 17;
        }
        else{
            System.out.println("Quantidade de produto no estoque insuficiente");
            return 0;
        }
    }
    public static void Preencher(int[]VetQP, String[]VetNP){
        Scanner input = new Scanner(System.in);
        
        for(int i = 0;i < VetQP.length;i++){
            System.out.print("Informe a quantidade de " + (VetNP[i]) + " que possui no estoque: ");
            VetQP[i] = input.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[]VetNP = {"Camisetas","Cosméticos","Adubos","Garrafa PET","Lâmpada","Metal","Coco"};
        int[]VetQP = {5,5,5,5,5,5,5};
        
        int OP,QTD,soma = 0,OPC;
        do{
            MenuPrincipal();
            System.out.print("Opção: ");
            OP = input.nextInt();
            switch(OP){
                case 1: System.out.println("Promoção do dia é na camisa");
                        System.out.print("Informe a quantidade de camisas que deseja comprar: ");
                        QTD = input.nextInt();
                        soma = soma + Promocao(QTD,VetQP);
                        break;
                case 2: System.out.print("Informe a quantidade de camisas que deseja comprar: ");
                        QTD = input.nextInt();
                        soma = soma + camisa(QTD,VetQP);
                        break;
                case 3: System.out.print("Informe a quantidade de cosméticos que deseja comprar: ");
                        QTD = input.nextInt();
                        soma = soma + cosmetico(QTD,VetQP);
                        break;
                case 4: System.out.print("Informe a quantidade de adubo que deseja comprar: ");
                        QTD = input.nextInt();
                        soma = soma + adubo(QTD,VetQP);
                        break;
                case 5: do{
                            Catalogo();
                            System.out.print("Opção: ");
                            OPC = input.nextInt();
                            switch(OPC){
                                case 0: break;
                                case 1: System.out.print("Informe a quantidade de garrafa PET que deseja comprar: ");
                                        QTD = input.nextInt();
                                        soma = soma + Garrafa(QTD,VetQP);
                                        break;
                                case 2: System.out.print("Informe a quantidade de lâmpada que deseja comprar: ");
                                        QTD = input.nextInt();
                                        soma = soma + Lampada(QTD,VetQP);
                                        break;
                                case 3: System.out.print("Informe a quantidade de metal que deseja comprar: ");
                                        QTD = input.nextInt();
                                        soma = soma + Metal(QTD,VetQP);
                                        break;
                                case 4: System.out.print("Informe a quantidade de coco que deseja comprar: ");
                                        QTD = input.nextInt();
                                        soma = soma + Coco(QTD,VetQP);
                                        break;
                                default: System.out.println("Opção inválida");
                            }
                        }while(OPC != 0);
                        break;
                case 6: do{
                            System.out.println("Escolha o que você vai doar: ");
                            Catalogo();
                            System.out.print("Opção: ");
                            OPC = input.nextInt();
                            switch(OPC){
                                case 0: break;
                                case 1: System.out.print("Informe a quantidade de garrafa PET que deseja doar: ");
                                        QTD = input.nextInt();
                                        soma = soma + GarrafaDoar(QTD,VetQP);
                                        break;
                                case 2: System.out.print("Informe a quantidade de lâmpada que deseja doar: ");
                                        QTD = input.nextInt();
                                        soma = soma + LampadaDoar(QTD,VetQP);
                                        break;
                                case 3: System.out.print("Informe a quantidade de metal que deseja doar: ");
                                        QTD = input.nextInt();
                                        soma = soma + MetalDoar(QTD,VetQP);
                                        break;
                                case 4: System.out.print("Informe a quantidade de coco que deseja doar: ");
                                        QTD = input.nextInt();
                                        soma = soma + CocoDoar(QTD,VetQP);
                                        break;
                                default: System.out.println("Opção inválida");
                            }
                        }while(OPC != 0);
                        break;
                case 7: System.out.println("Total a ser pago é de R$ " + soma + ",00");
                        break;
                default: System.out.println("Opção inválida");
            }
        }while(OP != 0);
    }
}