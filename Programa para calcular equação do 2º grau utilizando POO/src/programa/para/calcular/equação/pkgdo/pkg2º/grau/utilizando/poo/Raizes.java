package programa.para.calcular.equação.pkgdo.pkg2º.grau.utilizando.poo;

public class Raizes {
    private Delta D;
    private double a;
    private double b;
    private double c;
    
    public Raizes(double A, double B, double C){
        this.a = A;
        this.b = B;
        this.c = C;
        this.D = new Delta(A,B,C);
    }
    
    public double raiz1(){
        double X1;
        X1 = (-b + Math.sqrt(D.CalcularDelta()))/(2 * a);
        return X1;
    }
    public double raiz2(){
        double X2;
        X2 = (-b - Math.sqrt(D.CalcularDelta()))/(2 * a);
        return X2;
    }
}
