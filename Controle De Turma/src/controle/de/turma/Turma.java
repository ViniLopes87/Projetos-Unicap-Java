package controle.de.turma;

import java.util.Scanner;

public class Turma {
     private Aluno[]VetCap;
     private int cont;
     
     public Turma(int tam){
         VetCap = new Aluno[tam];
     }
     public void Cadastrar(Aluno A){
         int i,j,pos = 0;
         String A1,A2;
         if(cont == 0){
             this.VetCap[this.cont] = A;
             cont++;
             System.out.println("Cadastro efetuado!");
         }
         else if(this.cont < this.VetCap.length){
             A1 = A.getM();
             A2 = this.VetCap[this.cont - 1].getM();
             if(A1.compareToIgnoreCase(A2) > 0){
                 this.VetCap[this.cont] = A;
                 cont++;
                 System.out.println("Cadastro efetuado!");
             }
             else{
                 for(i = 0;i < this.cont;i++){
                     A2 = this.VetCap[i].getM();
                     if(A2.equalsIgnoreCase(A1)== true){
                         System.out.println("Aluno já cadastrado, cadastramento não realizado!");
                         return;
                     }
                     else if(A2.compareToIgnoreCase(A1) > 0){
                         pos = i;
                         break;
                     }
                 }
                 for(j = this.cont - 1;j >= pos;j--){
                     this.VetCap[j + 1] = this.VetCap[j];
                 }
                 this.VetCap[pos] = A;
                 cont++;
                 System.out.println("Cadastramento efetuado!");
             }
         }
         else{
             System.out.println("Cadastro não efetuado por falta de espaço");
         }
     }
     public void ExibirTodos(){
         int i;
         System.out.println("Dados dos alunos:");
         for(i = 0;i < cont;i++){
             System.out.println(this.VetCap[i]);
         }
     }
     private int BuscaBinaria(String ProcM){
         int inicio = 0, meio, fim = this.cont -1;
         boolean achou = false;
         do{
             meio = (inicio + fim)/2;
             if(this.VetCap[meio].getM().equalsIgnoreCase(ProcM)){
                 achou = true;
                 break;
             }
             else if(this.VetCap[meio].getM().compareToIgnoreCase(ProcM) > 0){
                 fim = meio - 1;
             }
             else{
                 inicio = meio + 1;
             }
         }while(inicio <= fim);
         if(achou == true){
             return meio;
         }
         else{
             return -1;
         }
     }
     public void Remoção(String M){
         int i,j;
         if(this.cont != 0){
             i = this.BuscaBinaria(M);
             if(i == -1){
                 System.out.println("Aluno não existe");
             }
             else{
                 for(j = i; j < this.cont - 1;j++){
                     this.VetCap[j] = this.VetCap[j + 1];
                 }
                 this.VetCap[j] = null;
                 this.cont--;
                 System.out.println("Remoção efetuada");
             }
         }
         else{
             System.out.println("Cadastro vazio");
         }
     }
     public static void Menu2(){
                 System.out.println("Escolha uma operação:");
                 System.out.println("1 - Para alterar a média");
                 System.out.println("2 - Para alterar as faltas");
                 System.out.println("3 - Para alterar a média e as faltas");
     }
     public void AlterarDados(String M){
         Scanner input = new Scanner(System.in);
         int i,OP,F;
         double ME;
         if(cont != 0){
             i = this.BuscaBinaria(M);
             if(i == -1){
                 System.out.println("Aluno não exsite");
             }
             else{
                 Menu2();
                 System.out.print("Opção: ");
                 OP = input.nextInt();
                 
                 while(OP != 1 && OP != 2 && OP != 3){
                     System.out.println("Opção inválida");
                     Menu2();
                     System.out.print("Opção: ");
                     OP = input.nextInt();
                 }
                 
                 switch (OP) {
                     case 1: System.out.print("Informe a nova média do aluno " + this.VetCap[i].getN() + ":");
                             ME = input.nextDouble();
                             
                             while(ME < 0 || ME > 10){
                                 System.out.println("Média inválida");
                                 System.out.print("Informe a média do aluno entre 0 e 10: ");
                                 ME = input.nextDouble();
                             }
                             
                             this.VetCap[i].setME(ME);
                             System.out.println("Alteração realizada!");
                             break;
                     case 2: System.out.print("Informe a nova quantidade de faltas do aluno " + this.VetCap[i].getN() + ":");
                             F = input.nextInt();
                             
                             while(F < 0){
                                System.out.println("Faltas inválidas");
                                System.out.print("Informe a quantidade de faltas do aluno que seja maior ou igual a 0: ");
                                F = input.nextInt();
                             }
                             
                             this.VetCap[i].setF(F);
                             System.out.println("Alteração realizada!");
                             break;
                     case 3: System.out.print("Informe a nova média do aluno " + this.VetCap[i].getN() + ":");
                             ME = input.nextDouble();
                             
                             while(ME < 0 || ME > 10){
                                System.out.println("Média inválida");
                                System.out.print("Informe a média do aluno entre 0 e 10: ");
                                ME = input.nextDouble();
                             }
                             
                             this.VetCap[i].setME(ME);
                             System.out.print("Informe a nova quantidade de faltas do aluno " + this.VetCap[i].getN() + ":");
                             F = input.nextInt();
                             
                             while(F < 0){
                                System.out.println("Faltas inválidas");
                                System.out.print("Informe a quantidade de faltas do aluno que seja maior ou igual a 0: ");
                                F = input.nextInt();
                             }
                             
                             this.VetCap[i].setF(F);
                             System.out.println("Alterações realizadas!");
                             break;
                 }
             }
         }
         else{
             System.out.println("Cadastro vazio");
         }
     }
     public void ExibirTurma(String M){
         int i;
         if(cont != 0){
             i = this.BuscaBinaria(M);
             if(i == -1){
                 System.out.println("Aluno não existe");
             }
             else{
                 System.out.println("Dados do aluno:");
                 System.out.println(this.VetCap[i]);
             }
         }
         else{
             System.out.println("Cadastro vazio");
         }
     }
}