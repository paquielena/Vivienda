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
    * Atributo precio de la vivienda.Tipo double
    */
    private double precio;
    /**
    * Atributo numHabitaciones de la vivienda.Tipo int
    */
    private int numHabitaciones;
    /**
    * Atributo superficie de la vivienda.Tipo double
    */
    private double superficie;
    /**
    * Atributo parking de la vivienda.Tipo boolean
    */
    private boolean parking;
    /**
    * Atributo estado de la vivienda.Tipo string
    */
    private String estado;
    /**
    * Atributo propietario+
    * de la vivienda.Tipo string
    */
    private String propietario;
    
    /**
    * Constructor con 1 paramentro
    * Crea objetos Vivienda con precio
    * @param precio
    */
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        /**
         * @param precio primer numero real
         * @param descuento segundo numero real
         */
        precio = precio - precio * descuento;
    }
        /**
    * Constructor con 6 paramentro
    * Crea objetos Vivienda con precio,numHabitaciones,superficie,parking,estado y propietario
    * @param precio, 
    * @param Vivienda
    * @param numHabitaciones
    * @param superficie
    * @param parking
    * @param estado
    * @param propietario.
    */
    
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
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
    

    
    
    
    
}
