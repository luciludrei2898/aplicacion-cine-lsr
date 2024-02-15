package objetos;
/**
 * La clase película se trata de un objeto. Las películas tienen tres atributos, nombre (string),
 * que se refiere al título de la película.  La duración (int) se basa en minutos. Es truncal,
 * en el caso de que la pelicula tenga segundos sueltos, se hace truncal y se suma +1.
 * Y la descripción (string), que es una pequeña sipnosis de la película.
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
     * Muestra el nombre de la pelicula. Es un atributo tipo String. En el caso de estar vacio, su valor es null.
     *
     * @return name de la pelicula
     */
    public String getName() {
        return name;
    }

    /**
     * METODO setName
     * Modifica el nombre de la pelicula. Atributo tipo string.
     * @param name titulo de la pelicula cambiado.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * METODO getTime
     * Retorna la duracion en min de la pelicula. Esta se mide en minutos, es un valor entero (int) en el caso de que sea un numero decimal, debe
     * troncarse y sumarse +1.
     * @return duracion de la pelicula
     */
    public int getTime() {
        return time;
    }

    /**
     * METODO setTime
     * Modifica la duracion en min de la pelicula. Solo se pueden numeros enteros y positivos.
     * @param time
     */
    public void setTime(int time) {
        this.time = time;
    }

    // VER DATOS DE LA PELICULA

    /**
     * METODO showMovie
     * Devuelve cuatro sysos indicando el nombre del cine/cabecera:
     * El nombre de la pelicula (tipo string)
     * La duracion de la pelicula (tipo int)
     * La sipnosis de la pelicula (tipo string)
     */

    public void showMovie() {

        System.out.println("\n === CINES CINESSA === ");
        System.out.println("\n Nombre de la pelicula: " + name + ".");
        System.out.println(" Duracion: " + time + " minutos.");
        System.out.println(" Sipnosis: " + description);

    }
}
