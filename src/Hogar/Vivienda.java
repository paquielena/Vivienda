/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * <h2>Clase Vivienda, se utiliza para crear y leer viviendas en una base de datos.</h2>
 * @author Raul Guirao
 */
public class Vivienda {
    
    /**
     * Atributo precio de la vivienda. Tipo double.
     */
    private double precio;
    
    /**
     * Atributo número de habitaciones de la vivienda. Tipo int.
     */
    private int numHabitaciones;
    
    /**
     * Atributo superficie de la vivienda. Tipo double.
     */
    private double superficie;
    
    /**
     * Atributo parking de la vivienda. Tipo boolean.
     */
    private boolean parking;
    
    /**
     * Atributo estado de la vivienda. Tipo String.
     */
    private String estado;
    
    /**
     * Atributo propetario de la vivienda. Tipo String.
     */
    private String propietario;
    
    /**
     * Constructor con 1 parámetro
     * Crea objetos Vivienda con precio
     * @param precio Precio de la vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Método actualizarPrecio con un parámetro. 
     * Actualiza el precio de la vivienda.
     * @param descuento Descuento que se le resta al precio de la vivienda.
     */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento;
    }
    
    public double getPrecio()
    {
        return this.precio;
    }

    public int getNumHabitaciones() 
    {
        return numHabitaciones;
    }

    public double getSuperficie() 
    {
        return superficie;
    }

    public boolean getParking() 
    {
        return parking;
    }

    public String getEstado() 
    {
        return estado;
    }

    public String getPropietario() 
    {
        return propietario;
    }

    public void setPrecio(double precio) 
    {
        this.precio = precio;
    }

    public void setNumHabitaciones(int numHabitaciones) 
    {
        this.numHabitaciones = numHabitaciones;
    }

    public void setSuperficie(double superficie) 
    {
        this.superficie = superficie;
    }

    public void setParking(boolean parking) 
    {
        this.parking = parking;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }

    public void setPropietario(String propietario) 
    {
        this.propietario = propietario;
    }

    /**
     * Constructor con 6 parámetros.
     * Crea objetos Vivienda con precio, número de habitaciones, superficie, parking, estado y propetario.
     * @param precio Precio de la vivienda.
     * @param numHabitaciones Número de habitaciones de la vivienda.
     * @param superficie Superficie de la vivienda.
     * @param parking Si la vivienda tiene parking o no.
     * @param estado Estado de la vivienda.
     * @param propietario Propietario de la vivienda
     */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) 
    {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }
    
    
    
}
