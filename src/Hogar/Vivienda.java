/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *<h2>Este es un comentario de Javadoc</h2>
 * 
 * @author Franklin Estrada
 */
public class Vivienda {
    /**
     * Atributo precio de la vivienda. Tipo double
     */
    private double precio;
    /**
     * Atributo numHabitaciones de la vivienda. Tipo int
     */
    private int numHabitaciones;
    /**
     * Atributo superficie de la vivienda. Tipo double
     */
    private double superficie;
    /**
     * Atributo parking de la vivienda. Tipo boolean
     */
    private boolean parking;
    /**
     * Atributo estado de la vivienda. Tipo string
     */
    private String estado;
    /**
     * Atributo propietario de la vivienda. Tipo string
     */
    private String propietario;
    
    /**
     * Constructor con 1 parametro. 
     * Crea objetos Vivienda con precio
     * @param precio.Precio de la vivienda
     */
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * Metodo actualizarPrecio con 1 parametro. 
     * Actualiza el precio de la vivienda.
     * @param descuento.Descuento que se le resta al precio de la vivienda
     */
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean getParking() {
        return parking;
    }

    public String getEstado() {
        return estado;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
     /**
     * Constructor con 6 parametros.
     * Crea objetos Vivienda con precio,numHabitaciones,superficie,parking,estado y propietario,.
     * @param precio.Este es el precio
     * @param numHabitaciones. Este es el numero de habitaciones
     * @param superficie. Este es la superficie
     * @param parking. Este es el parking
     * @param estado. Este es el estado
     * @param propietario. Este es el estado
     */

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    
   
    
}
