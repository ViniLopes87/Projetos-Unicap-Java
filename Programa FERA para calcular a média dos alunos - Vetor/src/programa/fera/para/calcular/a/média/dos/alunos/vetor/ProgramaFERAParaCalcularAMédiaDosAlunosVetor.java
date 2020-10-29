package programa.fera.para.calcular.a.média.dos.alunos.vetor;

import java.util.Scanner;

public class ProgramaFERAParaCalcularAMédiaDosAlunosVetor {
    public static double AcharMaiorMedia(double[]VetM){
        double aux5 = 0;
        int i;     
        for(i = 0;i < VetM.length;i++){
            if(aux5 < VetM[i]){
                aux5 = VetM[i];
            }
        }
        
        return aux5;
    }
    public static int CalcularNotaMaiorMedia(double[]VetM,double MG){
        int i,cont = 0,aux4;       
        for(i = 0;i < VetM.length;i++){
            if(VetM[i] > MG){
                cont = cont + 1;
            }
        }
        
        aux4 = cont;
        return aux4;
    }
    public static double CalcularNotabaixoMedia(double[]VetM,double MG){
        double aux3;
        int i,cont = 0; 
        for(i = 0;i < VetM.length;i++){
            if(VetM[i] < MG){
                cont = cont + 1;
            }
        }
        
        aux3 = (cont * 100)/i;
        return aux3;
    }
    public static double CalcularMediaGeral(double[]VetM){
        double aux = 0,aux2;
        int i; 
        for(i = 0;i < VetM.length;i++){
            aux = aux + VetM[i];
        }
        
        aux2 = aux/i;
        return aux2;
    }
    public static void ExibirMedia(String[]VetNome,double[]VetM){
        int i;
        for(i = 0;i < VetM.length;i++){
            System.out.println("O aluno " + VetNome[i] + " obteve média " + VetM[i]);
        }
    }
    public static void CalcularMedia(double[]vet1,double[]vet2,double[]vetM){
        int i;    
        for(i = 0;i < vet1.length;i++){
            vetM[i] = (vet1[i] * 2 + vet2[i] * 3)/5;
        }
    }
    public static void PreencherVetNota(double[]Vet,String[]VetN){
        Scanner input = new Scanner(System.in);
        int i;
        for(i = 0;i < Vet.length;i++){
            System.out.print("Digite a nota de " + VetN[i] + ": ");
            Vet[i] = input.nextDouble();
        }              
    }
    public static void PreencherVetNome(String[]Vet){
        Scanner input = new Scanner(System.in);
        int i;
        for(i = 0; i < Vet.length;i++){
            System.out.print("Digite o nome do " + (i+1) +  "º aluno:");
            Vet[i] = input.nextLine();
        }
    }
    public static void main(String[] args) {     
        double MG,PN,MM;
        int GN;
        final int TAM = 50;
        
        String[]VetNome;
        VetNome = new String[TAM];
        double[]VetN1;
        VetN1 = new double[TAM];
        double[]VetN2;
        VetN2 = new double[TAM];
        double[]VetM;
        VetM = new double[TAM];
        
        System.out.println("Nota dos aluno:");
        
        PreencherVetNome(VetNome);
        System.out.println("Digite a 1ª nota do aluno:");
        PreencherVetNota(VetN1,VetNome);
        System.out.println("Digite a 2ª nota do aluno:");
        PreencherVetNota(VetN2,VetNome);
        
        CalcularMedia(VetN1,VetN2,VetM);
        ExibirMedia(VetNome,VetM);
        MG = CalcularMediaGeral(VetM);
        PN = CalcularNotabaixoMedia(VetM,MG);
        GN = CalcularNotaMaiorMedia(VetM,MG);
        MM = AcharMaiorMedia(VetM);
        
        System.out.println("A media da turma é de " + MG);
        System.out.println("A porcentagem de alunos com notas abaixo da média da turma é igual a " + PN + "%");
        System.out.println("A quantidade de alunos com notas acima da média da turma é igual a " + GN + " alunos");
        System.out.println("A maior média da turma é igual a " + MM);
    }   
}