package programa.de.conta.bancária.de.p3.poo;

public class ClasseBanco {
    private ClasseConta[]VetConta;
    private int cont;
    
    public ClasseBanco(){
        VetConta = new ClasseConta[5];
        cont = 0;
    }
    
    public void CadastrarConta (ClasseConta C) {
        int pos = this.cont, i;
        if (this.cont < this.VetConta.length) {
            i = this.buscar (C.getConta());
            if (i == -1) {  // não achou
                this.VetConta [pos] = C;
                this.cont++;
                System.out.println("Cadastro efetuado");
            }
            else {
                System.out.println("Conta já consta no cadastro! Inserção não efetuada! ");
            }
        }
        else {
            System.out.println("Cadastramento não efetuado por falta de espaço!");
        }
    }
    private int buscar (String contaProc) { 
        int i, pos = -1;
        String conta;
        for (i = 0; i < cont; i++) {
            conta = this.VetConta[i].getConta();
            if (conta.equalsIgnoreCase(contaProc) == true) {  // comparação de igualdade de Strings
                pos = i;
                break;  // termina a execução do FOR
            }
        }
        return pos;
    }
    public void CadastrarPoupanca (Poupanca P) {
        int pos = this.cont, i;
        if (this.cont < this.VetConta.length) {
            i = this.buscar (P.getConta());
            if (i == -1) {  // não achou
                this.VetConta [pos] = P;
                this.cont++;
                System.out.println("Cadastro efetuado");
            }
            else {
                System.out.println("Conta poupança já consta no cadastro! Inserção não efetuada! ");
            }
        }
        else {
            System.out.println("Cadastramento não efetuado por falta de espaço!");
        }
    }
    public void CadastrarContaPG (ClasseContaPG PG) {
        int pos = this.cont, i;
        if (this.cont < this.VetConta.length) {
            i = this.buscar (PG.getConta());
            if (i == -1) {  // não achou
                this.VetConta [pos] = PG;
                this.cont++;
                System.out.println("Cadastro efetuado");
            }
            else {
                System.out.println("Conta PG já consta no cadastro! Inserção não efetuada! ");
            }
        }
        else {
            System.out.println("Cadastramento não efetuado por falta de espaço!");
        }
    }
    public void Depositar(String C,double V){
        int i = this.buscar (C);
        
        if(i == -1){
            System.out.println("Conta não existe");
        }
        else{
            VetConta[i].depositar(V);
            System.out.println("Deposito realizado");
        }
    }
    public void Sacar(String C, double V){
        int i = this.buscar (C);
        
        if(i == -1){
            System.out.println("Conta não existe");
        }
        else{
            if(VetConta[i].sacar(V) == true){
                System.out.println("Saque realizado");
            }
            else{
                System.out.println("Saldo insuficiente para operação");
            }
        }
    }
    public void VerSaldo(String C){
        int i = this.buscar (C);
        if(i == -1){
            System.out.println("Conta não existe");
        }
        else{
            System.out.println("O saldo bancário da conta " + VetConta[i].getConta() + " é igual à R$" + VetConta[i].getSaldo());
        }
    }
    public void renderJuros(String C){
        int i = this.buscar (C);
        
        if(i == -1){
            System.out.println("Conta não existe");
        }
        else{
            if(VetConta[i] instanceof Poupanca){
                Poupanca p = (Poupanca)VetConta[i];
                p.rendeJuros();
                System.out.println("Rendendo juros");
            }
            else{
                System.out.println("Conta não é uma poupança, então não pode render juros");
            }
        }
    }
    public void Menu(){
        System.out.println("Escolha uma operação:");
        System.out.println("Digite 1 para CADASTRAR CONTA");
        System.out.println("Digite 2 para CADASTRAR POUPANÇA");
        System.out.println("Digite 3 para CADASTRAR CONTA PG");
        System.out.println("Digite 4 para DEPOSITAR");
        System.out.println("Digite 5 para SACAR");
        System.out.println("Digite 6 para VER SALDO");
        System.out.println("Digite 7 para RENDER JUROS");
        System.out.println("Digite 0 para SAIR");
        System.out.print("Opção: ");
    }
}