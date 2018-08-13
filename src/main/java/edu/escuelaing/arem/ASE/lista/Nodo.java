package edu.escuelaing.arem.ASE.lista;

/**
 *
 * @author AsusPC
 */
public class Nodo {
    private Nodo siguiente;
    private double valor;
    public Nodo (double valor){
        this.valor=valor;
        this.siguiente=null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public double getValor() {
        return valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
