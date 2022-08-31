package Servicios;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Margarita_Bravo
 */
public class ServiciosAlumno {

    
    Scanner leer = new Scanner(System.in);
    //creo un arrayList para guardar a todos los alumnos ingresados
    ArrayList<Alumno> alumnos = new ArrayList();
    
    //creo el metodo para alumnos
    public ArrayList<Alumno> crearAlumno() {
        Alumno a1 = new Alumno();

        ArrayList notas = new ArrayList();

        System.out.println("Ingrese el nombre del alumno ");
        a1.setNombre(leer.next());

        System.out.println("Ingrese la primer nota del alumno : " + a1.getNombre());
        int nota1 = leer.nextInt();
        //agrego las notas ingresadas al arrayList de notas
        notas.add(nota1);

        System.out.println("Ingrese la segunda nota del alumno : " + a1.getNombre());
        int nota2 = leer.nextInt();
        //agrego las notas ingresadas al arrayList de notas
        notas.add(nota2);

        System.out.println("Ingrese la tercer nota del alumno : " + a1.getNombre());
        int nota3 = leer.nextInt();
        //agrego las notas ingresadas al arrayList de notas
        notas.add(nota3);
        
        //guardo las notas en un objeto alumno
        a1.setNotas(notas);
        
        //guardo in alumno en el arrayList de alumno
        alumnos.add(a1);

        System.out.println("");
        
        //for para imprimir el arrayAlumno
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
        return alumnos;

    }
    
    //metodo para sacar el promedio del alumno buscado
    public int notaFinal() {
        int totalNotas = 0;
        int promedio;
        
        //pido el alumno a buscar
        System.out.println("Ingrese el nombre del alumno que quiere calcular su nota");
        String buscarNombre = leer.next();
        
        //for para recorrer el  el array de alumnos y buscar el nombre 
        for (Alumno alumnoTotal : alumnos) {
            
            //if para condicionar al for que me busque las notas del nombre que quiero buscar
            if (buscarNombre.equals(alumnoTotal.getNombre())) {
                System.out.println(buscarNombre);
                
                //for para recorrer las notas del alumno buscado y sumarlas y guardarlas en un acumulador
                for (int i = 0; i < alumnoTotal.getNotas().size(); i++) {
                    totalNotas = totalNotas + alumnoTotal.getNotas().get(i);
                }
            }
        }
        //saco el promedio de las notas y lo mustro
        promedio = totalNotas / 3;
        System.out.println("Notas total del alumno :" + totalNotas);
        System.out.println("Y su promedio " + promedio);
        return promedio;
    }
}
//        Iterator<Alumno> it = alumnos.iterator();
//        String n = leer.next();
//        while (it.hasNext()) {
//            Alumno aux = it.next();
//
//            if (aux.getNombre().equals(n)) {
//                //System.out.println("Usted ingreso " + n);
//                System.out.println("El alumno :" + n + " esta en la lista");
//            }
//        }
//
//        for (Alumno alumno : alumnos) {
//            if (alumno.getNombre().equals(n)) {
//                for (int i = 0; i < alumno.getNotas().size(); i++) {
//                    c = c + alumno.getNotas().get(i);
//                }
//
//            }else{
//                 System.out.println("El alumno no se encuentra en la lista");
//            }
//        }
//       
//
//        System.out.println("total de notas " + c);
//        System.out.println("el promedio de nota  es " + (c / 3));
//       
//
// }
//}
