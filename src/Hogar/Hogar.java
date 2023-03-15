
package Hogar;

/**
 *
 * @author paqui,jorge
 * 
 */
public class Hogar {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        Vivienda casa1 = new Vivienda(120000);
        
        double precio;
        int numHabitaciones;
        double superficie;
        boolean parking;
        String estado;
        String propietario;
        
        imprimirvivienda(casa1);
        
        
    }

    private static void imprimirvivienda(Vivienda casa1) 
    {
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: "+ casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.isParking());
        System.out.println("Estado: "+ casa1.getEstado());
        System.out.println("Propietario: "+ casa1.getPropietario());
    }
    
    
    
}
