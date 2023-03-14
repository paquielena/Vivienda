/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * <h1>Es es un comentario en JavaDoc</h1>
 * <p>Este es el modulo de entorno</p>
 * <h2>Haciendo la segunda practica de la 2º evaluación</h2>
 * @author Kevin Paul 
 */
public class Vivienda {
    
/**
 * Atributo precio de la vivienda de tipo Double
 */    
    private double precio;
    
/**
 * Atributo numero habitaciones de la vivienda de tipo int
 */ 
    private int numHabitaciones;
    
/**
 * Atributo superficie de la vivienda de tipo double
 */ 
    private double superficie;
    
/**
 * Atributo parking de la vivienda de tipo boolean
 */
    private boolean parking;
    
    /**
 * Atributo estado de la vivienda de tipo string
 */
    private String estado;
    
    /**
 * Atributo propietario de la vivienda de tipo string
 */
    private String propietario;
    

    /**
     * Constructor con 6 parámetros
     * Crea objetos precio, numHabitaciones, superficie, parking, estado, propietario
     * @param precio Precio  de la vivienda
     * @param numHabitaciones Numero de hacitaciones  de la vivienda
     * @param superficie Superficie  de la vivienda
     * @param parking parking  de la vivienda
     * @param estado estado  de la vivienda
     * @param propietario Propietario de la vivienda
     */
    
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
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
     * Constructor con 1 parametro
     * @see Vivienda
     * @param precio Precio vivienda 
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
   /**
     * Este método actualiza el precio de la Vivienda
     * Actualiza el precio de la vivienda
     * @param descuento.Descuento que se le resta al precio de la vivienda
     */
    
    public void actualizarPrecio( double descuento)
    {
        precio = precio - precio * descuento;
    }
    
    
}
