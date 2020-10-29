package projeto.para.criar.um.vetor.com.pkg20.nomes.e.ordenar.bolha;

import java.util.Scanner;

public class ProjetoParaCriarUmVetorCom20NomesEOrdenarBolha {
    public static void Preencher(String[]Vet){
        Scanner input = new Scanner(System.in);
        
        int i;
        for(i = 0;i < Vet.length;i++){
            System.out.print("Informe o nome da pessoa: ");
            Vet[i] = input.nextLine();
        }
    }
    public static void Exibir(String[]Vet){
        int i;
        System.out.println("O nome das pessoas são:");
        for(i = 0;i < Vet.length;i++){
            System.out.println(Vet[i] + " ");
        }
    }
    public static void Ordenar(String[]Vet){
        int i,fim = Vet.length - 2,pos = 0;
        String aux;
        boolean troca;       
        do{
            troca = false;
            for(i = 0; i <= fim;i++){
                if(Vet[i].compareToIgnoreCase(Vet[i+1]) > 0){
                    aux = Vet[i];
                    Vet[i] = Vet[i+1];
                    Vet[i+1] = aux;
                    pos = i;
                    troca = true;
                }
            }
            fim = pos - 1;
        }while(troca == true);
    }
    public static void main(String[] args) {
        final int TAM = 20;
         String [] Vet = new String[TAM];
         
         Preencher(Vet);
         Ordenar(Vet);
         Exibir(Vet);
    }
}