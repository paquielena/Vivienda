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
        this.setPrecio(precio);
    }

    public void actualizarPrecio(double descuento) {
        double montoDescuento = this.getPrecio() * (descuento / 100);
        this.setPrecio(this.getPrecio() - montoDescuento);
    }
    


    private double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    private int getNumHabitaciones() {
        return numHabitaciones;
    }

    private void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    private double getSuperficie() {
        return superficie;
    }

    private void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    private boolean isParking() {
        return parking;
    }

    private void setParking(boolean parking) {
        this.parking = parking;
    }

    private String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    private String getPropietario() {
        return propietario;
    }

    private void setPropietario(String propietario) {
        this.propietario = propietario;
    }
}
