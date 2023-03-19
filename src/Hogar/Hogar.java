package Hogar;

/**
 * Clase principal Hogar que se encarga de gestionar las viviendas.
 *
 * @author David Pastor
 */
public class Hogar {



	/**
	 * Método principal (main) que ejecuta la aplicación.
	 *
	 * @param args argumentos de la línea de comandos
	 */
	public static void main(String[] args) {
		Vivienda casa1 = new Vivienda(120000);

		double precio;
		int numHabitaciones;
		double superficie;
		boolean parking;
		String estado;
		String propietario;

		imprimirVivienda(casa1);
	}

	/**
	 * Método que imprime en consola los detalles de una vivienda dada.
	 *
	 * @param casa1 objeto Vivienda a imprimir
	 */
	public static void imprimirVivienda(Vivienda casa1) {
		System.out.println("Precio: " + casa1.getPrecio());
		System.out.println("Número de habitaciones: " + casa1.getNumHabitaciones());
		System.out.println("Superficie en m2: " + casa1.getSuperficie());
		System.out.println("¿Dispone de parking?: " + casa1.isParking());
		System.out.println("Estado: " + casa1.getEstado());
		System.out.println("Propietario: " + casa1.getPropietario());
	}

}
