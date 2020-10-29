package programa.para.calcular.o.peso.ideal.de.pkg20.pessoas.poo.com.vetor;

import java.util.Scanner;

public class ProgramaParaCalcularOPesoIdealDe20PessoasPOOComVetor {
    public static void PreencherVet(Pessoa[]Vet){
        Scanner input = new Scanner(System.in);
        int i,idade;
        char sexo;
        String nome;
        double altura,peso;
        Pessoa P;
        
        for(i = 0;i < Vet.length;i++){
            System.out.print("Informe o nome da " + (i + 1) + "º pessoa: ");
            nome = input.nextLine();
            P = new Pessoa(nome);
            System.out.print("Informe a idade da pessoa: ");
            idade = input.nextInt();
            
            while(idade < 0){
                System.out.println("Idade inválida");
                System.out.print("Informe a idade da pessoa que não seja menor que 0: ");
                idade = input.nextInt();
            }
            
            P.setI(idade);
            System.out.print("Informe o sexo da pessoa: ");
            sexo = input.next().charAt(0);
            sexo = Character.toUpperCase(sexo);
            
            while(sexo != 'M' && sexo != 'F'){
                System.out.println("Sexo inválido");
                System.out.print("Informe o sexo da pessoa usando M ou F: ");
                sexo = input.next().charAt(0);
                sexo = Character.toUpperCase(sexo);
            }
            
            P.setS(sexo);           
            System.out.print("Informe a altura da pessoa em metros: ");
            altura = input.nextDouble();
            
            while(altura <= 0){
                System.out.println("Altura inválida");
                System.out.print("Informe a altura da pessoa em metros que seja maior que 0: ");
                altura = input.nextDouble();
            }
            
            P.setA(altura);
            System.out.print("Informe o peso da pessoa: ");
            peso = input.nextDouble(); input.nextLine();
            
            while(peso <= 0){
                System.out.println("Peso inválido");
                System.out.print("Informe o peso da pessoa: ");
                peso = input.nextDouble(); input.nextLine();
            }
            
            P.setP(peso);
            Vet[i] = P;
        }
    }
    public static void CalcularPeso(Pessoa[]Vet){
        int i;
        double pesoideal;
        
        for(i = 0;i < Vet.length;i++){
            if(Vet[i].getS() == 'M'){
            pesoideal = 72.7 * Vet[i].getA() - 58;
            }
            else{
                pesoideal = 62.1 * Vet[i].getA() - 44.7;
            }
            Vet[i].setPI(pesoideal); 
        }
    }
    public static void ExibirPessoa(Pessoa[]Vet){
        int i;
        
        for(i = 0;i < Vet.length;i++){
            System.out.println(Vet[i]);
        }
    }
    public static void main(String[] args) {
        final int TAM = 20;
        Pessoa[]VetP;
        VetP = new Pessoa[TAM];
        
        System.out.println("Informe os dados das pessoas:");
        PreencherVet(VetP);
        CalcularPeso(VetP);
        ExibirPessoa(VetP);    
    }
}