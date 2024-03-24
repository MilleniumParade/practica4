/**
 * Interfaz que representa un tipo de componente que es propulsión.
 */
public interface Propulsion extends Componente {

    /**
     * Obtiene el valor de ataque de la propulsión.
     *
     * @return el valor de ataque de la propulsión
     */
    public int getAtaque();

    /**
     * Obtiene el valor de defensa de la propulsión.
     *
     * @return el valor de defensa de la propulsión
     */
    public int getDefensa();

    /**
     * Obtiene la velocidad de la propulsión.
     *
     * @return la velocidad de la propulsión
     */
    public int getVelocidad();

    /**
     * Obtiene el peso de la propulsión.
     *
     * @return el peso de la propulsión
     */
    public int getPeso();

}
