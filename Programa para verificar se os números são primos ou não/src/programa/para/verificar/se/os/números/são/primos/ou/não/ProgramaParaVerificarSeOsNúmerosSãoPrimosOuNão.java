package programa.para.verificar.se.os.números.são.primos.ou.não;

import java.util.Scanner;

public class ProgramaParaVerificarSeOsNúmerosSãoPrimosOuNão {
    public static int MDC(int a,int b){
          int aux;
        if(a > b){
            aux = MDC(a - b,b);
        }
        else if(b > a){
            aux = MDC(b - a,a);
        }
        else{
            aux = a;
        }
        return aux;
    }
        public static boolean primos(int a){
            if(a == 1){
                return true;
            }
            else{
                return false;
            }
        }
            public static void resposta(){
                System.out.println("Deseja repetir?");
                System.out.println("S - sim");
                System.out.println("N - não");
            }
                public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    int N1,N2,MDC;
                    boolean P;
                    char OP;
                    
                   do{
                    System.out.print("Informe o valor de N1: ");
                    N1 = input.nextInt();
                    
                    while(N1 < 1){
                        System.out.println("Valor inválido");
                        System.out.print("Informe o valor de N1 que seja maior que 0: ");
                        N1 = input.nextInt();
                    }
                    
                    System.out.print("Informe o valor de N2: ");
                    N2 = input.nextInt();
                    
                    while(N2 < 1){
                        System.out.println("Valor inválido");
                        System.out.print("Informe o valor de N2 que seja maior que 0: ");
                        N2 = input.nextInt();
                    }
                    
                    MDC = MDC(N1,N2);
                    P = primos(MDC);
            
                    if(P == true){
                         System.out.println("São primos entre sí");
                    }
                    else{
                         System.out.println("Não são primos entre sí");
                    }
                    
                    resposta();
                    System.out.print("Opção: ");
                    OP = input.next().charAt(0);
                    
                    while(OP != 'S' && OP != 'N'){
                        System.out.println("Resposta inválida");
                        System.out.print("Opção: ");
                        OP = input.next().charAt(0);
                    }
                    
                   }while(OP != 'N');
                }  
}