package programa.para.cadastrar.funcionários.vetor.e.poo;

public class Cadastrarfuncionario {
     private Funcionario[]VetCap;
     private int cont;
     public Cadastrarfuncionario(int tam){
         VetCap = new Funcionario[tam];
     }
     public void Cadastrar(Funcionario F){
         int i, j, pos = 0;
         String f1, f2;
         if(cont == 0){
             this.VetCap[this.cont] = F;
             cont++;
             System.out.println("Cadastro efetuado!");
         }
         else if(this.cont < this.VetCap.length){
             f1 = F.getM();
             f2 = this.VetCap[this.cont - 1].getM();
             if(f1.compareToIgnoreCase(f2) > 0){
                 this.VetCap[this.cont] = F;
                 cont++;
                 System.out.println("Cadastro efetuado!");
             }
             else{
                 for(i = 0;i < this.cont;i++){
                     f2 = this.VetCap[i].getM();
                     if(f2.equalsIgnoreCase(f1)){
                         System.out.println("Funcionário já cadastrado, cadastro não efetuado!");
                         return;
                     }
                     else if(f2.compareToIgnoreCase(f1) > 0){
                         pos = i;
                         break;
                     }
                 }
                 for(j = this.cont - 1; j >= pos;j--){
                     this.VetCap[j + 1] = this.VetCap[j];
                 }
                 this.VetCap[pos] = F;
                 cont++;
                 System.out.println("Cadastro efetuado!");
             }
         }
         else{
             System.out.println("Cadastro não efetuado por falta de espaço");
         }
     }
     public void Exibirtodos(){
         int i;
         for(i = 0;i < cont;i++){
             System.out.println(this.VetCap[i]);
         }
     }
     private int BuscaBinaria(String MProc){
         int inicio = 0, meio, fim = this.cont - 1;
         boolean achou = false;
         do{
             meio = (inicio + fim)/2;
             if(this.VetCap[meio].getM().equalsIgnoreCase(MProc)){
                 achou = true;
                 break;
             }
             else if(this.VetCap[meio].getM().compareToIgnoreCase(MProc) > 0){
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
     public void Aumento(String M,double P){
         int i;
         double SA,SN;
         if(this.cont != 0){
             i = this.BuscaBinaria(M);
             if(i == -1){
                 System.out.println("Matrícula inexistente");
             }
             else{
                 SA = this.VetCap[i].getS();
                 SN = SA + (SA * P)/100;
                 this.VetCap[i].setS(SN);
                 System.out.println("Salário alterado");
             }
         }
         else{
             System.out.println("Cadastro vazio");
         }
     }
     public void ExibirFuncionario(String M){
         int i;
         if(this.cont != 0){
             i = this.BuscaBinaria(M);
             if(i == -1){
                 System.out.println("Matrícula inexistente");
             }
             else{
                 System.out.println("Dados do funcionário:");
                 System.out.println(this.VetCap[i]);
             }
         }
         else{
             System.out.println("Cadastro vazio");
         }
     }
     public void Demitir(String M){
         int i,j;
         if(this.cont != 0){
             i = this.BuscaBinaria(M);
             if(i == -1){
                 System.out.println("Matrícula inexistente");
             }
             else{
                 for(j = i; j < this.cont - 1;j++){
                     this.VetCap[j] = this.VetCap[j + 1];
                 }
                 this.VetCap[j] = null;
                 this.cont--;
                 System.out.println("Demissão efetuada");
             }
         }
         else{
             System.out.println("Cadastro vazio");
         }
     }
}