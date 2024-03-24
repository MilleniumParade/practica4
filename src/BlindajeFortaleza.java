/**
 * Clase que representa un tipo de blindaje conocido como "Blindaje Fortaleza".
 */
public class BlindajeFortaleza implements Blindaje {
    
    /**
     * Obtiene el nombre del blindaje.
     *
     * @return el nombre del blindaje
     */
    @Override
    public String getNombre() {
        return "Blindaje Fortaleza";
    }

    /**
     * Obtiene la descripción del blindaje.
     *
     * @return la descripción del blindaje
     */
    @Override
    public String getDescripcion() {
        return "Proporciona una defensa excepcional contra cualquier tipo de ataque. Una fortaleza andante.";
    }

    /**
     * Obtiene el precio del blindaje.
     *
     * @return el precio del blindaje
     */
    @Override
    public double getPrecio() {
        return 30000.0;
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
        return 500;
    }

    /**
     * Obtiene la velocidad del blindaje.
     *
     * @return la velocidad del blindaje
     */
    @Override
    public int getVelocidad() {
        return -25;
    }

    /**
     * Obtiene el peso del blindaje.
     *
     * @return el peso del blindaje
     */
    @Override
    public int getPeso() {
        return 50; // Peso considerablemente alto
    }
}
