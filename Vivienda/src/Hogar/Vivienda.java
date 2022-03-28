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

    /**<h2> Explicacion getPrecio </h2>
     * @return Devuelve el precio.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * <h2> Explicacion setPrecio </h2>
     * @param precio Cambia el precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * <h2> Explicacion getNumHabitaciones</h2>
     * @return Devolvera el numero de habitaciones.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * <h2> Explicacion setNumHabitaciones</h2>
     * @param numHabitaciones Cambiara el numero de habitaciones.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * <h2> Explicacion getSuperficie</h2>
     * @return Devolvera la supercifie.
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * <h2> Explicacion setSuperficie</h2>
     * @param superficie Cambia la supercifie.
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * <h2> Explicacion isParking</h2>
     * @return Devuelve el parking.
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * <h2> Explicacion setParking</h2>
     * @param parking Cambia el parking.
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * <h2> Explicacion getEstado</h2>
     * @return Devuelve el Estado.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * <h2> Explicacion setEstado</h2>
     * @param estado Cambia el Estado.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario the propietario to set
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double Descuento)
    {
        setPrecio(getPrecio() - getPrecio() * Descuento);
    }
}
