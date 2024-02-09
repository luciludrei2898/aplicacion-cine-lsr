package objetos;
/**
 * La clase cine representa un cine
 */
public class Cine {

    // ATRIBUTOS

    private String nameCinema;
    private int capacity;
    private Sala[] salas;

    // CONSTRUCTOR

    public Cine(String nameCinema, int capacity, int numsalas) {
        this.nameCinema = nameCinema;
        this.capacity = capacity;
        salas = new Sala[numsalas];
    }

    // METODOS

    // GETTER & SETTER

    /**
     *
     * @return nombre del cine
     */
    public String getNameCinema() {
        return nameCinema;
    }

    /**
     *
     * @param nameCinema cambia el nombre del cine
     */
    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    /**
     *
     * @return aforo del cine
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @param capacity cambia el aforo del cine
     */

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *
     * @return el array de las salas
     */

    public Sala[] getSalas() {
        return salas;
    }

    /**
     *
     * @param salas cambia el numero de salas
     */

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}
