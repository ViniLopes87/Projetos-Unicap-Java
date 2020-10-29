package converter.hora.e.minuto.em.somente.minuto.funcao.procedimento;

import java.util.Scanner;

public class ConverterHoraEMinutoEmSomenteMinutoFuncaoProcedimento {
    public static int HparaM(int a,int b){
        int aux;
        aux = (a * 60) + b;
        return aux;
    }
       public static void MparaH(int a){
           int H,M;
           H = a / 60;
           M = a % 60;
           System.out.println(a + " minutos vai ser " + H + " horas e " + M + " minutos");
           
       }
          public static void menuprinc(){
              System.out.println("Escolha uma das opções");
              System.out.println("0 - Para sair");
              System.out.println("1 - Para transformar hora e minuto pra minuto");
              System.out.println("2 - Para transformar minuto em hora e minuto");     
          }
             public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
                 int OP,M,H,CH,CM;
                 
                 do{
                 menuprinc();
                 System.out.print("Opção: ");
                 OP = input.nextInt();
                 
                   switch(OP){
                       case 0: break;
                       case 1: System.out.print("Informe a hora: ");
                               H = input.nextInt();
                               System.out.print("Informe os minutos: ");
                               M = input.nextInt();
                               CM = HparaM(H,M);
                               System.out.println(H + " horas e " + M + " minutos vai ser " + CM + " minutos");
                               break;
                       case 2: System.out.print("Informe os minutos: ");
                               M = input.nextInt();
                               MparaH(M);
                               break;
                       default: System.out.println("Opção inválida");
                                break;
                   }
                 }while(OP != 0);
             }
}