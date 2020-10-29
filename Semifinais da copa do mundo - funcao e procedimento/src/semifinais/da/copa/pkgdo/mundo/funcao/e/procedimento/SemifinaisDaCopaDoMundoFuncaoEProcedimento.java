package semifinais.da.copa.pkgdo.mundo.funcao.e.procedimento;

import java.util.Scanner;

public class SemifinaisDaCopaDoMundoFuncaoEProcedimento {
    public static int jogo1(int a,int b){
        if(a > b){
            return 1;
        }
        else{
            return 2;
        }
    }
        public static int jogo2(int a,int b){
            if(a > b){
                return 1;
            }
            else{
                return 2;
            }
        }
            public static void confronto(int a,int b,int c,int d){
                int J1,J2;
                
                J1 = jogo1(a,b);
                J2 = jogo2(c,d);
                
                if(J1 == 1 && J2 == 1){
                    System.out.println("Final: Brasil x França");
                    System.out.println("Decisão do 3º lugar: Japão x Uruguai");
                }
                else if(J1 == 1 && J2 == 2){
                    System.out.println("Final: Brasil x Uruguai");
                    System.out.println("Decisão do 3º lugar: Japão x França");
                }
                else if(J1 == 2 && J2 == 1){
                    System.out.println("Final: Japão x França");
                    System.out.println("Decisão do 3º lugar: Brasil x Uruguai");
                }
                else{
                    System.out.println("Japão x Uruguai");
                    System.out.println("Decisão do 3º lugar: Brasil x França");
                }
            }
                public static void main(String[] args) {
                     Scanner input = new Scanner(System.in);
                      int B,J,F,U;
                    
                    System.out.print("Informe a quantidade de gols do Brasil: ");
                    B = input.nextInt();
                    
                    while(B < 0){
                        System.out.println("Quantidade inválida");
                        System.out.print("Informe a quantidade de gols do Brasil: ");
                        B = input.nextInt();
                    }
                    
                    System.out.print("Informe a quantidade de gols do Japão: ");
                    J = input.nextInt();
                    
                    while(J < 0){
                        System.out.println("Quantidade inválida");
                        System.out.print("Informe a quantidade de gols do Japão: ");
                        J = input.nextInt();
                    }
                    
                    while(B == J){
                        System.out.println("Resultado inválido");
                        System.out.print("Informe a quantidade de gols do Brasil: ");
                        B = input.nextInt();
                        
                           while(B < 0){
                                 System.out.println("Quantidade inválida");
                                 System.out.print("Informe a quantidade de gols do Brasil: ");
                                 B = input.nextInt();
                           }
                        
                        System.out.print("Informe a quantidade de gols do Japão: ");
                        J = input.nextInt();
                        
                           while(J < 0){
                                 System.out.println("Quantidade inválida");
                                 System.out.print("Informe a quantidade de gols do Japão: ");
                                 J = input.nextInt();
                           }
                        
                    }
                    
                    System.out.print("Informe a quantidade de gols da França: ");
                    F = input.nextInt();
                    
                    while(F < 0){
                        System.out.println("Quantidade inválida");
                        System.out.print("Informe a quantidade de gols da França: ");
                        F = input.nextInt();
                    }
                    
                    System.out.print("Informe a quantidade de gols do Uruguai: ");
                    U = input.nextInt();
                    
                    while(U < 0){
                        System.out.println("Quantidade inválida");
                        System.out.print("Informe a quantidade de gols do Uruguai: ");
                        U = input.nextInt();
                    }
                    
                    while(F == U){
                        System.out.println("Resultado inválido");
                        System.out.print("Informe a quantidade de gols da França: ");
                        F = input.nextInt();
                        
                          while(F < 0){
                                System.out.println("Quantidade inválida");
                                System.out.print("Informe a quantidade de gols da França: ");
                                F = input.nextInt();
                          }
                          
                        System.out.print("Informe a quantidade de gols do Uruguai: ");
                        U = input.nextInt();
                        
                          while(U < 0){
                               System.out.println("Quantidade inválida");
                               System.out.print("Informe a quantidade de gols do Uruguai: ");
                               U = input.nextInt();
                          }
                    }
                    
                    confronto(B,J,F,U);
                }   
}