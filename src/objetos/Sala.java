package objetos;
import java.util.Scanner;

/**
 *  La clase sala representa una sala
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
     * Muestra el id de la Sala.
     * @return idSala
     */

    public int getIdSala() {
        return idSala;
    }

    /**
     * METODO setIdSala
     * Cambia el id de la sala
     * @param
     */

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    /**
     * METODO getSeats
     * Muestra las butacas de la sala
     * @return seats
     */

    public String[][] getSeats() {
        return seats;
    }

    /**
     * METODO seatSeats
     * Cambia las butacas de la sala
     * @param
     */

    public void setSeats(String[][] seats) {
        this.seats = seats;
    }

    /**
     * METODO getMovie
     * Muestra la pelicula que se emite en la sala
     * @return movie
     */

    public Pelicula getMovie() {
        return movie;
    }

    /**
     * METODO setMovie
     * Modifica la pelicula que se emite en la sala
     * @param movie
     */

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }


    // VER BUTACAS

    /**
     * METODO showSeats
     *
     * Muestra las butacas de la sala elegida.
     * En el caso de querer comprar una entrada, te redirige a otro metodo.
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
     *
     * Este metodo te deja comprar las butacas. En el caso de que esta este ocupada
     * da error y puedes introducir de nuevo otra fila y otro asiento.
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
