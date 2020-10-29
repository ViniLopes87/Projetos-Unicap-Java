package programa.sobre.dados.de.uma.turma.poo.com.vetor;

import java.util.Scanner;

public class ProgramaSobreDadosDeUmaTurmaPOOComVetor {
    public static void PreencherTurma(Aluno[]Vet){
        Scanner input = new Scanner(System.in);
        int i,faltas;
        double media;
        String nome;
        Aluno AL;
        
        for(i = 0;i < Vet.length;i++){
            System.out.print("Informe o nome do " + (i + 1) + "º aluno: ");
            nome = input.nextLine();
            AL = new Aluno(nome);
            System.out.print("Informe a média do aluno: ");
            media = input.nextDouble(); 
            
            while(media < 0 || media > 10){
                System.out.println("Valor de média inválido");
                System.out.print("Informe a média do aluno entre 0 e 10: ");
                media = input.nextDouble();
            }
            
            AL.setM(media);
            System.out.print("Informe o número de faltas do aluno: ");
            faltas = input.nextInt(); input.nextLine();
            
            while(faltas < 0){
                System.out.println("Número de faltas inválido");
                System.out.print("Informe o número de faltas do aluno que não seja negativo: ");
                faltas = input.nextInt(); input.nextLine();
            }
            
            AL.setF(faltas);
            Vet[i] = AL;
        }
    }
    public static void ExibirTurma(Aluno[]Vet){
        int i;
        
        for(i = 0;i < Vet.length;i++){
            System.out.println(Vet[i]);
        }
    }
    public static void main(String[] args) {  
        final int TAM = 5;
        Aluno[]VetTurma;
        VetTurma = new Aluno[TAM];
        
        System.out.println("Informe os dados da turma:");
        PreencherTurma(VetTurma);
        System.out.println("Dados da turma:");
        ExibirTurma(VetTurma);
    }    
}