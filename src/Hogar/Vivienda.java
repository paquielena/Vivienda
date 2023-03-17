/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * <h2>Documentación de la clase Vivienda</h2>
 * Esta clase contiene una serie de parámetros 
 * relacionados con una vivienda.
 * También contiene un único método <b><i>actualizarPrecio</i></b> que aplica un descuento al Precio.
 * Estos parámetros se introducen en un sólo constructor.
 * @author Alberto-González
 * @version v1.0
 */
public class Vivienda {

    /**
     * Devuelve el Precio - Tipo double
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Cambia el precio - Tipo double
     * @param precio El precio de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el número de habitaciones - Tipo int
     * @return numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Cambia el número de habitaciones - Tipo int
     * @param numHabitaciones El número de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Devuelve la superficie en metros cuadrados - Tipo double
     * @return superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Cambia la superficie en metros cuadrados - Tipo double
     * @param superficie La superficie de la vivienda
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Devuelve true o false dependiendo de si hay parking o no - Tipo boolean
     * @return parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Cambia el valor que define si hay Parking(True) o no (False) - Tipo boolean
     * @param parking Si la vivienda tiene Parking o no (True/False)
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Devuelve una descripción del estado de la vivienda - Tipo cadena
     * @return estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Cambia la descripción del estado de la vivienda - Tipo cadena
     * @param estado El estado de la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve el nombre del propietario - Tipo cadena
     * @return propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Cambia el nombre del propietario - Tipo cadena
     * @param propietario El propietario de la vivienda
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    /**
     * Atributo precio de la vivienda - Tipo double
     */
    private double precio;
    /**
     * Número de habitaciones - Tipo int
     */
    private int numHabitaciones;
    /**
     * La superfície. Se interpreta en metros cuadrádos - Tipo double.
     */
    private double superficie;
    /**
     * Si la vivienda tiene Parking o no.
     *  - Tipo boolean
     * <ul>
     *  <li><b>True: Tiene parking.</b></li>
     *  <li><b>False: No tiene parking.</b></li>
     * </ul>
     */
    private boolean parking;
    /**
     * La descripción del estado de la Vivienda - Tipo Cadena.
     */
    private String estado;
    /**
     * El nombre completo del propietario - Tipo Cadena.
     */
    private String propietario;

    /**
     * Método constructor con tódos los <b>seis</b> parámetros de la clase.
     * Crea el objeto vivienda con precio, número de habitaciones, superficie, si tiene parking o no, estado de la vivienda y propietario.
     * @param precio Hace referencia al Precio de la vivienda - Tipo double.
     * @param numHabitaciones Hace referncia al número de habitaciones - Tipo int.
     * @param superficie La superfícia. Se interpreta en metros cuadrádos - Tipo double.
     * @param parking Si la vivienda tiene Parking o no.
     *  - Tipo boolean
     * <ul>
     *  <li><b>True: Tiene parking.</b></li>
     *  <li><b>False: No tiene parking.</b></li>
     * </ul>
     * @param estado Da una descripción del estado de la Vivienda - Tipo Cadena.
     * @param propietario El nombre completo del propietario - Tipo Cadena.
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
     * Método constructor que solo pide el precio como parámetro
     * Tras la última refactorización este método no es particularmente útil.
     * @param precio
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Aplica un descuento porcentual al total del precio.
     * @see Vivienda
     * @param descuento de tipo double que se multiplicará al precio para dar el total del descuento y después se restará al total.
     * Ej. 0.1 para un descuento del 10%.
     */
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}
