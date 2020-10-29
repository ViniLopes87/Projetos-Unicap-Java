package programa.para.calcular.equação.pkgdo.pkg2º.grau.utilizando.poo;

public class Delta {
    private double a;
    private double b;
    private double c;
    
    public Delta(double A, double B, double C){
        this.a = A;
        this.b = B;
        this.c = C;
    }
    
    public double CalcularDelta(){
        double D;
        D = Math.pow(b,2) - 4 * a * c;
        return D;
    }
}