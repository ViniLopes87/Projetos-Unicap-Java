package projeto.para.cadastrar.os.produtos.da.loja.preço.bom.vetor.e.poo;

public class Loja {
    private Produto[]VetCap;
    private int cont;
    
    public Loja(int TAM){
        VetCap = new Produto[TAM];
    }
    public void Cadastrar(Produto P){
        int i;
        i = this.buscarP(P);
        if(i == -1){
          int pos = this.cont;
          this.VetCap[pos] = P;
          this.cont++;
          System.out.println("Cadastro efetuado");  
        }
        else{
            System.out.println("Código já cadastrado");
        }
    }
    public void Exibirtodos(){
        int i;
        for(i = 0;i < cont;i++){
             System.out.println(this.VetCap[i]);
        }
    }
    private int buscarP(Produto P){
        int i,pos = -1;
        for(i = 0;i < cont;i++){
            if(this.VetCap[i].getC().equals(P.getC()) == true){
                pos = i;
                break;
            }
        }
        return pos;
    }
    private int buscarC(String CProcurado){
         int i, pos = -1;
         for(i = 0;i < cont;i++){
             if(this.VetCap[i].getC().equalsIgnoreCase(CProcurado) == true){
                 pos = i;
                 break;
             }
         }
         return pos;
    }
    public void ExibirFornecedor(String FProcurado){
        int i;
        boolean achouFornecedor = false;
        for(i = 0;i < cont;i++){
            if(this.VetCap[i].getF().equalsIgnoreCase(FProcurado)){
                 System.out.println("Dados dos produtos do fornecedor " + FProcurado + ":");
                 System.out.println(this.VetCap[i]);
                 achouFornecedor = true;
            }
        }
            if(!achouFornecedor){
                System.out.println("Fornecedor não cadastrado");
            }   
    }
    public void AlterarPreco(String Cproc,double P,int OP){
        int i;
        double PA,PN;
        if(this.cont != 0){
            i = this.buscarC(Cproc);
            if(i == -1){
                System.out.println("Código não cadastrado");
            }
            else{
                if(OP == 1){
                    PA = this.VetCap[i].getP();
                    PN = PA + (PA * P)/100;
                    this.VetCap[i].setP(PN);
                    System.out.println("Preço alterado com sucesso");
                }
                else{
                    PA = this.VetCap[i].getP();
                    PN = PA - (PA * P)/100;
                    this.VetCap[i].setP(PN);
                    System.out.println("Preço alterado com sucesso");
                }
            }
        }
        else{
            System.out.println("Cadastro Vazio");
        }
    }
    public void AlterarQuantidade(String Cproc,int QE){
        int i,QA,QN;
        if(this.cont != 0){
            i = this.buscarC(Cproc);
            if(i == -1){
                System.out.println("Código não cadastrado");
            }
            else{
                QA =this.VetCap[i].getQE();
                QN = QA + QE;
                this.VetCap[i].setQE(QN);
                System.out.println("Aumeto realizado com sucesso");
            }
        }
        else{
              System.out.println("Cadastro Vazio");  
        }
    }
    public void Venda(String Cproc,int QE){
        int i,QA,QN;
        double VT,V;
        if(this.cont != 0){
            i = this.buscarC(Cproc);
            if(i == -1){
                System.out.println("Código não cadastrado");
            }
            else{
                if(QE <= this.VetCap[i].getQE()){
                    QA = this.VetCap[i].getQE();
                    QN = QA - QE;
                    this.VetCap[i].setQE(QN);
                    V = this.VetCap[i].getP();
                    VT = V * QE;
                    System.out.println("Valor total a pagar é de R$" + VT);
                }
                else{
                    System.out.println("Quantidade no estoque é insuficiente");
                }
            }
        }
        else{
            System.out.println("Cadastro Vazio");
        }
    }
}