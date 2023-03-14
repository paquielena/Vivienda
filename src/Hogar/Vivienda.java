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
    
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio()
    {
        precio = precio - precio * 0.05;
    }
    void imprimirVivienda(Vivienda casa1)
        {
            System.out.println("Precio: " + casa1.precio);
            System.out.println("Número de habitaciones: "+ casa1.numHabitaciones);
            System.out.println("Superficie en m2: " + casa1.superficie);
            System.out.println("¿Dispone de parking?: " + casa1.parking);
            System.out.println("Estado: "+ casa1.estado);
            System.out.println("Propietario: "+ casa1.propietario);
        }
    
    public void setprecio(double precio)
    {
        this.precio=precio;
    }
    public void setnumHabitaciones(int numHabitaciones)
    {
        this.numHabitaciones=numHabitaciones;
    }
    public void setsuperficie(double superficie)
    {
        this.superficie=superficie;
    }
    public void setparking(boolean parking)
    {
        this.parking=parking;
    }
    public void setestado(String estado)
    {
        this.estado=estado;
    }
    public void setpropietario(String propietario)
    {
        this.propietario=propietario;
    }
    
    
    
    public double getprecio(double precio)
    {
        return precio;
    }
    public int getnumHabitaciones(int numHabitaciones)
    {
        return numHabitaciones;
    }
    public double getsuperficie(double superficie)
    {
        return superficie;
    }
    public boolean getparking(boolean parking)
    {
        return parking;
    }
    public String getestado(String estado)
    {
        return estado;
    }
    public String getpropietario(String propietario)
    {
        return propietario;
    }
    
    
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario)
    {
        this.precio=precio;
        this.numHabitaciones=numHabitaciones;
        this.superficie=superficie;
        this.parking=parking;
        this.estado=estado;
        this.propietario=propietario;
    }
    
    
    public void actualizarPrecio(double descuento)
    {
        precio=precio-(precio*descuento);
    }
    
    
}
