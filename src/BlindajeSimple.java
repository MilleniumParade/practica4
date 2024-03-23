public class BlindajeSimple implements Blindaje {
    @Override
    public String getNombre() {
        return "Blindaje Simple";
    }

    @Override
    public String getDescripcion() {
        return "Proporciona una defensa básica contra ataques físicos y energéticos.";
    }

    @Override
    public double getPrecio() {
        return 10000.0; // Precio hipotético
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 50;
    }

    @Override
    public int getVelocidad() {
        return 10; // No afecta la velocidad
    }

    @Override
    public int getPeso() {
        return 17;
    }
}
