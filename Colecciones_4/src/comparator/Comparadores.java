/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;
import Entidades.Peliculas;
import java.util.Comparator;

/**
 *
 * @author Margarita_Bravo
 */
public class Comparadores {
    public static Comparator<Peliculas>ordenPorDuracionAsce=new Comparator<Peliculas>(){ 
       @Override 
       public int compare(Peliculas o1,Peliculas o2){
            return o1.getHorasPelicula().compareTo(o2.getHorasPelicula());
        }
   };   
    public static Comparator<Peliculas>ordenPorDuracionDescendente=new Comparator<Peliculas>(){
        @Override 
        public int compare(Peliculas p,Peliculas d){
            return d.getHorasPelicula().compareTo(p.getHorasPelicula());
      
        }    
    }; 
    public static Comparator<Peliculas>ordenPorAlfabTitulo=new Comparator<Peliculas>(){
        @Override 
        public int compare(Peliculas o1,Peliculas o2){
            return o1.getTitulo().compareTo(o2.getTitulo());
        
        }    
    };
    public static Comparator<Peliculas>ordenPorAlfabDirector=new Comparator<Peliculas>(){
        @Override 
        public int compare(Peliculas o1,Peliculas o2){
            return o1.getDirector().compareTo(o2.getDirector());
        
        }    
    };
}
