package coleccion.pkg3;
import Servicios.ServiciosAlumno;
import java.util.Scanner;

/**
 *
 * @author Margarita_Bravo
 */
public class Coleccion3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //intanciando el servicio
        ServiciosAlumno serAlum = new ServiciosAlumno();

        
        String respuesta;
        //creo el bucle para pedir los alumnos
        do {
            serAlum.crearAlumno();
            System.out.println(" Quiere ingresar un nuevo alumno si/no");
            respuesta = leer.next();
            
        } while (respuesta.equals("si"));
        
        //lamo al metodo para el promedio
        serAlum.notaFinal();

    }
}
