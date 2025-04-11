package ui;

import java.util.Scanner; // Importar Scanner
import model.Controller;


public class Executable {

    //private Scanner reader;
    private Controller cont;
    private Scanner escaner; // Ponner Scanner como atributo

    /**
     * Constructor de la clase Executable para inicializar el lector de entrada y el
     * controlador.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se inicializan el lector de
     *       entrada y el controlador.
     */
    public Executable() {
        //reader = new Scanner(System.in);
        cont = new Controller();
        escaner = new Scanner(System.in); // Inicializar Scanner
    }

    /**
     * Ejecuta el programa principal de gestión de colegios.
     *
     * @pre El método debe ser llamado dentro de un contexto válido.
     * @post El programa se ejecuta y permite al usuario interactuar con las
     *       opciones disponibles.
     * @return void Este método no retorna ningún valor.
     */

    public void run() {

        cont.inicialiceSala();
        /*
        for(int i = 0; i < cont.cantidadFilas(); i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < cont.cantidadColumnas(); j++) {
                    cont.comprarSilla(i,j);
                }
            }
        }
        */
       /*
       int posicionFila, posicionColumna;
       System.out.println("Dime la coordenada fila de la silla a reservar: ");
       posicionFila = escaner.nextInt();
       escaner.nextLine(); // Evitar bug Scanner
       System.out.println("Dime la coordenada columna de la silla a reservar: ");
       posicionColumna = escaner.nextInt();
       escaner.nextLine(); // Evitar bug Scanner
       cont.comprarSilla(posicionFila, posicionColumna);
       */
       for(int i = 0; i < cont.cantidadFilas(); i++) {
            if(i % 2 != 0) {
                for(int j = 0; j < cont.cantidadColumnas(); j++) {
                    cont.comprarSilla(i,j);
                }
        }
       }
       System.out.println(cont.mostrarSala());


    }

    /**
     * Método principal (main) para iniciar la ejecución del programa.
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Executable y se ejecuta el programa principal.
     * @param args Los argumentos de la línea de comandos (no se utilizan en este
     *             caso).
     */
    public static void main(String[] args) {

        Executable mainApp = new Executable();
        mainApp.run();

    }

}