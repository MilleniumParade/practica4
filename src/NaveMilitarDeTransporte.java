public class NaveMilitarDeTransporte extends NaveBuilder {
    private NaveEspacial naveEspacial;

    public NaveMilitarDeTransporte() {
        this.naveEspacial = new NaveEspacial();
    }

    @Override
    public NaveEspacial getNaveEspacial() {
        return this.naveEspacial;
    }

    @Override
    public void buildNaveEspacial() {
        naveEspacial.setPropulsion(new ViajeInterplanetario());
        naveEspacial.setBlindaje(new BlindajeReforzado());
        naveEspacial.setCabina(new CabinaTripulacionPequena());
        naveEspacial.setArmas(new MisilesPlasma());

    }

    @Override
    public double getPrecio() {
        return naveEspacial.getPrecio();
    }

}