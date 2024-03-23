public class NaveBaseEspacialDeGuerra extends NaveBuilder {
    private NaveEspacial naveEspacial;

    public NaveBaseEspacialDeGuerra() {
        this.naveEspacial = new NaveEspacial();
    }

    @Override
    public NaveEspacial getNaveEspacial() {
        return naveEspacial;
    }

    @Override
    public void buildNaveEspacial() {
        naveEspacial.setPropulsion(new ViajeIntergalactico());
        naveEspacial.setBlindaje(new BlindajeFortaleza());
        naveEspacial.setCabina(new CabinaEjercito());
        naveEspacial.setArmas(new LaserDestructorPlanetas());

    }

    @Override
    public double getPrecio() {
        return nave.getPrecio();
    }
}