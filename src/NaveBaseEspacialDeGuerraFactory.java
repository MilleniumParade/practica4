public class NaveBaseEspacialDeGuerraFactory implements NaveFactory {
    @Override
    public Armas crearArmas() {
        return new LaserDestructorPlanetas();
    }

    @Override
    public Blindaje crearBlindaje() {
        return new BlindajeFortaleza();
    }

    @Override
    public Cabina crearCabina() {
        return new CabinaEjercito();
    }

    @Override
    public Propulsion crearPropulsion() {
        return new ViajeIntergalactico();
    }
}