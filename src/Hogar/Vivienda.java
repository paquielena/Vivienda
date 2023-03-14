/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 */
public class Vivienda {

    /**
     * @return the precio
     */
    
    /**
     * 
     * Este método se encarga de obtener el atributo del precio y lo devuelve.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Este método se encarga de obtener el atributo de NumHabitaciones y lo devuelve.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Este método obtiene el atributo Superficie y lo obtiene.
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Este método obtiene el resultado de true o false del método Parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Este método obtiene el atributo de Estado y lo devuelve.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Este método devuelve el atributo Propietario y lo obtiene.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param precio es el precio a cambiar
     * El método se encarga de cambiar el valor de precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param numHabitaciones el número de habitaciones a cambiar.
     * Este método se encarga de cambiar el número de habitaciones.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @param superficie la superficie de la vivienda
     * Este método cambia el valor que tenía la superficie
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @param parking nos dice si tiene parking o no.
     * Se encarga de decirnos true o false el método.
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @param estado el estado en el que se encuentra la vivienda
     * El método se encarga de cambiar el valor del estado.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    /**
     * @param precio Se trata de precio de la vivienda
     */
    private double precio;
    /**
     * @param numHabitaciones Se trata del número de habitaciones de la vivienda.
     */
    private int numHabitaciones;
    /**
     * @param superficie se trata de la superficie total de la vivienda.
     */
    private double superficie;
    /**
     * @param parking se trata de un booleano que nos dice si hay parking o no.
     */
    private boolean parking;
    /**
     * @param estado se trata del estado de la vivienda.
     */
    private String estado;
    /**
     * @param propietario se trata del propietario de la vivienda.
     */
    private String propietario;
    
    /**
     * 
     * @param precio  el precio  de la vivienda
     * se trata del constructor de la vivienda.
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * 
     * @param descuento es el descuento a realizar a la compra
     * se encarga de actualizar el precio para comprar una vivienda.
     */
    public void actualizarPrecio(double descuento)
    {
        
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
    
}
