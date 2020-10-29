package programa.para.calcular.a.média.de.cada.aluno.e.da.turma.matriz;

import java.util.Scanner;

public class ProgramaParaCalcularAMédiaDeCadaAlunoEDaTurmaMatriz {
    public static void preencherN(double n1, double n2,double[][]mat,int cont) {
        double nf;
        
        nf = (n1 * 2 + n2 * 3)/5;
        
            mat[cont][0] = n1;
            mat[cont][1] = n2;
            mat[cont][2] = nf;
    }
    public static void preencherA(String[]Vet, String nome, int cont){
            Vet[cont] = nome;
    }
    public static void Exibir(String[]Vet, double[][]mat){
        int i;
        
        for(i = 0;i < Vet.length;i++){
            System.out.println("O aluno " + Vet[i] + " obteve média de " + mat[i][2] + " pontos");
        }
    }
    public static double calcularMediaT(double[][]mat){
        int i;
        double soma = 0,mediaT;
        
        for(i = 0;i < mat.length;i++){
            soma = soma + mat[i][2];
        }
        return mediaT = soma/mat.length;
    }
    public static int calcularBaixoMedia(double[][]mat, double MT){
        int i,cont = 0;
        
        for(i = 0;i < mat.length;i++){
            if(MT > mat[i][2]){
                cont++;
            }
        }
        return cont;
    }
    public static void MaioreMenor(double[][]mat){
        double maior = 0,menor = mat[0][2];
        int i,j;
        
        for(i = 0;i < mat.length;i++){  
            if(mat[i][2] > maior){
                maior = mat[i][2] ;
            }
        }
        for(j = 0;j < mat.length;j++){    
            if(mat[j][2] < menor){
                menor = mat[j][2];
            }
        }
        
        System.out.println("A maior média da turma é de " + maior + " pontos e a menor média é de " + menor + " pontos");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contL = 0,Mbaixo;
        double n1,n2,Media;
        String nome;
        final int TAM;
        
        System.out.print("Informe a quantidade de alunos da escola: ");
        TAM = input.nextInt(); input.nextLine();
        
        String[]VetN;
        VetN = new String[TAM];
        double[][]Matriz;
        Matriz = new double[TAM][3];
        
        do{
            System.out.print("Informe o nome do " + (contL+1) + "º aluno: ");
            nome = input.nextLine();
            System.out.print("Informe a 1º nota do aluno: ");
            n1 = input.nextDouble(); 
            
            while(n1 < 0 || n1 > 10){
                System.out.println("Nota inválida");
                System.out.print("Informe a 1º nota do aluno que esteja entre 0 e 10: ");
                n1 = input.nextDouble();
            }
            
            System.out.print("Informe a 2º nota do aluno: ");
            n2 = input.nextDouble(); input.nextLine();
            
            while(n2 < 0 || n2 > 10){
                System.out.println("Nota inválida");
                System.out.print("Informe a 2º nota do aluno que esteja entre 0 e 10: ");
                n2 = input.nextDouble(); input.nextLine();
            }
            
            preencherA(VetN,nome,contL);
            preencherN(n1,n2,Matriz,contL);
            contL++;
        }while(contL != TAM);
        Media = calcularMediaT(Matriz);
        Mbaixo = calcularBaixoMedia(Matriz,Media);
        Exibir(VetN,Matriz);
        System.out.println("A média da turma é de " + Media + " pontos");
        System.out.println(Mbaixo + " alunos ficaram com média abaixo da média da turma");
        MaioreMenor(Matriz);
    }   
}