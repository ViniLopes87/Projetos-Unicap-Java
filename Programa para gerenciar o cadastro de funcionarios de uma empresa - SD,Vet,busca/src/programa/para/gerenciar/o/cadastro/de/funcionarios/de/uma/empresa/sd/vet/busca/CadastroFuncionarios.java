package programa.para.gerenciar.o.cadastro.de.funcionarios.de.uma.empresa.sd.vet.busca;

public class CadastroFuncionarios {
    private Funcionario[]VetCap;
    private int cont;
    private boolean flag;
    
    public CadastroFuncionarios(int tam){
        VetCap = new Funcionario[tam];
    }
    public void Cadastrar(Funcionario f){
       int pos;
       if(this.cont < this.VetCap.length){
         pos = Busca(f.getM());
         if(pos == -1){
             this.VetCap[this.cont] = f;
             this.cont++;
             this.flag = false;
             System.out.println("Cadastro do funcionário efetuado!");
         }
         else{
             System.out.println("Matrícula repetida. Funcionário não cadastrado!");
         }
       }
       else{
           System.out.println("Cadastramento não efetuado por falta de espaço!");
       }
    }
    private int Busca(String Proc){
      int i;
      boolean achou = false;
      
      if(flag == false){
        for(i = 0;i < this.cont;i++){
            if(this.VetCap[i].getM().compareToIgnoreCase(Proc) == 0){
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
        int inicio = this.cont-1,meio,fim = 0;
        do{
            meio = (inicio + fim)/2;
            if(this.VetCap[meio].getM().compareToIgnoreCase(Proc) == 0){
                achou = true;
                break;
            }
            else if(this.VetCap[meio].getM().compareToIgnoreCase(Proc) > 0){
                fim = meio + 1;
            }
            else{
                inicio = meio - 1;
            }
        }while(inicio >= fim);
            if(achou == true){
                return meio;
            }
            else{
                return -1;
            }
      }
    }
    public void OrdenarSD(){
        int i,j,maior;
        Funcionario chave;
        int fim = cont - 1;
        
        for(i = 0;i < fim;i++){
            maior = i;
            for(j = i + 1;j <= fim;j++){
                if(VetCap[j].getM().compareToIgnoreCase(VetCap[maior].getM()) > 0){
                    maior = j;
                }
            }
            chave = VetCap[i];
            VetCap[i] = VetCap[maior];
            VetCap[maior] = chave;
        }
        this.flag = true;
    }
    public void ExibirFuncionario(String M){
        int i;
         if(cont != 0){
             i = this.Busca(M);
             if(i == -1){
                 System.out.println("Matrícula inexistente");
             }
             else{
                 System.out.println("Dados do Funcionário:");
                 System.out.println(this.VetCap[i]);
             }
         }
         else{
             System.out.println("Cadastro vazio");
         }
    }
}