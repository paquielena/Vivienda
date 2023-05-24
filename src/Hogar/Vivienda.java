/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**<h1> Este es el método vivienda </h1>
 * 
 * 
 */
public class Vivienda {
/**
 * Este es el atributo precio de la vivienda. Tipo double
 */
    private double precio;
    /**
 * Este es el atributo numero de habitaciones de la vivienda. Tipo entero
 */
    private int numHabitaciones;
    /**
 * Este es el atributo superficie de la vivienda. Tipo double
 */
    private double superficie;
    /**
 * Este es el atributo parking de la vivienda. Tipo boolean
 */
    private boolean parking;
    /**
 * Este es el atributo estado de la vivienda. Tipo String
 */
    private String estado;
    /**
 * Este es el atributo propietario de la vivienda. Tipo String
 */
    private String propietario;

    public double getPrecio() {
        return precio;
    }

    public int getnumHabitaciones() {
        return numHabitaciones;
    }

    public double getsuperficie() {
        return superficie;
    }

    public boolean isparking() {
        return parking;
    }

    public String getestado() {
        return estado;
    }

    public String getpropietario() {
        return propietario;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    public int setnumHabitaciones(int numHabitaciones) {
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
    }/** onstructor 6 parametros
 * 
 * @param precio Precio de la vivienda
 * @param numHabitaciones numero de habitaciones de la vivienda
 * @param superficie Superficie de la vivienda
 * @param parking tiene parking o no
 * @param estado Estado de la vivienda
 * @param propietario propietario de la vivienda
 */

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario){
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    /**
     * nos da el precio de la vivienda
     *  @see vivienda
     * @param precio de la viviente
   */
   
    
    public Vivienda(double precio) {
        this.precio = precio;
    }
/**
     * nos da el precio con descuento de la vivienda
     *  @see vivienda
     * @param descuento que se aplica al precio de la vivienda
   */
    public void actualizarPrecio(double descuento) {
        precio = precio - precio * descuento;
    }

}
