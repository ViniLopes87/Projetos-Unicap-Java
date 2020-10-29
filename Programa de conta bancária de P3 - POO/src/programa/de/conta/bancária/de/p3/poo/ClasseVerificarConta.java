package programa.de.conta.bancária.de.p3.poo;

public class ClasseVerificarConta {
    public boolean VerificarConta(String C){
        if(C.length() != 6){
            System.out.println("Número da conta inválido. Informe exatamente 6 caracteres");
            return false;
        }
        else if(VerificarContaNum(C) == false){
            System.out.println("Número de conta inválido. Informe apenas dígitos numéricos.");
            return false;
        }
        return true;
    }
    public static boolean VerificarContaNum(String C){
        int tam = C.length(),i;
        char num;
        boolean Resultado = true;
        
        for(i = 0;i < tam;i++){
            num = C.charAt(i);
            if(Character.isDigit(num) == false){
                Resultado = false;
                break;
            }
        }
        return Resultado;
    }
}