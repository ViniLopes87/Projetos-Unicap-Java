package programa.para.operações.com.numeros.complexos;

public class NumeroComplexo {
    private double real;
    private double imaginario;
    
    public NumeroComplexo(double a, double b){
        this.real = a;
        this.imaginario = b;
    }
    
    public NumeroComplexo soma(NumeroComplexo c) {
        double novoR = this.real + c.real;
        double novoI = this.imaginario + c.imaginario;
        NumeroComplexo novo = new NumeroComplexo(novoR,novoI);
        return novo;
    }
    
    public NumeroComplexo subtracao(NumeroComplexo c) {
        double novoR = this.real - c.real;
        double novoI = this.imaginario - c.imaginario;
        NumeroComplexo novo = new NumeroComplexo(novoR,novoI);
        return novo;
    }
    
    public NumeroComplexo multiplicacao(NumeroComplexo c) {
        double aux  = this.real;
        double novoR = this.real * c.real - this.imaginario * c.imaginario;
        double novoI = aux * c.imaginario + this.imaginario * c.real;
        NumeroComplexo novo = new NumeroComplexo(novoR,novoI);
        return novo;
    }
    
    public NumeroComplexo divisao(NumeroComplexo c){
        double aux  = this.real;
        double aux2 = c.imaginario * -1;
        
        this.real = this.real * c.real - this.imaginario * aux2;
        this.imaginario = aux * aux2 + this.imaginario * c.real;
        
        double novoR = this.real/(Math.pow(c.real, 2) + Math.pow(c.imaginario, 2));
        double novoI = this.imaginario/(Math.pow(c.real, 2) + Math.pow(c.imaginario, 2));
        NumeroComplexo novo = new NumeroComplexo(novoR,novoI);
        return novo;
    }
    
    public boolean éIgual(NumeroComplexo c){
        if(this.real == c.real && this.imaginario == c.imaginario){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void Imprimir(){
        System.out.println("(" + this.real + " + " + this.imaginario + "i)");
    }
    public void imprimirB(boolean b){
        System.out.println(b);
    }
}