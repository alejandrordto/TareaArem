package edu.escuelaing.arem.ASE.lista;

/**
 *
 * @author AsusPC
 */
public class Lista {
    private Nodo head;
    private Nodo tail;
    private int numeroElementos;
    
    public Lista(){
        head=null;
        numeroElementos=0;
    }
    public void add(double numero){
        numeroElementos++;
        if (head==null){
            head= new Nodo(numero);
            tail=head;
        } else{
            Nodo Temp= new Nodo(numero);
            tail.setSiguiente(Temp);
            tail=Temp;
        }
    }

    public Nodo getHead() {
        return head;
    }
    
    public int getNumeroElementos() {
        return numeroElementos;
    }
    
}
