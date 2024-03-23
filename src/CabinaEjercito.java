public class CabinaEjercito implements Cabina {
    @Override
    public String getNombre() {
        return "Cabina Ejército";
    }

    @Override
    public String getDescripcion() {
        return "Espaciosa cabina diseñada para una unidad militar completa, proporciona espacio para equipos y tropas.";
    }

    @Override
    public double getPrecio() {
        return 10000.0;
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 60;
    }

    @Override
    public int getVelocidad() {
        return -15; 
    }

    @Override
    public int getPeso() {
        return 50;
    }
}
