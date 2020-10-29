package conversão.de.unidade.de.metro.pra.outras.funcao.e.procedimento;

import java.util.Scanner;

public class ConversãoDeUnidadeDeMetroPraOutrasFuncaoEProcedimento {
    public static double quilometro(double a){
        double aux;
        aux = a / 1000;
        return aux;
    }
        public static double hectometro(double a){
            double aux1;
            aux1 = a / 100;
            return aux1;
        }
            public static double decametro(double a){
                double aux2;
                aux2 = a / 10;
                return aux2;
            }
                public static double decimetros(double a){
                    double aux3;
                    aux3 = a * 10;
                    return aux3;
                }
                    public static double centimetros(double a){
                        double aux4;
                        aux4 = a * 100;
                        return aux4;
                    }
                        public static double milimetros(double a){
                            double aux5;
                            aux5 = a * 1000;
                            return aux5;
                        }
                            public static void menu(){
                                System.out.println("Escolha uma conversão:");
                                System.out.println("0 - Para sair");
                                System.out.println("1 - Para quilômetro(km)");
                                System.out.println("2 - Para hectômetro(hm)");
                                System.out.println("3 - Para decâmetro(dam)");
                                System.out.println("4 - Para decímetros(dm)");
                                System.out.println("5 - Para centímetros(cm)");
                                System.out.println("6 - Para milímetros(mm)");
                            }
                                public static void main(String[] args) {
                                    Scanner input = new Scanner(System.in);
                                    int OP;
                                    double M,KM,HM,DAM,DM,CM,MM;
                                    
                                  do{
                                    menu();
                                    System.out.print("Opção: ");
                                    OP = input.nextInt();
                                      switch(OP){
                                          case 0: break;
                                          case 1: System.out.print("Informe o tamanho em metros: ");
                                                  M = input.nextInt();
                                                  KM = quilometro(M);
                                                  System.out.println(M + " metros é igual a " + KM + " km");
                                                  break;
                                          case 2: System.out.print("Informe o tamanho em metros: ");
                                                  M = input.nextInt();
                                                  HM = hectometro(M);
                                                  System.out.println(M + " metros é igual a " + HM + " hm");
                                                  break;
                                          case 3: System.out.print("Informe o tamanho em metros: ");
                                                  M = input.nextInt();
                                                  DAM = decametro(M);
                                                  System.out.println(M + " metros é igual a " + DAM + " dam");
                                                  break;
                                          case 4: System.out.print("Informe o tamanho em metros: ");
                                                  M = input.nextInt();
                                                  DM = decimetros(M);
                                                  System.out.println(M + " metros é igual a " + DM + " dm");
                                                  break;
                                          case 5: System.out.print("Informe o tamanho em metros: ");
                                                  M = input.nextInt();
                                                  CM = centimetros(M);
                                                  System.out.println(M + " metros é igual a " + CM + " cm");
                                                  break;
                                          case 6: System.out.print("Informe o tamanho em metros: ");
                                                  M = input.nextInt();
                                                  MM = milimetros(M);
                                                  System.out.println(M + " metros é igual a " + MM + " mm");
                                                  break;
                                          default: System.out.println("Opção inválida");
                                                   break;
                                      }
                                  }while(OP != 0);
                                }   
}