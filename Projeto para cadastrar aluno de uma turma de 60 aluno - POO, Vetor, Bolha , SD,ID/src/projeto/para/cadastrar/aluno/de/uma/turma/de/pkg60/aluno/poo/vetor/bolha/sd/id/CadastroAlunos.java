package projeto.para.cadastrar.aluno.de.uma.turma.de.pkg60.aluno.poo.vetor.bolha.sd.id;

public class CadastroAlunos {
    private Aluno[]VetCap;
    private int cont;
    private boolean flag;
    
    public CadastroAlunos(int tam){
        VetCap = new Aluno[tam];
    }
    public void cadastrar(Aluno a){
       int pos;
       if(this.cont < this.VetCap.length){
         pos = Busca(a.getM());
         if(pos == -1){
             this.VetCap[this.cont] = a;
             this.cont++;
             this.flag = false;
             System.out.println("Cadastro do aluno efetuado!");
         }
         else{
             System.out.println("Matrícula repetida. Aluno não cadastrado!");
         }
       }
       else{
           System.out.println("Cadastramento não efetuado por falta de espaço!");
       }
    }
    private int Busca(String Proc){
      int inicio = 0,meio,fim = this.cont-1,i;
      boolean achou = false;
      
      if(flag == false){
        for(i = 0;i < this.cont;i++){
            if(this.VetCap[i].getM().compareTo(Proc) == 0){
                achou = true;
                break;
            }
        }
        if(achou == true){
            return i;
        }
        else{
            return -1;
        }
      }
      else{
        do{
            meio = (inicio + fim)/2;
            if(this.VetCap[meio].getM().compareTo(Proc) == 0){
                achou = true;
                break;
            }
            else if(this.VetCap[meio].getM().compareTo(Proc) > 0){
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
    }
    public void OrdenarID(){
        int i,j;
        Aluno chave;
        int fim = this.cont - 1;
        
        for(i = 1;i <= fim;i++){
            chave = this.VetCap[i];
            j = i - 1;
            while(j >= 0 && VetCap[j].compareTo(chave) > 0){
               VetCap[j+1] = VetCap[j];
               j = j - 1;
            }
            VetCap[j+1] = chave;
        }
        this.flag = true;
    }
    public void OrdenarBolha(){
        int i,fim = cont - 2,pos = 0;
        Aluno chave;
        boolean troca;   
        
        do{
            troca = false;
            for(i = 0;i <= fim;i++){
                if(VetCap[i].getME() < VetCap[i+1].getME()){
                    chave = VetCap[i+1];
                    VetCap[i+1] = VetCap[i];
                    VetCap[i] = chave;
                    pos = i;
                    troca = true;
                }
            }
            fim = pos - 1;
        }while(troca == true);
        this.flag = false;
    }
    public void OrdenarSD(){
        int i,j,menor;
        Aluno chave;
        int fim = cont - 1;
        
        for(i = 0;i < fim;i++){
            menor = i;
            for(j = i + 1;j <= fim;j++){
                if(VetCap[j].getF() < VetCap[menor].getF()){
                    menor = j;
                }
            }
            chave = VetCap[i];
            VetCap[i] = VetCap[menor];
            VetCap[menor] = chave;
        }
        this.flag = false;
    }
    public void ExibirTodos(){
        int i;
        System.out.println("Dados dos alunos:");
        for(i = 0;i < this.cont;i++){
            System.out.println(this.VetCap[i]);
        }
    }
    public void ExibirAluno(String M){
        int i;
         if(cont != 0){
             i = this.Busca(M);
             if(i == -1){
                 System.out.println("Matrícula inexistente");
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