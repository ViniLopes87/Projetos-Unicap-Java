package programa.para.operações.com.numeros.complexos;

public class ProgramaParaOperaçõesComNumerosComplexos {
    public static void main(String[] args) {
        NumeroComplexo N1 = new NumeroComplexo(1,3);
        NumeroComplexo N2 = new NumeroComplexo(1,-1);
        
        N1.imprimirB(N1.éIgual(N2));
        NumeroComplexo N3 = N1.soma(N2);
        N3.Imprimir();
        NumeroComplexo N4 = N1.subtracao(N2);
        N4.Imprimir();
        NumeroComplexo N5 = N1.multiplicacao(N2);
        N5.Imprimir();
        NumeroComplexo N6 = N1.divisao(N2);
        N6.Imprimir();
    }   
}