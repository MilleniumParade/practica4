public class NaveMilitarDeTransporteFactory implements NaveFactory {
    @Override
    public Armas crearArmas() {
        return new MisilesPlasma();
    }

    @Override
    public Blindaje crearBlindaje() {
        return new BlindajeReforzado();
    }

    @Override
    public Cabina crearCabina() {
        return new CabinaTripulacionPequena();
    }

    @Override
    public Propulsion crearPropulsion() {
        return new ViajeInterplanetario();

    }

}