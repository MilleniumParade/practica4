/**
 * Clase que representa una cabina de una tripulación pequeña.
 * 
 */
public class CabinaTripulacionPequena implements Cabina {

    /**
     * Obtiene el nombre de la cabina.
     *
     * @return el nombre de la cabina
     */
    @Override
    public String getNombre() {
        return "Cabina Tripulación Pequeña";
    }

    /**
     * Obtiene la descripción de la cabina.
     *
     * @return la descripción de la cabina
     */
    @Override
    public String getDescripcion() {
        return "Diseñada para una tripulación reducida, ofrece un equilibrio entre espacio y funcionalidad.";
    }

    /**
     * Obtiene el precio de la cabina.
     *
     * @return el precio de la cabina
     */
    @Override
    public double getPrecio() {
        return 5000.0; // Precio hipotético
    }

    /**
     * Obtiene el valor de ataque de la cabina.
     *
     * @return el valor de ataque de la cabina
     */
    @Override
    public int getAtaque() {
        return 0;
    }

    /**
     * Obtiene el valor de defensa de la cabina.
     *
     * @return el valor de defensa de la cabina
     */
    @Override
    public int getDefensa() {
        return 50; // Puede tener algún efecto en la defensa dependiendo del diseño de la nave
    }

    /**
     * Obtiene la velocidad de la cabina.
     *
     * @return la velocidad de la cabina
     */
    @Override
    public int getVelocidad() {
        return 20; // No afecta la velocidad significativamente
    }

    /**
     * Obtiene el peso de la cabina.
     *
     * @return el peso de la cabina
     */
    @Override
    public int getPeso() {
        return 25; // Peso moderado para una tripulación pequeña
    }
}
