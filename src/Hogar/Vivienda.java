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

    //GETTERS
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

    //SETTERS
    public final void setPrecio(double precio) {
        this.precio = precio;
    }
    public final void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    public final void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public final void setParking(boolean parking) {
        this.parking = parking;
    }
    public final void setEstado(String estado) {
        this.estado = estado;
    }
    public final void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    
    public Vivienda (double precio)
    {
        this.setPrecio(precio);
    }
    public Vivienda(double pr, int n, double s, boolean p, String e, String prop){
        this.setPrecio(pr);
        this.setNumHabitaciones(n);
        this.setSuperficie(s);
        this.setParking(p);
        this.setEstado(e);
        this.setPropietario(prop);
    }
    
    public void actualizarPrecio(double descuento)
    {
        this.setPrecio(precio - (precio * descuento));
    }

    
    
}
