
/**
 *<h2>Clase vivienda que esta diseñado para meter las caracteristicas de una vienda junto a un propietario
 * </h2>
 * @version v1.0.1
 * @since 15/03/2023
 * @author  Adrian 
 */
 
package Hogar;

/**
 *
 * @author Adrian
 */
public class Vivienda {

    /**
     * @return con este metodo devolvemos el valor actual del precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio con el metodo setPrecio podemos cambiar el valor del atributo precio
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return este metodo devuelve el numero actual de habitaciones
     */
    public int getNumHabitaciones()
    {
        return numHabitaciones;
    }

    /**
     * @param numHabitaciones el metodo numHabitaciones podemos cambiar el valor del atributo numHabitaciones
     */
    public void setNumHabitaciones(int numHabitaciones)
    {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * @return este metodo devuelve la superficie actual 
     */
    public double getSuperficie()
    {
        return superficie;
    }

    /**
     * @param superficie con el metodo setSuperficie podemos modificar el valor de la superficie
     */
    public void setSuperficie(double superficie)
    {
        this.superficie = superficie;
    }

    /**
     * @return con el metodo is parking devuelve si tiene parking o no 
     */
    public boolean isParking()
    {
        return parking;
    }

    /**
     * @param parking con el metodo setParking podemos cambiar el valor entre true y false para poner si dispone la vivienda de parking o no 
     */
    public void setParking(boolean parking)
    {
        this.parking = parking;
    }

    /**
     * @return devuelve el estado actual de la vivienda
     */
    public String getEstado()
    {
        return estado;
    }

    /**
     * @param estado con este metodo se pouede cambiar el estado actual de la vivienda 
     */
    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    /**
     * @return con este metodo podemos saber quien es el propietario de la vivienda en este momento
     */
    public String getPropietario()
    {
        return propietario;
    }

    /**
     * @param propietario con este metodo podemos asignar o cambiar el propietario de una vivienda 
     */
    public void setPropietario(String propietario)
    {
        this.propietario = propietario;
    }
    
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    /**
    * Constructor que acepta 6 parametros que se le proporcina en el main para definir un objeto de tipo vivienda
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
    
    
    
    
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    /**
     * metodo a actualizar precio que realizar un cambio en el precio actual de la vivienda aplicandole un descuento introducido por el usuario del programa 
     * @param descuento es el atributo que contiene el descuento a realizar sobre el precio de la vivienda 
     */
    
    public void actualizarPrecio(double descuento)
    {
        setPrecio(getPrecio() - getPrecio() * descuento);
    }
    
}
