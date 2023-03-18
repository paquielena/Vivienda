/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * <h2>Clase vivienda</h2>
 * <h2>Crea objetos vivienda con los datos necesarios para su compra y venta</h2>
 * @author Gonzalo
 * @version 1.0
 */
public class Vivienda {
    
    /**
     * Atributo precio de la vivienda. Tipo double
     */
    private double precio;
    /**
     * Atributo numero de habitaciones de la vivienda. Tipo int
     */
    private int numHabitaciones;
    /**
     * Atributo superficie de la vivienda. Tipo double
     */
    private double superficie;
    /**
     * Atributo que indica si la vivienda tiene parking. Tipo boolean
     */
    private boolean parking;
    /**
     * Atributo estado de la vivienda. Tipo String
     */
    private String estado;
    /**
     * Atributo propietario de la vivienda. Tipo String
     */
    private String propietario;

    /**
     * Constructor con 6 parámetros
     * Crea objetos de la clase Vivienda 
     * @param precio Precio de la vivienda. Tipo double
     * @param numHabitaciones  Numero de habitaciones de la vivienda. Tipo int
     * @param superficie Superficie de la vivienda. Tipo double
     * @param parking Si la vivienda tiene parking. Tipo boolean
     * @param estado Estado de la vivienda. Tipo String
     * @param propietario Propietario de la vivienda. Tipo String
     */
    public Vivienda(double precio,int numHabitaciones, double superficie, 
                    boolean parking, String estado, String propietario)
    {
        this.setPrecio(precio);
        this.setNumHabitaciones(numHabitaciones);
        this.setSuperficie(superficie);
        this.setParking(parking);
        this.setEstado(estado);
        this.setPropietario(propietario);
    }
    
    /**
     * Constructor con 1 parámetro
     * Crea objetos de la clase vivienda con el atributo precio
     * @param precio 
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Método que actualiza el precio de una vivienda tras aplicar un descuento
     * @see Vivienda
     * @param descuento Double que indica el porcentaje de descuento que se va a aplicar
     */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento;
    }

    /**
     * Getter del atributo recio
     * @return Devuelve el precio de la vivienda. Dato de tipo double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter del atributo precio
     * Acepta 1 parámetro, precio, de tipo double
     * @param precio Precio de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter del atributo numHabitaciones
     * @return Devuelve el número de habitaciones de la vivienda. Dato de tipo int
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Setter del atributo numHabitaciones
     * Acepta 1 parámetro, numHabitaciones, de tipo int
     * @param numHabitaciones Número d ehabitaciones de la vivienda
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Getter del atributo superficie
     * @return Devuelve la superficie de la vivienda. Dato de tipo double
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Setter del atributo superficie
     * Acepta 1 parámetro, superficie, de tipo double
     * @param superficie Superficie de la vivienda
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Getter del atributo parking
     * @return Devuelve si la vivienda tiene parking. Dato de tipo booleano
     */
    public boolean getParking() {
        return parking;
    }

    /**
     * Setter del atributo parking
     * Acepta 1 parámetro, parking, de tipo boolean
     * @param parking Si la vivienda tiene parking
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Getter del atributo estado
     * @return Devuelve el estado de la vivienda. Dato de tipo cadena
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Setter del atributo estado
     * Acepta 1 parámetro, estado, de tipo cadena
     * @param estado Estado de la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Getter del atributo propietario
     * @return Devuelve el propietario de la vivienda. Dato de tipo cadena
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Setter del atributo propietario
     * Acepta 1 parámetro, propietario, de tipo cadena
     * @param propietario Propietario de la vivienda
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    
    
}
