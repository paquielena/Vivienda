/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *<h2>Documentacion de la clase Vivienda</h2>
 * Esta es la documentacion de la clase Vivienda en donde se recoge para que sirve cada atributo
 * y cual es la función de cada metodo.
 * 
 * @author sergio
 * @author paqui
 * @version 1.1
 * @since 1.0
 */
public class Vivienda {
    
    
    /**
     * Atributo precio de la Vivienda. De tipo double.
     */
    private double precio;
    
    /**
     * Atributo numero de habitaciones de la Vivienda. De tipo int.
     */
    private int numHabitaciones;
    
    /**
     * Atributo superficie de la Vivienda. De tipo double.
     */
    private double superficie;
    
    /**
     * Atributo parking de la Vivienda. De tipo boolean.
     */
    private boolean parking;
    
    /**
     * Atributo estado de la Vivienda. De tipo string.
     */
    private String estado;
    
    /**
     * Atributo propietario de la Vivienda. De tipo string.
     */
    private String propietario;

    
    /**
     * Constructor de la clase Vivienda con 6 parametros.
     * Crea objetos Vivienda con precio, numHabitaciones, superficie, parking, estado, propietario.
     * @param precio Precio de la Vivienda.
     * @param numHabitaciones Numero de habitaciones de la Vivienda.
     * @param superficie Superficie de la Vivienda.
     * @param parking Comprobar si la Vivienda tiene parking
     * @param estado Estado de la Vivienda
     * @param propietario Propietario de la Vivienda
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
     * Constructor de la clave Vivienda con 1 parametro.
     * Crea objetos de la clase Vivienda unicamente con el precio.
     * @param precio Precio de la Vivienda.
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Este metodo le aplica un descuento al precio dependiendo del porcentaje introducido por parametro
     * @param descuento Porcentaje de descuento. Ej: 0.05.
     */
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio * descuento;
    }

    /**
     * Metodo getter del atributo precio.
     * @return Devuelve el precio de la Vivienda.
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Metodo setter del atributo precio.
     * @param precio Establece el precio de la Vivienda.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Metodo getter del atributo numHabitaciones.
     * @return Devuelve el numero de habitaciones de la Vivienda.
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Metodo setter del atributo numHabitaciones.
     * @param numHabitaciones Establece el numero de habitaciones de la Vivienda.
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Metodo getter del atributo superficie.
     * @return Devuelve la superficie de la Vivienda.
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Metodo setter del atributo superficie.
     * @param superficie Establece la superficie de la Vivienda.
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Metodo boolean del atributo parking.
     * @return <ul>
     *          <li><b>True:</b> La vivienda dispone de parking.</li>
     *          <li><b>False:</b> La vivienda no dispone de parking.</li>
     *         </ul>
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Metodo setter del atributo parking.
     * @param parking Establece si la Vivienda dispone de parking a traves de una condición booleana.
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Metodo getter del atributo estado.
     * @return Devuelve el estado de la Vivienda.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Metodo setter del atributo estado.
     * @param estado Establece el estado de la Vivienda.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Metodo getter del atributo propietario.
     * @return Devuelve el propietario de la Vivienda.
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Metodo setter del atributo propietario.
     * @param propietario Establece el propietario de la Vivienda.
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
