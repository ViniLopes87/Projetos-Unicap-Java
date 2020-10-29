package programa.para.combinação.de.dois.números.sem.recursividade;

import java.util.Scanner;

public class ProgramaParaCombinaçãoDeDoisNúmerosSemRecursividade {
    public static int fatorialN(int a){
        int aux = 0,F = 1;
        if(a < 0){
            aux = 0;
        }
        else if(a == 0 || a == 1){
            aux = 1;
        }
        else{
            while(a >= 1){
                aux = F = a * F;
                a = a - 1;
            }
        }
        return aux;
    }
        public static int fatorialK(int a){
            int aux1 = 0,F1 = 1;
            if(a < 0){
                aux1 = 0;
            }
            else if(a == 0 || a == 1){
                aux1 = 1;
            }
            else{
                while(a >= 1){
                    aux1 = F1 = a * F1;
                    a = a - 1;
                }
            }
            return aux1;
        }
            public static int fatorialS(int a){
                int aux2 = 0,F2 = 1;
                if(a < 0){
                    aux2 = 0;
                }
                else if(a == 0 || a == 1){
                    aux2 = 1;
                }
                else{
                    while(a >= 1){
                        aux2 = F2 = a * F2;
                        a = a - 1;
                    }
                }
                return aux2;
            }
                public static void main(String[] args) {
                    Scanner input = new Scanner(System.in);
                    int N,K,FN,FK,FS,C,sub;
                    
                    System.out.print("Informe a quantidade de pessoas: ");
                    N = input.nextInt();
            
                    while(N < 1){
                         System.out.println("Quantidade inválida");
                         System.out.print("Informe a quantidade de pessoas que seja maior que 0: ");
                         N = input.nextInt();
                    }
            
                    System.out.print("Informe a quantidade de pessoas em cada grupo: ");
                    K = input.nextInt();
            
                    while(K < 1){
                         System.out.println("Quantidade inválida");
                         System.out.print("Informe a quantidade de pessoas em cada grupo que seja maior que 0: ");
                         K = input.nextInt();
                    }
                      if(N > K || N == K){
                             FN = fatorialN(N);
                             FK = fatorialK(K);
                             FS = fatorialS(N - K);
                    
                             C = FN / (FK * FS) ;
                      }
                      else{
                          C = 0;
                      }
                             System.out.println("A combinação de " + N + " e de " + K + " é igual a " + C);
                }
}