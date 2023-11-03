package model;

import model.SalaCine;


public class Controller {

    private SalaCine procinal; // Declarando sala de cine

    /**
     * Constructor de la clase Controller para inicializar 
     *
     * @pre No se requieren precondiciones específicas.
     * @post Se crea una instancia de Controller 
     */
    public Controller() {
        
    }

    public void inicialiceSala() {
        procinal = new SalaCine(7,7);
    }

    public String mostrarSala() {
        return procinal.toString();
    }




}
