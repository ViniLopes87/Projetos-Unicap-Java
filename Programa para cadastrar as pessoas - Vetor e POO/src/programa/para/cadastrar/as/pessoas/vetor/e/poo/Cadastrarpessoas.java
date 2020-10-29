package programa.para.cadastrar.as.pessoas.vetor.e.poo;

public class Cadastrarpessoas {
    private Pessoa[] Vetdados;
    private int cont;
    public Cadastrarpessoas (int tam) { // construtor
        Vetdados = new Pessoa [tam];
    }

    public void Cadastrar (Pessoa p) {  // Cadastro não ordenado e permite repetidos
        int pos = this.cont;
        if (this.cont < this.Vetdados.length) {
            this.Vetdados [pos] = p;
            this.cont++;
            System.out.println("Cadastro efetuado");
        }
        else {
            System.out.println("Cadastramento não efetuado por falta de espaço!");
        }
    }

    public void Cadastrar2 (Pessoa p) {  // Cadastro não ordenado e NÃO permite repetidos
        int pos = this.cont, i;
        if (this.cont < this.Vetdados.length) {
            i = this.buscar (p.getN());
            if (i == -1) {  // não achou
                this.Vetdados [pos] = p;
                this.cont++;
                System.out.println("Cadastro efetuado");
            }
            else {
                System.out.println("Pessoa já consta no cadastro! Inserção não efetuada! ");
            }
        }
        else {
            System.out.println("Cadastramento não efetuado por falta de espaço!");
        }
    }
    
    public void CadastrarOrdenado (Pessoa p) {  // Cadastro ordenado e NÃO permite repetidos
        int i, j, pos=0;
        String s1, s2;
        if (this.cont == 0) {  // cadastro está vazio
            this.Vetdados [this.cont] = p;
            this.cont++;
            System.out.println("Inserção efetuada!");
        }
        else if (this.cont < this.Vetdados.length) { // tem espaço
            s1 = p.getN();
            s2 = this.Vetdados[this.cont - 1].getN();
            if (s1.compareToIgnoreCase(s2) > 0) { // inserção no final do vetor
                this.Vetdados[this.cont] = p;
                this.cont++;
                System.out.println("Inserção efetuada!");
            }
            else {
                for (i = 0; i < this.cont; i++) {  // Encontrar o ponto de inserção
                   s2 = this.Vetdados[i].getN();
                   if (s2.equalsIgnoreCase (s1) == true) { 
                       System.out.println("Pessoa já cadastrada! Inserção não efetuada");
                       return; // interrompe a execução do método cadastrar!
                   }
                   else if (s2.compareToIgnoreCase (s1) > 0) { // Achou o ponto de inserção!
                      pos = i;
                      break;  // interromper a busca (FOR)                     
                   }
                }
                for (j = this.cont-1; j >= pos; j--) {  // Movimentação dos dados
                    this.Vetdados[j+1] = this.Vetdados[j];
                }
                this.Vetdados[pos] = p;
                this.cont++;
                System.out.println("Inserção efetuada!");
            }
        }
        else {
            System.out.println("Cadastramento não efetuado por falta de espaço!");
        }
    }

    // algoritmo de busca sequencial simples
    // pode ser utilizado com vetores ordenados e não ordenados
    // se encontrar vai retornar a posição do objeto no vetor
    // se não encontrar vai retornar -1

    private int buscar (String nomeProc) { 
        int i, pos = -1;
        String nome;
        for (i = 0; i < cont; i++) {
            nome = this.Vetdados[i].getN();
            if (nome.equalsIgnoreCase(nomeProc) == true) {  // comparação de igualdade de Strings
                pos = i;
                break;  // termina a execução do FOR
            }
        }
        return pos;
    } 
    
    public void AtualizarPeso (String nome, double novoPeso) {
        int i;
        if (this.cont != 0) {
            i = this.buscar (nome);
            if (i == -1) {
                System.out.println("Pessoa não cadastrada!");
            }
            else {
                this.Vetdados[i].setP(novoPeso);
                System.out.println("Peso alterado com sucesso!");
            }
        }
        else {
            System.out.println("Cadastro vazio!");
        }    
    }
    
    public void ExibirPessoa (String proc) {
        int i;
        if (this.cont != 0) {
            i = this.buscar (proc);
            if (i == -1) {
                System.out.println("Pessoa não cadastrada!");
            }
            else {
                System.out.println("Dados da pessoa");
                System.out.println(this.Vetdados[i]);
            }
        }
        else {
            System.out.println("Cadastro vazio!");
        }
    }        
    public void Exibir () {
        int i;
        for (i = 0; i < cont; i++) {
            System.out.println("Pessoa " + (i+1));
            System.out.println(this.Vetdados[i]);
        }
    }  
}