package coleccion.pkg4;
import Entidades.Peliculas;
import Servicios.ServicioPelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Margarita_Bravo
 */
public class Coleccion4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //instanciamos el servicio
        ServicioPelicula servPeli = new ServicioPelicula();

        //creamos una lista de peliculas
        ArrayList<Peliculas> listaPeliculas = new ArrayList();

        //bucle para crear todas las peliculas que el usuario quiera 
        String respuesta;
        do {
            //instancia de la pelicula
            Peliculas p1 = new Peliculas();
            servPeli.crearPeliculas(p1);
            
            //agregamos peliculas a la lista de peliculas
            listaPeliculas.add(p1);
           
            System.out.println("Quiere cargar otra pelicula? si/no");
            respuesta = leer.next();
        } while (respuesta.equals("si"));
        //llamamos a los metodos
        servPeli.mostrar(listaPeliculas);
        servPeli.peliculasMayorUnaHora(listaPeliculas);
        servPeli.ordenAscendente(listaPeliculas);
        servPeli.ordenDescendente(listaPeliculas);
        servPeli.ordenProTitulo(listaPeliculas);
        servPeli.ordenPorDirector(listaPeliculas);
    }

}
