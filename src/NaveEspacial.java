public class NaveEspacial {
    private Propulsion sistemaPropulsión;
    private Blindaje blindaje;
    private Cabina cabina;
    private Armas armas;

    public NaveEspacial() {

    }

    public Propulsion getPropulsion() {
        return sistemaPropulsión;
    }

    public void setPropulsion(Propulsion sistemaPropulsión) {
        this.sistemaPropulsión = sistemaPropulsión;
    }

    public Blindaje getBlindaje() {
        return blindaje;
    }

    public void setBlindaje(Blindaje blindaje) {
        this.blindaje = blindaje;
    }

    public Cabina getCabina() {
        return cabina;
    }

    public void setCabina(Cabina cabina) {
        this.cabina = cabina;
    }

    public Armas getArmas() {
        return armas;
    }

    public void setArmas(Armas armas) {
        this.armas = armas;
    }

    public double getPrecio() {
        return sistemaPropulsión.getPrecio() + blindaje.getPrecio() + cabina.getPrecio() + armas.getPrecio();
    }

}