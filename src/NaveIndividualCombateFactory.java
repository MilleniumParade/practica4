public class NaveIndividualCombateFactory implements NaveFactory {

    @Override
    public Armas crearArmas() {
        return new LaserSimple();
    }

    @Override
    public Blindaje crearBlindaje() {
        return new BlindajeSimple();
    }

    @Override
    public Cabina crearCabina() {
        return new Cabina1Piloto();
    }

    @Override
    public Propulsion crearPropulsion() {
        return new ViajeIntercontinental();

    }

}