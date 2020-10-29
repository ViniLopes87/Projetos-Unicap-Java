package br.unicap.ed1.TiposdeDados;

public interface Objeto <T>{
    public abstract T clone ();
    
    public abstract int compareTo (T obj);
}