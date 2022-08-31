package Entidades;

/**
 *
 * @author Margarita_Bravo
 */
public class Peliculas{
    public String titulo;
    public String director;
    //cambio su valor a integer ya que al hacer el comparador me devuelve error
    public Integer HorasPelicula;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, Integer HorasPelicula) {
        this.titulo = titulo;
        this.director = director;
        this.HorasPelicula = HorasPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHorasPelicula() {
        return HorasPelicula;
    }

    public void setHorasPelicula(Integer HorasPelicula) {
        this.HorasPelicula = HorasPelicula;
    }
    
    
    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", director=" + director + ", HorasPelicula=" + HorasPelicula + '}'+"\n";
    }


    
   
    
}
