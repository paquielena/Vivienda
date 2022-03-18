/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *<h2>Práctica Control de Versiones,Refactorización y Documentación.</h2>
 * @see <a href="https://github.com/LuisMarianoCaballeroSanchez/Vivienda">REPOSITORIO</a>
 * @author Luis Mariano Caballero Sánchez
 * @version 1.0
 */
public class Vivienda {
    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
    
    public Vivienda(){
        this.precio=50000;
        this.numHabitaciones=3;
        this.superficie=3000;
        this.parking=true;
        this.estado="nuevo";
        this.propietario="banco";
    }
    
    public void setprecio(double precio){
        this.precio=precio;
    }
    public double getprecio(){
        return precio;
    }
    public void setnumHabitaciones(int numHabitaciones){
        this.numHabitaciones=numHabitaciones;
    }
    public int getnumHabitaciones(){
        return numHabitaciones;
    }
    public void setsuperficie(double superficie){
        this.superficie=superficie;
    }
    public double getsuperficie(){
        return superficie;
    }
    public void setparking(boolean parking){
        this.parking=parking;
    }
    public boolean getparking(){
        return parking;
    }
    public void setestado(String estado){
        this.estado=estado;
    }
    public String getestado(){
        return estado;
    }
    public void setpropietario(String propietario){
        this.propietario=propietario;
    }
    public String getpropietario(){
        return propietario;
    }
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio()
    {
        double descuento=0.05;
        precio = precio - precio * descuento;
    }
   public void imprimirVivienda()
   {
       System.out.println("Precio: " + this.getprecio());
        System.out.println("Número de habitaciones: "+ this.getnumHabitaciones());
        System.out.println("Superficie en m2: " + this.getsuperficie());
        System.out.println("¿Dispone de parking?: " + this.getparking());
        System.out.println("Estado: "+ this.getestado());
        System.out.println("Propietario: "+ this.getpropietario());
   }

    
}
