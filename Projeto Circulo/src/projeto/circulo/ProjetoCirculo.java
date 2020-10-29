package projeto.circulo;

import java.util.Scanner;

public class ProjetoCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circulo c1 = new Circulo(2,3,6);
        double area;
        int x, y , r;
        area = c1.calcularArea();
        System.out.println("Área: " + area);
        c1.calcularCircunferencia();
        System.out.println("Informe o centro do circulo a ser criado");
        System.out.print("X: ");
        x = input.nextInt();
        System.out.print("Y: ");
        y = input.nextInt();
        System.out.print("Raio: ");
        r = input.nextInt();
        Circulo c2 = new Circulo (x,y,r);
        area = c2.calcularArea();
        System.out.println("Área: " + area);
        c2.calcularCircunferencia();
        c1.distanciaEntre(c2);
    }   
}