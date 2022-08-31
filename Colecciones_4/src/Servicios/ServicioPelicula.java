package Servicios;
import Entidades.Peliculas;
import comparator.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Margarita_Bravo
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //creo el list para peliculas

    //metodo para crear peliculas
    public Peliculas crearPeliculas(Peliculas p1) {

        //pido los valores
        System.out.println("Ingrese el titulo de la pelicula");
        p1.setTitulo(leer.next());

        System.out.println("Ingrese el nombre del director");
        p1.setDirector(leer.next());

        System.out.println("Ingrese la duracion EN HORAS de la pelicula");
        p1.setHorasPelicula(leer.nextInt());

        System.out.println(p1.toString());
        return p1;
    }
    
    //mostrar todas las peliculas cargadas 
    public ArrayList<Peliculas> mostrar(ArrayList<Peliculas> listaPeliculas) {
        System.out.println("LAS PELICULAS CARGADAS SON :");
        System.out.println(listaPeliculas);
        System.out.println("---------------------------------------------------");
        return listaPeliculas;
    }
   //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public ArrayList<Peliculas> peliculasMayorUnaHora(ArrayList<Peliculas> listaOrdenada) {
        ArrayList<Peliculas> peliculasConMasTiempo = new ArrayList();

        //for para recorrer el list de peliculas e if con condicion y acum
        for (Peliculas auxListaPelicula : listaOrdenada) {
            if (auxListaPelicula.getHorasPelicula() > 1) {
                peliculasConMasTiempo.add(auxListaPelicula);
            }
        }
        System.out.println("LISTA DE PELICULAS CON DURACION MAYOR A UNA HORA ES :");
        System.out.println(peliculasConMasTiempo.toString());
        System.out.println("---------------------------------------------------");
        return peliculasConMasTiempo;

    }

    //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo
    //en pantalla.
    public ArrayList<Peliculas> ordenAscendente(ArrayList<Peliculas> menorAmayor) {
        System.out.println("PELICULAS ORDENADAS DE MENOR A MAYOR DE ACUERDO A SU DURACION : ");
        Collections.sort(menorAmayor, Comparadores.ordenPorDuracionAsce);
        System.out.println(menorAmayor);
        System.out.println("---------------------------------------------------");
        return menorAmayor;

    }
    
    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo
    //en pantalla. 
    public ArrayList<Peliculas> ordenDescendente(ArrayList<Peliculas> mayorMenor) {
        System.out.println("PELICULAS ORDENADAS DE MAYOR A MENOR DE ACUERDO A SU DURACION : ");
        Collections.sort(mayorMenor, Comparadores.ordenPorDuracionDescendente);
        System.out.println(mayorMenor);
        System.out.println("---------------------------------------------------");
        return mayorMenor;

    }

    //Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
    public ArrayList<Peliculas> ordenProTitulo(ArrayList<Peliculas> ordenTitulo) {
        System.out.println("PELICULAS ORDENADAS POR TITULO ");
        Collections.sort(ordenTitulo, Comparadores.ordenPorAlfabTitulo);
        System.out.println(ordenTitulo);
        System.out.println("---------------------------------------------------");
        return ordenTitulo;
    }

    //Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
    public ArrayList<Peliculas> ordenPorDirector(ArrayList<Peliculas> ordenDirector) {
        System.out.println("PELICULAS ORDENADAS POR TITULO ");
        Collections.sort(ordenDirector, Comparadores.ordenPorAlfabDirector);
        System.out.println(ordenDirector);
        System.out.println("---------------------------------------------------");
        return ordenDirector;
    }
}



