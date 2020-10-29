package programa.de.conta.bancária.de.p3.poo.heranca;

public class Poupanca extends ClasseConta {
    
    public Poupanca(String C){
        super(C);
    }
    
    public void rendeJuros(){
        double juros = getSaldo() * 0.01;
        depositar(juros);
    }
}