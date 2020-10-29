package troco;

import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       int RP,RP2 = 1,C,Q,F1,F2,F3 = 0,F4,D;
       do { 
           TelaPrincipal();
           System.out.print("Opção: ");
           RP = input.nextInt();
           switch (RP) {
               case 1: 
                P2(RP2);           
               break;
               case 0:
                   System.out.println("Volte sempre!");
                   RP = 0;
                   break;
               default: 
                   System.out.println("Valor inválido");
                   break;
           }
       } while (RP == 1);
    }
        public static void P2 (int a) {
            Scanner input = new Scanner (System.in);
             int C,Q,F1,F2,F3 = 0,F4,D,RP2;
             do {
               Menu();
               System.out.print("Digite o código do produto: ");
               Q = input.nextInt();
               while(Q < 1 || Q > 50){
                   System.out.println("Código inválido");
                   System.out.print("Digite o código do produto de 1 a 50: ");
                   Q = input.nextInt();
               }
               System.out.print("Digite a quantidade comprada: ");
               C = input.nextInt();
               F1 = F1(Q);
               F2 = F2(F1,C);
               F3 = F3(F2,F3);
               System.out.println("Digite 1 para mais produtos");
               System.out.println("Digite 0 para finalizar");
               System.out.print("Opção: ");
               RP2 = input.nextInt();
               while(RP2 != 1 && RP2 != 0){
                   System.out.println("Opção inválida");
                   System.out.println("Digite 1 para mais produtos");
                   System.out.println("Digite 0 para finalizar");
                   System.out.print("Opção: ");
                   RP2 = input.nextInt();
               }
               } while (RP2 == 1);
               System.out.println("O valor da compra foi de R$ " +F3+ ": ");
               System.out.print("Digite o valor dado em dinheiro:");
               D = input.nextInt();
               while (D < F3) {
               System.out.print("Quantidade inválida, O valor deve ser maior ou igual à R$ " +F3 + ": ");
               D = input.nextInt();  
               }
               F4 = F4(F3,D);
               System.out.println("A quantidade do troco é de R$ " +F4);
               P1(F4);
         }   
    public static int F1 (int Q) {
        if (Q >= 1 && Q <= 5) {
            return 1;
        }
        else if (Q >= 6 && Q <= 10) {
            return 2;
        }
        else if (Q >= 11 && Q <= 15) {
            return 3;
        }
        else if (Q >= 16 && Q <= 20) {
            return 4;
        }
        else if (Q >= 21 && Q <= 25) {
            return 5;
        }
        else if (Q >= 26 && Q <= 30) {
            return 6;
        }
        else if (Q >= 31 && Q <= 35) {
            return 7;
        }
        else if (Q >= 36 && Q <= 40) {
            return 8;
        }
        else if (Q >= 41 && Q <= 45) {
            return 9;
        }
        else {
            return 10;
        }
    }
    public static int F2 (int f1,int C) {
        return f1 * C;    
    }
        public static int F3 (int F2,int F3) {
        return F2 + F3;
    }
      public static int F4(int vt,int vd){
        int troco;
        troco=vd-vt;
        return troco;
    }
  public static void Menu(){
      System.out.println("Código produto - Preço Unitário");
      System.out.println("1 a 5 - R$1,0");
      System.out.println("6 a 10 - R$2,0");
      System.out.println("11 a 15 - R$3,0");
      System.out.println("16 a 20 - R$4,0");
      System.out.println("21 a 25 - R$5,0");
      System.out.println("26 a 30 - R$6,0");
      System.out.println("31 a 35 - R$7,0");
      System.out.println("36 a 40 - R$8,0");
      System.out.println("41 a 45 - R$9,0");
      System.out.println("46 a 50 - R$10,0");
  }
  public static void TelaPrincipal(){
      System.out.println("Mercadinho do Joaquim");
      System.out.println("1-Calcular Compra");
      System.out.println("0-Encerrar Programa");
  }
  public static void P1(int troco){
      int resto;
      int ced50 = 0,ced20 = 0,ced10 = 0,ced5 = 0,ced2 = 0,ced1 = 0;
      do {
      if(troco>=50){
          ced50=troco/50;
          resto=troco%50;
          troco = resto;
      }
      else if(troco>=20){
          ced20=troco/20;
          resto=troco%20;
          troco=resto;
      }
       else if(troco>=10){
          ced20=troco/10;
          resto=troco%10;
          troco=resto;
      }
       else if(troco>=5){
          ced20=troco/5;
          resto=troco%5;
          troco=resto;
      }
       else if(troco>=2){
          ced20=troco/2;
          resto=troco%2;
          troco=resto;
      }
       else if(troco>=1){
          ced20=troco/1;
          resto=troco%1;
          troco=resto;
       }
      } while(troco != 0);
      System.out.println(ced50+" cédulas de 50 reais "+ced20+" cédulas de 20 reais "+ced10+" cédulas de 10 reais "+ced5+" cédulas de 5 reais "+ced2+" cédulas de 2 reais "+ced1+" cédulas de 1 real.");   
 }
}