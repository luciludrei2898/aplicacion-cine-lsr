package main;
import java.util.Scanner;

import objetos.Cine;
import objetos.Pelicula;
import objetos.Sala;
public class Main {
    public static void main(String[] args) {

        // OBJETO SCANNER

        Scanner sc = new Scanner(System.in);

        // CREAMOS OBJETO CINE

        Cine cineNassica = new Cine("Nassica", 250, 5);

        // CREAMOS OBJETO PELICULAS

        Pelicula pBarbie = new Pelicula("Barbie", 114,
                "Después de ser expulsada de Barbieland por no ser una muñeca de aspecto perfecto, Barbie parte hacia el mundo humano para encontrar la verdadera felicidad.");
        Pelicula pInterstellar = new Pelicula("Interstellar", 165,
                "Un grupo de científicos y exploradores, encabezados por Cooper, se embarcan en un viaje espacial para encontrar un lugar con las condiciones necesarias para reemplazar a la Tierra y comenzar una nueva vida allí.");
        Pelicula pOppenheimer = new Pelicula("Oppenheimer", 180,
                "Durante la Segunda Guerra Mundial, el teniente general Leslie Groves designa al físico J. Robert Oppenheimer para un grupo de trabajo que está desarrollando el Proyecto Manhattan, cuyo objetivo consiste en fabricar la primera bomba atómica.");
        Pelicula pHachiko = new Pelicula("Hachiko", 94,
                "Un perro fiel llamado Hachiko acompaña cada mañana a su amo a la estación de tren y regresa cada tarde para darle la bienvenida después del trabajo. Sin embargo, esta rutina se ve rota por una desgracia.\r\n"
                        + "");
        Pelicula pBichos = new Pelicula("Bichos: Una aventura en miniatura", 92,
                "Una hormiga realiza una misión peligrosa para proteger a su colonia de un ejército de saltamontes terroristas.");

        // CREAMOS OBJETO SALA

        Sala salaUno = new Sala(1, 5, 10, pBarbie);
        Sala salaDos = new Sala(2, 5, 10, pInterstellar);
        Sala salaTres = new Sala(3, 5, 10, pOppenheimer);
        Sala salaCuatro = new Sala(4, 5, 10, pHachiko);
        Sala salaCinco = new Sala(5, 5, 10, pBichos);

        // VARIABLES USUARIO

        int optionOperation;
        int optionSeeMovie;
        int optionSeats;
        int optionHall;

        // MENU CINE

        do {

            // MENU OPERACION
            System.out.print("\n" + " === CINES CINESSA  ===" + "\n"
                    + "\n Seleccione a continuacion la operacion que desea realizar: \n" + "\n"
                    + " \n [1] VER CARTELERA. \n" + " \n [2] COMPRAR ENTRADAS. \n" + "\n [3] EXIT. \n" + " \n >>> ");

            optionOperation = sc.nextInt();

            // CONTROL DE ERRORES OPTIONOPERATION

            if (optionOperation == 1 || optionOperation == 2) {

                // OPCION VER ENTRADAS

                if (optionOperation == 1) {

                    System.out.println(
                            "\n" + " === CINES CINESSA ===" + "\n" + " \n TOP PELICULAS \n" + " ------------- ");
                    System.out.println("\n [1] BARBIE. \n" + "\n [2] INTERSTELLAR. \n" + "\n [3] OPPENHEIMER. \n"
                            + "\n [4] HACHIKO. \n" + "\n [5] BICHOS. \n");
                    System.out.print("\n Ampliar informacion sobre la pelicula: \n" + "\n >>> ");
                    optionSeeMovie = sc.nextInt();

                    switch (optionSeeMovie) {

                        case 1:
                            pBarbie.showMovie();

                            System.out.println("\n === CINES CINESSA === ");
                            System.out.print(
                                    "\n Mostrar disponibilidad de butacas [1] VER DISPONIBILIDAD [2] NO VER DISPONIBILIDAD: ");
                            optionSeats = sc.nextInt();
                            if (optionSeats == 1) {
                                salaUno.showSeats();
                            }

                            break;

                        case 2:
                            pInterstellar.showMovie();
                            System.out.println("\n === CINES CINESSA === ");
                            System.out.print(
                                    "\n Mostrar disponibilidad de butacas [1] VER DISPONIBILIDAD [2] NO VER DISPONIBILIDAD: ");
                            optionSeats = sc.nextInt();
                            if (optionSeats == 1) {
                                salaDos.showSeats();
                            }

                            break;

                        case 3:
                            pOppenheimer.showMovie();
                            System.out.println("\n === CINES CINESSA === ");
                            System.out.print(
                                    "\n Mostrar disponibilidad de butacas [1] VER DISPONIBILIDAD [2] NO VER DISPONIBILIDAD: ");
                            optionSeats = sc.nextInt();
                            if (optionSeats == 1) {
                                salaTres.showSeats();
                            }

                            break;

                        case 4:
                            pHachiko.showMovie();
                            System.out.println("\n === CINES CINESSA === ");
                            System.out.print(
                                    "\n Mostrar disponibilidad de butacas [1] VER DISPONIBILIDAD [2] NO VER DISPONIBILIDAD: ");
                            optionSeats = sc.nextInt();
                            if (optionSeats == 1) {
                                salaCuatro.showSeats();
                            }

                            break;

                        case 5:
                            pBichos.showMovie();
                            System.out.println("\n === CINES CINESSA === ");
                            System.out.print(
                                    "\n Mostrar disponibilidad de butacas [1] VER DISPONIBILIDAD [2] NO VER DISPONIBILIDAD: ");
                            optionSeats = sc.nextInt();
                            if (optionSeats == 1) {
                                salaCinco.showSeats();
                            }

                            break;

                        default:
                            System.out.println("\n INCORRECTO. Error de respuesta.");
                    }

                    // OPCION COMPRAR ENTRADAS

                } else if (optionOperation == 2) {

                    // MOSTRAMOS LAS SALAS
                    System.out.println("\n === CINES CINESSA === \n");

                    System.out.println(" [1] Sala " + salaUno.getIdSala() + ": " + salaUno.getMovie().getName() + "\n");
                    System.out.println(" [2] Sala " + salaDos.getIdSala() + ": " + salaDos.getMovie().getName() + "\n");
                    System.out.println(" [3] Sala " + salaTres.getIdSala() + ": " + salaTres.getMovie().getName() + "\n");
                    System.out.println(" [4] Sala " + salaCuatro.getIdSala() + ": " + salaCuatro.getMovie().getName() + "\n");
                    System.out.println(" [5] Sala " + salaCinco.getIdSala() + ": " + salaCinco.getMovie().getName() + "\n");

                    // PREGUNTAMOS QUE SALA QUIERE VER

                    System.out.print(" --------------------------------------------------------------- \n");
                    System.out.print("\n INTRODUZCA LA SALA DESEADA PARA VER SU DISPONIBILIDAD [1 - 5]: ");
                    optionHall = sc.nextInt();

                    // REDIRIGIMOS A LA VISUALIZACION DE BUTACAS Y COMPRA DE ENTRADA

                    switch (optionHall) {
                        case 1:
                            salaUno.showSeats();
                            break;
                        case 2:
                            salaDos.showSeats();
                            break;
                        case 3:
                            salaTres.showSeats();
                            break;
                        case 4:
                            salaCuatro.showSeats();
                            break;
                        case 5:
                            salaCinco.showSeats();
                            break;
                        default:
                            System.out.println("\n INCORRECTO. Error de respuesta.");
                    }

                }

            } else if (optionOperation < 1 || optionOperation > 3) {
                System.out.println("\n" + "Error de respuesta. Introduzca de nuevo la opcion a realizar.");
            }

        } while (optionOperation != 3);
        {

            System.out.println("\n" + " \n === HASTA PRONTO ===" + "\n"
                    + " \n Muchas gracias por disfrutar del cine con CINESSA. ");

        }

    }
}
