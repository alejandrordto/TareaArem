/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.lista;

/**
 *
 * @author AsusPC
 */
public class APP {
     private Lista lista;
     private double media;
     public APP(){
         lista= new Lista();
         media=0;
     }
     public double getMedia(){
         Nodo x=lista.getHead();
         media+=x.getValor();
         while (x.getSiguiente()!=null){
             media+=x.getValor();
             x=x.getSiguiente();
         }
         return media/lista.getNumeroElementos();
     }
     public double getDesviacion(){
         double desviacion=0;
         int base=2;
         Nodo x=lista.getHead();
         while (x.getSiguiente()!=null){
             desviacion+=(double) Math.pow(x.getValor()-media,base);
             x=x.getSiguiente();
         }
         Math.sqrt(desviacion/lista.getNumeroElementos()-1);
         return desviacion;
     }
     public static void main( String[] args )
    {
        
    }
}
