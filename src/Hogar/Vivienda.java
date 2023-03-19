package Hogar;

/**
 * <h2>Clase Vivienda: Representa propiedades inmobiliarias</h2>
 * La clase Vivienda representa propiedades inmobiliarias y contiene:
 * <ul>
 * <li><b>atributos</b> para describir las características de la vivienda</li>
 * <li><b>dos constructores</b> para inicializar objetos de la clase</li>
 * <li><b>getters y setters</b> para acceder y modificar los atributos</li>
 * <li><b>un método</b> para actualizar el precio de la vivienda</li>
 * </ul>
 * Esta clase forma parte del proyecto de Entornos de Desarrollo del Ciclo de DAW en el <a href=http://www.iesjoseplanes.es//>Instituto Jose Planes</a>.
 * @version 1.1
 * @author Paqui
 * @since 1.0
 */
public class Vivienda {

    /**
     * Precio de la vivienda en la moneda local.
     */
    private double precio;

    /**
     * Número de habitaciones en la vivienda.
     */
    private int numHabitaciones;

    /**
     * Superficie de la vivienda en metros cuadrados.
     */
    private double superficie;

    /**
     * Indica si la vivienda tiene estacionamiento (true) o no (false).
     */
    private boolean parking;

    /**
     * Estado actual de la vivienda (ejemplo: "nuevo", "usado", "reformado",
     * etc.).
     */
    private String estado;

    /**
     * Nombre del propietario actual de la vivienda.
     */
    private String propietario;

    /**
     * Constructor completo de la clase Vivienda.
     *
     * @param precio precio de la vivienda
     * @param numHabitaciones número de habitaciones de la vivienda
     * @param superficie superficie en metros cuadrados de la vivienda
     * @param parking si la vivienda dispone de parking
     * @param estado estado de la vivienda (nuevo, usado, etc.)
     * @param propietario nombre del propietario de la vivienda
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
     * Contructor de un solo parametro En este constructor crea un objeto
     * Vivienda con el parametro del precio.
     *
     * @param precio Precio de la vivienda
     */
    public Vivienda(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio de la vivienda.
     *
     * @return precio de la vivienda
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio de la vivienda.
     *
     * @param precio nuevo precio de la vivienda
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el número de habitaciones de la vivienda.
     *
     * @return número de habitaciones
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    /**
     * Establece el número de habitaciones de la vivienda.
     *
     * @param numHabitaciones nuevo número de habitaciones
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    /**
     * Obtiene la superficie de la vivienda en metros cuadrados.
     *
     * @return superficie de la vivienda
     */
    public double getSuperficie() {
        return superficie;
    }

    /**
     * Establece la superficie de la vivienda en metros cuadrados.
     *
     * @param superficie nueva superficie de la vivienda
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    /**
     * Verifica si la vivienda tiene estacionamiento.
     *
     * @return true si la vivienda tiene estacionamiento, false en caso
     * contrario
     */
    public boolean isParking() {
        return parking;
    }

    /**
     * Establece si la vivienda tiene estacionamiento.
     *
     * @param parking true si la vivienda tiene estacionamiento, false en caso
     * contrario
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    /**
     * Obtiene el estado actual de la vivienda.
     *
     * @return estado de la vivienda
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado actual de la vivienda.
     *
     * @param estado nuevo estado de la vivienda
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene el nombre del propietario actual de la vivienda.
     *
     * @return nombre del propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Establece el nombre del propietario actual de la vivienda.
     *
     * @param propietario nuevo nombre del propietario
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    /**
     * Actualiza el precio de la vivienda aplicando un descuento.
     *
     * @param descuento porcentaje de descuento a aplicar al precio actual
     */
    public void actualizarPrecio(double descuento) {
        double montoDescuento = this.precio * (descuento / 100);
        this.precio = this.precio - montoDescuento;
    }

}
