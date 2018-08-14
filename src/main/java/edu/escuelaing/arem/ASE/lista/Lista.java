package edu.escuelaing.arem.ASE.lista;

import java.io.*;

/**
 *
 * @author AsusPC
 */
public class Lista {
    private Nodo head;
    private Nodo tail;
    private int numeroElementos;
    private String txt="";
    
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
    public void leer(String file){
        try{
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String bfRead;
            while ((bfRead=bf.readLine()) != null){
                this.add(Double.parseDouble(bfRead));
            }
        } catch (Exception e){
            System.err.println("No se encontro el archivo ");
        }
    }

    @Override
    public String toString() {
         Nodo temp=head;
         while (head.getSiguiente()!= null){
            txt=txt+temp.getValor();
            temp=temp.getSiguiente();
         }
        return txt;
    }
    
}
