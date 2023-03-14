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


    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
            
     public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
     this.precio = precio;
     this.numHabitaciones = numHabitaciones;
     this.superficie = superficie;
     this.parking = parking;
     this.estado = estado;
     this.propietario = propietario;
    }
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(int descuento, Object par1)
    {
        setPrecio(getPrecio() - (getPrecio() * descuento / 100));
    
    }
    
    public void imprimirVivienda()
    {
          System.out.println("Precio: " + this.getPrecio());
        System.out.println("Número de habitaciones: "+ this.getNumHabitaciones());
        System.out.println("Superficie en m2: " + this.getSuperficie());
        System.out.println("¿Dispone de parking?: " + this.isParking());
        System.out.println("Estado: "+ this.getEstado());
        System.out.println("Propietario: "+ this.getPropietario());
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones the numHabitaciones to set
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return the superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * @param superficie the superficie to set
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * @return the parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * @param parking the parking to set
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
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
    
}
