package objetos;
import java.util.Scanner;

/**
 *  La clase sala se trata de un objeto. Las salas tienen un ID (int) que representa el código único de la sala.
 *  Otro de sus atributos es un array (String) de butacas, que representa los asientos del cine,
 *  tienen unas filas (siempre un numero positivo y + de 10).
 *  El ultimo atributo que compone una sala de cine es un objeto. Este objeto es la película que emiten.
 */
public class Sala {

    Scanner sc = new Scanner(System.in);

    // VARIABLES

    private int idSala;
    private String[][] seats;
    private Pelicula movie;

    // VARIABLES

    int answerUserBuySeat;
    int answerUserBuySeat2;
    int fila;
    int columna;
    String email = "";
    boolean flagCompra = false;

    // CONSTRUCTOR

    public Sala(int idSala, int columna, int fila, Pelicula movie) {
        this.idSala = idSala;
        seats = new String[fila][columna];
        this.movie = movie;
    }

    // METODOS

    // GETTER Y SETTER

    /**
     * METODO getIdSala
     * Muestra el id de la Sala. Este es un atributo tipo int (numero entero).
     * @return idSala
     */

    public int getIdSala() {
        return idSala;
    }

    /**
     * METODO setIdSala
     * Cambia el id de la sala. Debe ser un valor de tipo entero.
     * @param idSala
     */

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    /**
     * METODO getSeats
     * Muestra las butacas de la sala. Se trata de una matriz de Strings. En el caso de estar vacia, imprime nulls.
     *
     * @return seats
     */

    public String[][] getSeats() {
        return seats;
    }

    /**
     * METODO seatSeats
     * Cambia la disposicion de las butacas de la sala. Tanto las columnas como las filas (int).
     * @param seats
     */

    public void setSeats(String[][] seats) {
        this.seats = seats;
    }

    /**
     * METODO getMovie
     * Muestra la pelicula que se emite en la sala. Esta es un objeto que tiene sus propios atributos.
     * @return movie
     */

    public Pelicula getMovie() {
        return movie;
    }

    /**
     * METODO setMovie
     * Modifica la pelicula que se emite en la sala, esta es un objeto que tiene sus propios atributos. Dos o más salas pueden tener varias peliculas.
     * @param movie
     */

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }


    // VER BUTACAS

    /**
     * Muestra las butacas de la sala elegida. Después de imprimir en consola,
     * hace una pregunta al usuario de si desea comprar la entrada (variable answerUserBuySeat).
     * En el caso de ser 1 (si desea hacer una compra), redirige a otro método, que es el método de compra buySeats().
     * En el caso de ser diferente a 2, redirige de nuevo a la Home.
     */
    public void showSeats() {

        System.out.println("\n === CINES CINESSA === ");
        System.out.println("\n La sala cuenta con diez filas de cinco asientos. \n");

        System.out.println("   ========= PANTALLA CINE ========= \n");

        for (String[] fila : seats) {

            for (String elemento : fila) {
                System.out.printf("%7s", elemento);
            }

            System.out.println("\n");
        }

        System.out.print("\n Desea comprar una butaca? [1] SI [2] NO: ");
        answerUserBuySeat2 = sc.nextInt();

        if (answerUserBuySeat2 == 1) {

            // REDIRIGE A COMPRAR BUTACA

            buySeats();

        }
    }

    // COMPRAR Y OCUPAR BUTACA

    /**
     * METODO buySeats
     * Este método te deja comprar las butacas. No recibe ninguna variable.  Se trata de un bucle de compra que solo saldrá de
     * el en el caso de haber hecho la compra de entrada o de haber decidido finalmente no comprarla. (flagCompra == true).
     * En el caso de que el asiento no este libre (! = null) , vuelve a solicitar los datos a
     * introducir (fila (int)/columna (int)/email (String)).
     */

    public void buySeats() {

        do {

            System.out.println("\n === CINES CINESSA === ");
            System.out.println("\n Introduzca la fila [Del 1 al 10]: \n");
            System.out.print("\n >>> ");
            fila = sc.nextInt();

            System.out.println("\n Introduzca el asiento [Del 1 al 5] : \n");
            System.out.print("\n >>> ");
            columna = sc.nextInt();

            System.out.println("\n Introduzca su correo electronico : \n");
            System.out.print("\n >>> ");
            email = sc.next();

            System.out.println("\n Usted ha seleccionado la fila " + fila + " y el asiento " + columna + ".");

            fila--;
            columna--;

            // COMPROBAMOS QUE ESTA LIBRE

            if (seats[fila][columna] == null) {

                System.out.print("\n Desea finalizar la compra? [1] SI [2] NO: ");
                answerUserBuySeat = sc.nextInt();

                if (answerUserBuySeat == 1) {

                    seats[fila][columna] = email;

                    System.out.println(
                            "\n COMPRA FINALIZADA. En el correo electronico de la compra encontrara las entradas.");
                    flagCompra = true;

                } else {

                    System.out.println("\n Usted está siendo redirigido a la HOME. ");
                    flagCompra = true;
                }

            } else {

                System.out.println(" La butaca que ha seleccionado esta ocupada. Por favor, seleccione otra.");

            }

        } while (flagCompra != true);
        {

        }

    }
}
