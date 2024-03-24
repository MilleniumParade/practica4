/**
 * Interfaz que representa una fábrica para crear componentes de una nave
 * espacial.
 */
public interface NaveFactory {

    /**
     * Crea un objeto que representa el sistema de armas de la nave espacial.
     *
     * @return una instancia de {@link Armas} que representa el sistema de armas
     */
    public Armas crearArmas();

    /**
     * Crea un objeto que representa el sistema de blindaje o protección de la nave
     * espacial.
     *
     * @return una instancia de {@link Blindaje} que representa el sistema de
     *         blindaje
     */
    public Blindaje crearBlindaje();

    /**
     * Crea un objeto que representa la cabina o la cabina de la nave espacial.
     *
     * @return una instancia de {@link Cabina} que representa la cabina o cabina de
     *         mando
     */
    public Cabina crearCabina();

    /**
     * Crea un objeto que representa el sistema de propulsión de la nave espacial.
     *
     * @return una instancia de {@link Propulsion} que representa el sistema de
     *         propulsión
     */
    public Propulsion crearPropulsion();

}
