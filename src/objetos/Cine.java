package objetos;
/**
 * El clase Cine se trata de un objeto. Esta compuesto de tres atributos, nombre (string), capacidad (int) y
 * un array de objetos de Salas. Este array es variable y se puede modificar
 * según lo que se introduzca en el constructor. */
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
     *  Muestra el nombre del cine.
     * @return el nombre del cine (tipo string)
     */
    public String getNameCinema() {
        return nameCinema;
    }

    /**
     *  Cambia el nombre del cine. Al ser tipo string, permite caracteres ASCII. En este caso el nombre se construye desde el constructor.
     *  No desde metodos.
     * @param nameCinema cambia el nombre del cine
     */
    public void setNameCinema(String nameCinema) {
        this.nameCinema = nameCinema;
    }

    /**
     *  El aforo es la capacidad del cine de albergar personas. Este debe ser un numero siempre mayor de 0.
     * @return aforo del cine (tipo int)
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     *  El aforo es modificado con el metodo setCapacity. Esta variable de un num entero (int).
     * @param capacity cambia el aforo del cine (tipo int)
     */

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     *  El atributo salas es un array de objetos. En este caso, en el constructor indicamos cuantas salas queremos tener pero
     *  no cuales son. Las que estan dentro se construyen en el main.
     * @return el array de las salas (null en el caso de estar vacio).
     */

    public Sala[] getSalas() {
        return salas;
    }

    /**
     *  Para modificar el numero de salas. Este es un array de objetos, en el caso de cambiar su longitud/capacidad, se rellena con null.
     * @param salas cambia el numero de salas
     */

    public void setSalas(Sala[] salas) {
        this.salas = salas;
    }
}
