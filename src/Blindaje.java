/**
 * Interfaz que representa un tipo de componente que es blindaje.
 */
public interface Blindaje extends Componente {

    /**
     * Obtiene el valor de ataque del blindaje.
     *
     * @return el valor de ataque del blindaje
     */
    public int getAtaque();

    /**
     * Obtiene el valor de defensa del blindaje.
     *
     * @return el valor de defensa del blindaje
     */
    public int getDefensa();

    /**
     * Obtiene la velocidad del blindaje.
     *
     * @return la velocidad del blindaje
     */
    public int getVelocidad();

    /**
     * Obtiene el peso del blindaje.
     *
     * @return el peso del blindaje
     */
    public int getPeso();

}
