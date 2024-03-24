/**
 * Clase que representa un tipo de blindaje conocido como "Blindaje Simple".
 */
public class BlindajeSimple implements Blindaje {

    /**
     * Obtiene el nombre del blindaje.
     *
     * @return el nombre del blindaje
     */
    @Override
    public String getNombre() {
        return "Blindaje Simple";
    }

    /**
     * Obtiene la descripción del blindaje.
     *
     * @return la descripción del blindaje
     */
    @Override
    public String getDescripcion() {
        return "Proporciona una defensa básica contra ataques físicos y energéticos.";
    }

    /**
     * Obtiene el precio del blindaje.
     *
     * @return el precio del blindaje
     */
    @Override
    public double getPrecio() {
        return 10000.0; // Precio hipotético
    }

    /**
     * Obtiene el valor de ataque del blindaje.
     *
     * @return el valor de ataque del blindaje
     */
    @Override
    public int getAtaque() {
        return 0;
    }

    /**
     * Obtiene el valor de defensa del blindaje.
     *
     * @return el valor de defensa del blindaje
     */
    @Override
    public int getDefensa() {
        return 50;
    }

    /**
     * Obtiene la velocidad del blindaje.
     *
     * @return la velocidad del blindaje
     */
    @Override
    public int getVelocidad() {
        return 10; // No afecta la velocidad
    }

    /**
     * Obtiene el peso del blindaje.
     *
     * @return el peso del blindaje
     */
    @Override
    public int getPeso() {
        return 17;
    }
}
