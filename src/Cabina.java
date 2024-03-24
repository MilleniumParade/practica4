/**
 * Interfaz que representa un tipo de componente que es cabina.
 */
public interface Cabina extends Componente {

     /**
     * Obtiene el valor de ataque de la cabina.
     *
     * @return el valor de ataque de la cabina
     */
    public int getAtaque();

     /**
     * Obtiene el valor de defensa de la cabina.
     *
     * @return el valor de defensa de la cabina
     */
    public int getDefensa();

     /**
     * Obtiene la velocidad de la cabina.
     *
     * @return la velocidad de la cabina
     */
    public int getVelocidad();

    /**
     * Obtiene el peso de la cabina.
     *
     * @return el peso de la cabina
     */
    public int getPeso();

}
