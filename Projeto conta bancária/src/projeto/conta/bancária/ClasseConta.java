package projeto.conta.bancária;

public class ClasseConta {
     private double saldo;
     private int numero;
     
public ClasseConta(double S,int N){
    saldo = S;
    numero = N;
}
private void setS(double s){
    saldo = s;
}
private double getS(){
    return saldo;
}
private void setN(int n){
    numero = n;
}
private int getN(){
    return numero;
}
public void VerSaldo(){
    double sal;
    int num;
    sal = getS();
    num = getN();
    System.out.println("O saldo bancário da conta " + num + " é igual à R$" + sal);
}
public void depositar(double valor){
    double saldoAtual;
    double saldoNovo;
    saldoAtual = getS();
    saldoNovo = saldoAtual + valor;
    setS(saldoNovo);
}
public void sacar(double valor){
    double saldoAtual;
    double saldoNovo;
    saldoAtual = getS();
    
    if(saldoAtual >= valor){
        saldoNovo = saldoAtual - valor;
        setS(saldoNovo);
    }
    else{
        System.out.println("Saldo insuficiente");
    }
}
}