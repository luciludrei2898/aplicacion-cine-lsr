package objetos;
/**
 * La clase pelicula representa una pelicula
 */
public class Pelicula {

    // ATRIBUTOS

    private String name;
    private int time;
    private String description;

    // CONSTRUCTOR

    // LLENO

    public Pelicula(String name, int time, String descripcion) {
        this.name = name;
        this.time = time;
        this.description = descripcion;
    }

    // METODOS
    // GETTER Y SETTER

    /**
     * METODO getName
     * Muestra el nombre de la pelicula
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * METODO setName
     * Modifica el nombre de la pelicula
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * METODO getTime
     * Retorna la duracion en min de la pelicula
     * @return
     */
    public int getTime() {
        return time;
    }

    /**
     * METODO setTime
     * Modifica la duracion en min de la pelicula
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }

    // VER DATOS DE LA PELICULA

    /**
     * METODO showMovie
     * Muestra el nombre, la duracion y la sipnosis de la pelicula.
     */

    public void showMovie() {

        System.out.println("\n === CINES CINESSA === ");
        System.out.println("\n Nombre de la pelicula: " + name + ".");
        System.out.println(" Duracion: " + time + " minutos.");
        System.out.println(" Sipnosis: " + description);

    }
}
