/**
 * Una implementación concreta de {@code NaveFactory} para crear una nave
 * espacial de guerra base.
 */
public class NaveMilitarDeTransporteFactory implements NaveFactory {
    /**
     * Crea un objeto que representa el sistema de armas de la nave espacial de
     * guerra base.
     *
     * @return una instancia de {@link LaserDestructorPlanetas} que representa el
     *         sistema de armas
     */
    @Override
    public Armas crearArmas() {
        return new MisilesPlasma();
    }

    /**
     * Crea un objeto que representa el sistema de blindaje de la nave espacial de
     * guerra base.
     *
     * @return una instancia de {@link BlindajeFortaleza} que representa el sistema
     *         de blindaje
     */
    @Override
    public Blindaje crearBlindaje() {
        return new BlindajeReforzado();
    }

    /**
     * Crea un objeto que representa la cabina de la nave espacial de guerra base.
     *
     * @return una instancia de {@link CabinaEjercito} que representa la cabina de
     *         la nave
     */
    @Override
    public Cabina crearCabina() {
        return new CabinaTripulacionPequena();
    }

    /**
     * Crea un objeto que representa el sistema de propulsión de la nave espacial de
     * guerra base.
     *
     * @return una instancia de {@link ViajeIntergalactico} que representa el
     *         sistema de propulsión
     */
    @Override
    public Propulsion crearPropulsion() {
        return new ViajeInterplanetario();

    }

}