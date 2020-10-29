package programa.para.computação.dos.votos.de.uma.eleição.vetor;

import java.util.Scanner;

public class ProgramaParaComputaçãoDosVotosDeUmaEleiçãoVetor {
    public static double CalcularP(double[]Vet, int cont){       
        double aux;
        
        aux = (Vet[0] / cont) * 100;
        
        return aux;
    }
    public static void candidatos(){
        System.out.println("0 - Voto em branco");
        System.out.println("1 - Voto em João");
        System.out.println("2 - Voto em Maria");
        System.out.println("3 - Voto em Pedro");
        System.out.println("4 - Voto em Luis");
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         int cont = 0,OP;
         double B,J,M,P,L,N;
         char resp;
         
         double[]VetJ;
         VetJ = new double[1];
         double[]VetM;
         VetM = new double[1];
         double[]VetP;
         VetP = new double[1];
         double[]VetL;
         VetL = new double[1];
         double[]VetBranco;
         VetBranco = new double[1];
         double[]VetNulo;
         VetNulo = new double[1];
         
         do{
         cont = cont + 1;
         candidatos();
         System.out.print("Opção: ");
         OP = input.nextInt();
         
         switch(OP){
             case 0: VetBranco[0] = VetBranco[0] + 1;
                    break;
             case 1: VetJ[0] = VetJ[0] + 1;
                    break;
             case 2: VetM[0] = VetM[0] + 1;
                    break;
             case 3: VetP[0] = VetP[0] + 1;
                    break;
             case 4: VetL[0] = VetL[0] + 1;
                    break;
             default: VetNulo[0] = VetNulo[0] + 1;
                     break;
         }
         
             System.out.print("Existem mais um candidato para votar(Utilize s,S,n,N): ");
             resp = input.next().charAt(0);
             
             while(resp != 's' && resp != 'S' && resp != 'N' && resp != 'n'){
                 System.out.println("Resposta inválida");
                 System.out.print("Existem mais um candidato para votar(Utilize s,S,n,N): ");
                 resp = input.next().charAt(0);
             }
         
         }while(resp != 'N' && resp != 'n');
         
         B = CalcularP(VetBranco,cont);
         J = CalcularP(VetJ,cont);
         M = CalcularP(VetM,cont);
         P = CalcularP(VetP,cont);
         L = CalcularP(VetL,cont);
         N = CalcularP(VetNulo,cont);
         
         System.out.println("A porcentagem de votos brancos foi de " + B + "%");
         System.out.println("A porcentagem de votos nulos foi de " + N + "%");
         System.out.println("A porcentagem de votos em João foi de " + J + "%");
         System.out.println("A porcentagem de votos em Maria foi de " + M + "%");
         System.out.println("A porcentagem de votos em Pedro foi de " + P + "%");
         System.out.println("A porcentagem de votos em Luis foi de " + L + "%"); 
    }   
}