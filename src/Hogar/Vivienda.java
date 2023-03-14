/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**<h2>Este es el método Vivienda</h2> 
 *
 * 
 */
public class Vivienda {
/**
* Este es el atributo precio de la vivienda. Tipo double
*/
    private double precio;
/**
* Este es el atributo relacionado con el numero de Habitaciones de la vivienda. Tipo entero
*/
    private int numHabitaciones;
/**
* Este es el atributo superficie de la vivienda. Tipo double
*/
    private double superficie;
/**
* Este es el atributo parking, y nos dice si tiene o no parking. Tipo boolean
*/
    private boolean parking;
/**
* Este es el atributo estado. Tipo String
*/
    private String estado;
/**
* Este es el atributo propietario, y nos dice quien es el propietario de la vivienda. Tipo String
*/
    private String propietario;

    public double getPrecio() {
        return precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean isParking() {
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
/** Constructor con 6 parametros
 * 
 * @param precio Precio de la vivienda
 * @param numHabitaciones Numero de habitaciones de la vivienda
 * @param superficie Superficie de la vivienda
 * @param parking Tiene parking o no
 * @param estado Estado de la vivienda
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
    
    
    
    
/**Nos da el precio de la vivienda
 * @see Vivienda 
 * @param precio de la vivienda
 */    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
/** Nos da el precio con descuento de la vivienda
 * @see Vivienda
 * @param descuento que se aplica al precio
 */  
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento;
    }
    
}
