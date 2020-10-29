package programa.de.conta.bancária.de.p3.poo;

public class ClasseConta {
    private String Conta;
    private double Saldo;
    
    public ClasseConta(String C){
        this.Conta = C;
        Saldo = 0;
    }
    public void setSaldo(double s){
        this.Saldo = s;
    }
    public double getSaldo(){
        return this.Saldo;
    }
    public String getConta(){
        return this.Conta;
    }
    public void depositar(double valor){
        Saldo = Saldo + valor;
    }
    public boolean sacar(double valor){
        if(valor > Saldo){
            return false;
        }
        else{
            Saldo = Saldo - valor;
            return true;
        }
    }
}