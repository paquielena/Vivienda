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

    /**Este metodo actualiza el precio  */
    public void actualizarPrecio()
    {
        precio = precio - precio * 0.05;
    }    
    /**Este metodo imprime por pantalla los distintos valores  */
    void imprimirVivienda(Vivienda casa1)
        {
            System.out.println("Precio: " + casa1.precio);
            System.out.println("Número de habitaciones: "+ casa1.numHabitaciones);
            System.out.println("Superficie en m2: " + casa1.superficie);
            System.out.println("¿Dispone de parking?: " + casa1.parking);
            System.out.println("Estado: "+ casa1.estado);
            System.out.println("Propietario: "+ casa1.propietario);
        }
    /**Este metodo cambia el precio  */
    public void setprecio(double precio)
    {
        this.precio=precio;
    }
    /**Este metodo cambia el numero de habitaciones  */
    public void setnumHabitaciones(int numHabitaciones)
    {
        this.numHabitaciones=numHabitaciones;
    }
    /**Este metodo cambia la superficie  */
    public void setsuperficie(double superficie)
    {
        this.superficie=superficie;
    }
    /**Este metodo cambia si hay parking o no  */
    public void setparking(boolean parking)
    {
        this.parking=parking;
    }
    /**Este metodo cambia una cadena de texto que te dice el estado  */
    public void setestado(String estado)
    {
        this.estado=estado;
    }
    /**Este metodo cambia una cadena de texto que te dice el propietario  */
    public void setpropietario(String propietario)
    {
        this.propietario=propietario;
    }
    
    
    
    
     /**Este metodo devuelve el precio  */
    public double getprecio(double precio)
    {
        return precio;
    }
    /**Este metodo devuelve el numero de habitaciones  */
    public int getnumHabitaciones(int numHabitaciones)
    {
        return numHabitaciones;
    }
    /**Este metodo devuelve la superficie  */
    public double getsuperficie(double superficie)
    {
        return superficie;
    }
    /**Este metodo devuelve si hay parking o no  */
    public boolean getparking(boolean parking)
    {
        return parking;
    }
    /**Este metodo devuelve una cadena de texto que te dice el estado  */
    public String getestado(String estado)
    {
        return estado;
    }
    /**Este metodo devuelve una cadena de texto que te dice el propietario  */
    public String getpropietario(String propietario)
    {
        return propietario;
    }
    
     /**
      * Este metodo encapsula los atributos de la clase Vivienda reciviendo todos los parametros
      */
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario)
    {
        this.precio=precio;
        this.numHabitaciones=numHabitaciones;
        this.superficie=superficie;
        this.parking=parking;
        this.estado=estado;
        this.propietario=propietario;
    }
    
     /**
      * Este metodo actualiza el precio restandole un descuento
      */
    public void actualizarPrecio(double descuento)
    {
        precio=precio-(precio*descuento);
    }
    
    
}
