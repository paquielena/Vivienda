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
     * atributo "precio", de tipo double.
     */
    private double precio;
    /**
     * atributo "numHabitaciones", de tipo int.
     */
    private int numHabitaciones;
    /**
     * atributo "superficie", de tipo double.
     */
    private double superficie;
    /**
     * atributo "parking", de tipo boolean.
     */
    private boolean parking;
    /**
     * atributo "estado", de tipo String.
     */
    private String estado;
    /**
     * atributo "propietario", de tipo String.
     */
    private String propietario;
    
    /**
     * constructor con un parámetro únicamente, el precio.
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    /**
     * constructor con seis parámetros, uno para cada atributo.
     * @param precio
     * @param numHabitaciones
     * @param superficie
     * @param parking
     * @param estado
     * @param propietario 
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
     * método para obtener el precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * método para modificar el precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * método para obtener el numero de habitaciones.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * método para modificar el número de habitaciones.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * método para obtener la superficie.
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * método para modificar la superficie.
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * método para obtener si tiene parking.
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * método para modificar si tiene parking.
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * método para obtener el estado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * método para modificar el estado.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * método para obtener el propietario.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * método para modificar el propietario.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    /**
     * método para actualizar el precio con el descuento.
     */
    public void actualizarPrecio(int descuento)
    {
        setPrecio(getPrecio() - getPrecio() * (descuento /100));
    }
    
}
