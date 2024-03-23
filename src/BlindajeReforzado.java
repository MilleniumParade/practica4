public class BlindajeReforzado implements Blindaje {
    @Override
    public String getNombre() {
        return "Blindaje Reforzado";
    }

    @Override
    public String getDescripcion() {
        return "Proporciona alta resistencia a ataques físicos y energéticos.";
    }

    @Override
    public double getPrecio() {
        return 15000;
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 150;
    }

    @Override
    public int getVelocidad() {
        return -8;
    }

    @Override
    public int getPeso() {
        return 30;
    }
}
