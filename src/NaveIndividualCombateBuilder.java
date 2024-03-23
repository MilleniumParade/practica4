public class NaveIndividualCombateBuilder extends NaveBuilder {
    private NaveEspacial naveEspacial;

    public NaveIndividualCombateBuilder() {
        this.naveEspacial = new NaveEspacial();
    }

    @Override
    public NaveEspacial getNaveEspacial() {
        return this.naveEspacial;
    }

    @Override
    public void buildNaveEspacial() {
        naveEspacial.setPropulsion(new ViajeIntercontinental());
        naveEspacial.setBlindaje(new BlindajeSimple());
        naveEspacial.setCabina(new Cabina1Piloto());
        naveEspacial.setArmas(new LaserSimple());

    }

    @Override
    public double getPrecio() {
        return naveEspacial.getPrecio();
    }

}