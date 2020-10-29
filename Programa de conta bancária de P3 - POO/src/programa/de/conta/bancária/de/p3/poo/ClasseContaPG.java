package programa.de.conta.bancária.de.p3.poo;

public class ClasseContaPG extends ClasseConta {
    
    public ClasseContaPG(String C){
        super(C);
    }
    
    @Override  // Com Sobrescrita
    public boolean sacar(double valor) {
        double valorReal = valor + valor * 0.0001;
        return super.sacar(valorReal);
    }
    
    public boolean sacar(double valor, double percentualImposto) {  // Com Sobrecarga
		double valorReal = valor + valor*percentualImposto;
		return super.sacar(valorReal);
	}
    
    @Override  // Com Sobrescrita
    public void depositar(double valor){
        double valorReal = valor - valor * 0.0001;
        super.depositar(valorReal);
    }
}