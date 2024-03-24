/**
 * Interfaz que representa un tipo de componente que son armas.
 */
public interface Armas extends Componente {

    /**
     * Obtiene el valor de ataque del arma.
     *
     * @return el valor de ataque del arma
     */
    public int getAtaque();

    /**
     * Obtiene el valor de defensa del arma.
     *
     * @return el valor de defensa del arma
     */
    public int getDefensa();

    /**
     * Obtiene la velocidad del arma.
     *
     * @return la velocidad del arma
     */
    public int getVelocidad();

    /**
     * Obtiene el peso del arma.
     *
     * @return el peso del arma
     */
    public int getPeso();

}
