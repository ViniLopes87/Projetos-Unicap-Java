package votação.em.uma.eleição.com.pkg4.candidatos;

import java.util.Scanner;

public class VotaçãoEmUmaEleiçãoCom4Candidatos {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         int V1 = 0,V2 = 0,V3 = 0,V4 = 0,VB = 0,VT = 0,VN = 0,I1,I2,I3,I4,V;
         double PVN,PVB,PVV;
         char resp;
         
         System.out.println("Eleição para prefeito:");
         System.out.println("Vote 1 para o 1º candidato");
         System.out.println("Vote 2 para o 2º candidato");
         System.out.println("Vote 3 para o 3º candidato");
         System.out.println("Vote 4 para o 4º candidato");
         System.out.println("Vote 5 para votar em branco");
         
         do{
             VT = VT + 1;
             System.out.print("Informe seu voto: ");
             V = input.nextInt();
             
             System.out.print("Tem mais outra pessoa pra votar? ");
             resp = input.next().charAt(0);
             
             while(resp != 'S' && resp != 'N'){
                 System.out.println("Resposta inválida");
                 System.out.print("Tem outra pessoa para votar? Utilize S ou N: ");
                 resp = input.next().charAt(0);
             }
             
            switch(V){
                case 1: V1 = V1 + 1;
                    break;
                case 2: V2 = V2 + 1;
                    break;
                case 3: V3 = V3 + 1;
                    break;
                case 4: V4 = V4 + 1;
                    break;
                case 5: VB = VB + 1;
                    break;
                default: VN = VN + 1;
            }
            
         }while(resp != 'N');
              PVN = (VN * 100.0)/VT;
              PVB = (VB * 100.0)/VT;
              PVV = ((V1 + V2 + V3 + V4 + VB) * 100.0)/VT;
              
              System.out.println("O total de votos no 1º candidato foi de " + V1 + " votos");
              System.out.println("O total de votos no 2º candidato foi de " + V2 + " votos");
              System.out.println("O total de votos no 3º candidato foi de " + V3 + " votos");
              System.out.println("O total de votos no 4º candidato foi de " + V4 + " votos");
              System.out.println("O total de votos nulos foi de " + VN + " votos");
              System.out.println("O total de votos brancos foi de " + VB + " votos");
              System.out.println("A percentagem de votos nulos foi de " + PVN + "%");
              System.out.println("A percentagem de votos brancos foi de " + PVB + "%");
              System.out.println("A percentagem de votos válidos foi de " + PVV + "%");
              
              if(V1 > V2 && V1 > V3 && V1 > V4){
                  System.out.println("O 1º candidato venceu a eleição");
              }
              else if(V2 > V1 && V2 > V3 && V2 > V4){
                  System.out.println("O 2º candidato venceu a eleição");
              }
              else if(V3 > V1 && V3 > V2 && V3 > V4){
                  System.out.println("O 3º candidato venceu a eleição");
              }
              else if(V4 > V1 && V4 > V2 && V4 > V3){
                  System.out.println("O 4º candidato venceu a eleição");
              }
              else{
                  System.out.println("Temos um empate na eleição. O vencedor será o candidato com mais idade:");
                  
                  System.out.print("Informe a idade do 1º candidato entre 21 a 80: ");
                  I1 = input.nextInt();
                  
                    while(I1 < 21 || I1 > 80){
                        System.out.println("Idade inválida");
                        System.out.print("Informe a idade do 1º candidato entre 21 a 80: ");
                        I1 = input.nextInt();
                    }
                  
                  System.out.print("Informe a idade do 2º candidato entre 21 a 80: ");
                  I2 = input.nextInt();
                  
                    while(I2 < 21 || I2 > 80){
                        System.out.println("Idade inválida");
                        System.out.print("Informe a idade do 2º candidato entre 21 a 80: ");
                        I2 = input.nextInt();
                    }
                  
                  System.out.print("Informe a idade do 3º candidato entre 21 a 80: ");
                  I3 = input.nextInt();
                  
                    while(I3 < 21 || I3 > 80){
                        System.out.println("Idade inválida");
                        System.out.print("Informe a idade do 3º candidato entre 21 a 80: ");
                        I3 = input.nextInt();
                    }
                  
                  System.out.print("Informe a idade do 4º candidato entre 21 a 80: ");
                  I4 = input.nextInt();
                  
                    while(I4 < 21 || I4 > 80){
                        System.out.println("Idade inválida");
                        System.out.print("Informe a idade do 4º candidato entre 21 a 80: ");
                        I4 = input.nextInt();
                    }
                  
                  if(I1 > I2 && I1 > I3 && I1 > I4){
                      System.out.println("O 1º candidato venceu a eleição");
                  }
                  else if(I2 > I1 && I2 > I3 && I2 > I4){
                      System.out.println("O 2º candidato venceu a eleição");
                  }
                  else if(I3 > I1 && I3 > I2 && I3 > I4){
                      System.out.println("O 3º candidato venceu a eleição");
                  }
                  else if(I4 > I1 && I4 > I2 && I4 > I3){
                      System.out.println("O 4º candidato venceu a eleição");
                  }
              }
    }
}