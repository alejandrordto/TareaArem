/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.lista;

/**
 *clase que imdica la applicacion.
 * @author Alejandro Rodriguez
 */
public class APP {
     private Lista lista;
     private double media;
     public APP(){
         lista= new Lista();
         media=0;
     }
     /**
      * funcion para calcular la media de un conjunto de datos
      * @return entrega la media de la lista dada 
      */
     public double getMedia(){
         Nodo x=lista.getHead();
         while (x.getSiguiente()!=null){
             media+=x.getValor();
             x=x.getSiguiente();
         }
         media+=x.getValor();
         media=media/lista.getNumeroElementos();
         return media;
     }
     /**
      * funcion que calcula la desviacion estandar de la lista
      * @return da la desviacion estandar de la lista 
      */
     public double getDesviacion(){
         double desviacion=0;
         int base=2;
         Nodo x=lista.getHead();
         while (x.getSiguiente()!=null){
             desviacion+=(double) Math.pow(x.getValor()-media,base);
             x=x.getSiguiente();
         }
         desviacion+=(double) Math.pow(x.getValor()-media,base);
         desviacion=Math.sqrt(desviacion/(lista.getNumeroElementos()-1));
         return desviacion;
     }
     /**
      * funcion usada para leer el fichero dado y obtener la lista
      * @param file direccion del archivo .txt que se leera
      */
     public void leer(String file){
         lista.leer(file);
         System.out.println("Media: " +getMedia());
         System.out.println("Desviacion estandar: 0"+getDesviacion());
     }

    public Lista getLista() {
        return lista;
    }
     
     public static void main( String[] args )
    {
        APP app=new APP();
        String prub;
        prub="test1.txt";
        app.leer(prub);
    }
}
