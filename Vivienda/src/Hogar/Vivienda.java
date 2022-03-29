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
     * @return Devuelve el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio El precio a establecer
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return Devuelve el numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones El numHabitaciones a establecer
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return Devuelve la superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie La superficie a establecer
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return Devuelve el parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking El parking a establecer
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return Devuelve el estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado El estado a establecer
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return Devuelve el propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * @param propietario El propietario a establecer
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    /**
     *
     * @param precio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }

    /**
     *
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
     * Actualiza el precio con un descuento
     */
    public void actualizarPrecio()
    {
        final double descuento = 0.05;
        setPrecio(getPrecio() - getPrecio() * descuento);
    }

    
}
