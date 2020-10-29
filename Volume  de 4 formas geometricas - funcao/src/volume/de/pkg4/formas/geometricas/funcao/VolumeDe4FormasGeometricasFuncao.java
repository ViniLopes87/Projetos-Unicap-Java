package volume.de.pkg4.formas.geometricas.funcao;

import java.util.Scanner;

public class VolumeDe4FormasGeometricasFuncao {

    public static double vcubo(double a){
        double aux;
        aux = Math.pow(a, 3);
        return aux;
    }
    
      public static double vparale(double a,double b, double c){
          double aux1;
          aux1 = a * b * c;
          return aux1;
      }
      
        public static double vesfera(double a){
            double aux2;
            aux2 = (4 * 3.14 * Math.pow(a, 3))/3;
            return aux2;
        }
          public static double vcilindro(double a,double b){
              double aux3;
              aux3 = 3.14 * Math.pow(a, 2) * b;
              return aux3;
          }
    
             public static void main(String[] args) {
                 
                 Scanner input = new Scanner(System.in);
                 double VC,LC,VP,AP,LP,CP,VE,RE,VCI,AC,RC,V;
                 int OP,cont = 1;
                 
                 while(cont != 0){
                 System.out.println("Escolha a figura geométrica:");
                 System.out.println("0 - para sair");
                 System.out.println("1 - Volume do cubo");
                 System.out.println("2 - Volume do paralelepípedo");
                 System.out.println("3 - Volume da esfera");
                 System.out.println("4 - Volume do cilíndro");
                 System.out.print("Opção: ");
                 OP = input.nextInt();
                 
                        while(OP != 0 && OP != 1 && OP != 2 && OP != 3 && OP != 4){
                            System.out.println("Opção inválida");
                            System.out.print("Diga uma opção com 0 ou 1 ou 2 ou 3 ou 4: ");
                            OP = input.nextInt();
                        }
                 
                 if(OP == 1){
                     System.out.print("Digite a medida do lado do cubo: ");
                     LC = input.nextDouble();
                     V = vcubo(LC);
                 }
                 
                 else if(OP == 2){
                     System.out.print("Digite a medida da altura: ");
                     AP = input.nextDouble();
                     System.out.print("Digite a medida do lado: ");
                     LP =input.nextDouble();
                     System.out.print("Digite a medida do comprimento: ");
                     CP = input.nextDouble();
                     V = vparale(AP,LP,CP);
                 }
                 
                 else if(OP == 3){
                     System.out.print("Digite o valor do raio: ");
                     RE = input.nextDouble();
                     V = vesfera(RE);
                 }
                 
                 else if(OP == 0){
                     cont = 0;
                     V = 0;
                 }
                 
                 else{
                     System.out.print("Digite a medida da altura: ");
                     AC = input.nextDouble();
                     System.out.print("Digite a medida do raio da base: ");
                     RC = input.nextDouble();
                     V = vcilindro(RC,AC);
                 }
                 
                 System.out.println("O volume é de " + V);
                 }
             }   
}