/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author Sergio
 * @version: UPDATE FROM PAQUI.
 * 
 */
public class Vivienda {

/**
 *<p> En la clase Vivienda tenemos distintos tipos de atributos que se le pueden acreditar para tener mas información sobre la vivienda </p>
 * 
 */
    
    /**
     * <p>Nos indica el precio de la vivienda de tipo real </p>
     */
    private double precio;
      /**
     * <p> Nos indica los numeros de habitaciones de tipo entero </p>
     */
    private int numHabitaciones;
          /**
     * <p>Nos indica la superficie de tipo real  de la casa </p>
     */
    private double superficie;
             /**
     * <p>Nos indica si la casa tiene parking  de tipo boolean </p>
     */
    private boolean parking;
                 /**
     * <p>Nos indica el estaod de la casa de tipo String  </p>
     */
    private String estado;
                  /**
     * <p>Nos indica el propietario de la casa de tipo String  </p>
     */
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
    
    
    /**
     * 
     * <p> Nos indica el precio aplicandole el descuento que se le indica en el parametro <b> descuento </b>  </p>
     */
    public void actualizarPrecio(int descuento)
    {
        setPrecio(getPrecio() - (getPrecio() * descuento / 100));
    
    }
  
    /**
     * <p>  Imprime los valores de una vivienda para que puedas visualizarlo por <b> pantalla </b> </p>
     *
     */
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
     * <p>  Imprime los valores del precio de una vivienda  para que puedas visualizarlo por <b> pantalla </b> </p>
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * <p>  Inserta los valores del atributo <b> precio </b> </p>
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * <p>  Imprime los valores del numero de habitaciones de una vivienda  para que puedas visualizarlo por <b> pantalla </b> </p>
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * <p>  Inserta los valores del atributo <b> numero de habitaciones </b> </p>
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * <p>  Imprime los valores del numero de metros cuadrados de superficie  de una vivienda  para que puedas visualizarlo por <b> pantalla </b> </p>
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * <p>  Inserta los valores del atributo <b> superficie </b> </p>
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * <p>  Imprime los valores de si tiene o no la vivienda  <b> PARKING </b> </p>
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * <p>Inserta si tiene o no  <b> parking la vivienda </b> </p>
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * <p>Obtinne el estado  <b> de la vivienda </b> </p>
     */
    public String getEstado() {
        return estado;
    }

    /**
     * <p>Inserta el estado <b> de  la vivienda </b> </p>
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * <p>Obtiene <b> el nombre del propietario de la vivienda  </b> </p>
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * <p>Inserta el nombre del  <b> propietario de la vivienda </b> </p>
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
}
