/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 ** <h2> Esta es una clase que se llama Vivienda y pertenece al programa Vivienda</h2>
 *En este caso, la clase Vivienda tiene una serie de elementos:
 * <ul>
 * <li><b> atributos</b> </li>
 *  <li><b> dos constructores</b> </li>
 *  <li><b> Getter y Setter</b> </li>
 *  <li><b> un metodo</b> </li>
 * </ul>
 * Asignatura Entornos de desarrollo del Ciclo de Daw de <a href= https://www.iesjoseplanes.es/> Ies Jose Planes</a>
 * @version 1.1
 * @author paqui
 * @since 1.0
 */
public class Vivienda {

    /**
     * Esta método devuelve el valor del atributo precio
     * @return el precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Este método modifica el valor del atributo precio y le asigna el valor introducido por paramatro
     * @param precio el precio a asignar
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Esta método devuelve el valor del atributo numHabitaciones
     * @return el numHabitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Este método modifica el valor del atributo numHabitaciones y le asigna el valor introducido por paramatro
     * @param numHabitaciones el numHabitaciones a asignar
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Esta método devuelve el valor del atributo superficie
     * @return la superficie
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Este método modifica el valor del atributo superficie y le asigna el valor introducido por paramatro
     * @param superficie la superficie a asignar
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Esta método devuelve el valor del atributo parking
     * @return el parking
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Este método modifica el valor del atributo parking y le asigna el valor introducido por paramatro
     * @param parking el parking a asignar
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Esta método devuelve el valor del atributo estado
     * @return el estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Este método modifica el valor del atributo estado y le asigna el valor introducido por paramatro
     * @param estado el estado a asignar
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Esta método devuelve el valor del atributo propietario
     * @return the propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Este método modifica el valor del atributo propietario y le asigna el valor introducido por paramatro
     * @param propietario el propietario a asignar
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    /**
     * Atributo precio de la vivienda. Tipo double
     */
    private double precio;
    /**
     * Atributo numero de habitaciones. Tipo entero
     */
    private int numHabitaciones;
    /**
     * Atributo superficie de la Vivienda. Tipo real
     */
    private double superficie;
    /**
     * Atributo que indica la existencia de parking o no. Tipo booleano
     */
    private boolean parking;
    /**
     * Atributo que indica el estado de la Vivienda. Tipo candena
     */
    private String estado;
    /**
     * Atributo nombre del propietario de la Vivienda. Tipo candena
     */
    private String propietario;

    /**
     * Constructor con 6 parametros
     * Crea objetos Vivienda con precio, Numero de Habitaciones, superficio, parking,
     * estado y propietario
     * @param precio Precio de la Vivienda
     * @param numHabitaciones Numero de habitaciones de las que dispone
     * @param superficie Superficie en metros cuadrados de la vivienda
     * @param parking Indicador de parking incluido o no
     * @param estado Estado de la vivienda
     * @param propietario Nombre del propietario actual
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
     * Constructor con 1 parametros
     * Crea objetos Vivienda con precio
     * @param precio Precio de la Vivienda
     */
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * Esta método inserta el descuento a aplicar en el precio de la vivienda actual
     * @see Vivienda
     * @param descuento int que almacena el descuento a aplizar al precio de la Vivienda
     */
    public void actualizarPrecio(int descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento/100);
    }
    
}
