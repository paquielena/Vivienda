/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Paqui Elena
 */
public class Vivienda {

    /**
     * Metodo que devuelve el precio de la vivienda
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo que establece el precio de la vivienda
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo que devuelve el numero de habitaciones de la vivienda
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Metodo que establece el numero de habitaciones de la vivienda
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Metodo que devuelve la superficie de la vivienda
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Metodo que establece la superficie de la vivienda
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Metodo que devuelve un true si la vivienda tiene parking o false en caso contrario
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Metodo que establece si la vivienda tiene parking
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Metodo que devuelve el estado de la vivienda
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo que establece el estado de la vivienda
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Metodo que devuelve el propietario de la vivienda
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Metodo que establece el propietario de la vivienda
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * variable privada: precio de la vivienda
     */
    private double precio;
    
    /**
     * variable privada: numero de habitaciones de la vivienda
     */
    private int numHabitaciones;
    
    /**
     * variable privada: superficie de la vivienda
     */
    private double superficie;
    
    /**
     * variable privada: booleano que indica si hay parking en la vivienda
     */
    private boolean parking;
    
    /**
     * variable privada: cadena que representa el estado de la vivienda
     */
    private String estado;
    
    /**
     * variable privada: cadena que representa el propietario de la vivienda
     */
    private String propietario;
    
    /**
     * Constructor de clase que inicializa todos los atributos
     * @param precio Precio de la vivienda
     * @param numHabitaciones Numero de habitaciones de la vivienda
     * @param superficie Superficie de la vivienda
     * @param parking Indica si la vivienda tiene parking o no
     * @param estado Indica el estado de la vivienda
     * @param propietario Cadena que representa el propietario de la vivienda
     */

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /**
     * Constructor de clase que inicializa el atributo precio
     * @param precio Precio de la vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Metodo que actualiza el precio de la vivienda
     * @param descuento Porcentaje que se le resta al precio de la vivienda
     */
    public void actualizarPrecio(Double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }

    
}
