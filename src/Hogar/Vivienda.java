/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * <h1>Clase Vivienda</h1> 
 * Se utiliza para definir una vivienda así como sus especificaciones más relevantes.
 * Esta clase consta de los siguientes parámetros:
 * <ul>
 *      <li>{double}    Precio</li>
 *      <li>{double}    Superficie</li>
 *      <li>{int}       Número de habitaciones</li>
 *      <li>{boolean}   Presencia o no de Parking propio</li>
 *      <li>{String}    Estado de la vivienda</li>
 *      <li>{String}    Propietario actual</li>
 * </ul>
 * Y de los siguientes métodos:
 * <ul>
 *      <li>Getters y Setters de cada parámetro</li>
 *      <li>2 Constructores</li>
 *      <li>{void}      actualizarPrecio(double descuento)</li>
 * </ul>
 * @author Javier Crespo Ortés
 * @version 1.0
 * @since 1.0
 */
public class Vivienda {
    /**
     * Parámetro de tipo double. Precio de la vivienda.
     */
    private double precio;
    
    /**
     * Parámetro de tipo int. Número de habitaciones de la vivienda.
     */
    private int numHabitaciones;
    
    /**
     * Parámetro de tipo double. Superficie de la vivienda en m2.
     */
    private double superficie;
    
    /**
     * Parámetro de tipo boolean. Indica la presencia o ausencia de Parking propio.
     */
    private boolean parking;
    
    /**
     * Parámetro de tipo String. Indica el estado actual de la vivienda con una descripción.
     */
    private String estado;
    
    /**
     * Parámetro de tipo String. Indica el propietario actual de la vivienda.
     */
    private String propietario;

    //GETTERS
    /**
     * Método getter que devuelve el Precio de la vivienda.
     * @return {Double} Precio actual de la vivienda.
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Método getter que devuelve el Número actual de habitaciones de la vivienda.
     * @return {Int} Número actual de habitaciones de la vivienda.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Método getter que devuelve la Superficie actual de la vivienda en m2.
     * @return {Double} Superficie de la vivienda.
     */
    public double getSuperficie() {
        return superficie;
    }
    /**
     * Método getter que devuelve True si la vivienda tiene Parking y False en caso contrario.
     * @return {Boolean} Presencia o ausencia de Parking.
     */
    public boolean isParking() {
        return parking;
    }
    /**
     * Método getter que devuelve el Estado actual de la vivienda.
     * @return {String} Estado de la vivienda.
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Método getter que devuelve el Propietario actual de la vivienda.
     * @return {String} Propietario de la vivienda.
     */
    public String getPropietario() {
        return propietario;
    }

    //SETTERS
    /**
     * Método setter que actualiza el Precio de la vivienda.
     * @param precio {Double} Nuevo precio de la vivienda
     */
    public final void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Método setter que actualiza el Número de habitaciones.
     * @param numHabitaciones {Int} Nuevo número de habitaciones.
     */
    public final void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * Método setter que actualiza la Superficie de la vivienda.
     * @param superficie {Double} Nueva superficie de la vivienda.
     */
    public final void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    /**
     * Método setter que actualiza la presencia o ausencia de Parking.
     * @param parking {Boolean} Existencia de parking.
     */
    public final void setParking(boolean parking) {
        this.parking = parking;
    }
    /**
     * Método setter que actualiza el Estado actual de la vivienda.
     * @param estado {String} Nuevo estado.
     */
    public final void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Método setter que actualiza el Propietario actual de la vivienda.
     * @param propietario {String} Nuevo propietario.
     */
    public final void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    /**
     * Constructor con un solo parámetro.
     * Crea objetos de tipo Vivienda con los atributos vacíos excepto el Precio.
     * @param precio {Double} Precio de la vivienda.
     */
    public Vivienda (double precio)
    {
        this.setPrecio(precio);
    }
    /**
     * Constructor con 3 parámetros.
     * Crea objetos de tipo Vivienda con precio, número de habitaciones, superficie, parking, estado y propietario.
     * @param pr {Double} Precio de la vivienda.
     * @param n {Int} Número de habitaciones.
     * @param s {Double} Superficie.
     * @param p {Boolean} Parking.
     * @param e {String} Estado de la vivienda.
     * @param prop {String} Propietario de la vivienda.
     */
    public Vivienda(double pr, int n, double s, boolean p, String e, String prop){
        this.setPrecio(pr);
        this.setNumHabitaciones(n);
        this.setSuperficie(s);
        this.setParking(p);
        this.setEstado(e);
        this.setPropietario(prop);
    }
    
    /**
     * Método que actualiza el precio de la vivienda usando un porcentaje como descuento.
     * @param descuento {Double} Descuento aplicado al precio.
     */
    public void actualizarPrecio(double descuento)
    {
        this.setPrecio(precio - (precio * descuento));
    }

    
    
}
