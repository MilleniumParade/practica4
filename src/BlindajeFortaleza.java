public class BlindajeFortaleza implements Blindaje {

    @Override
    public String getNombre() {
        return "Blindaje Fortaleza";
    }

    @Override
    public String getDescripcion() {
        return "Proporciona una defensa excepcional contra cualquier tipo de ataque. Una fortaleza andante.";
    }

    @Override
    public double getPrecio() {
        return 30000.0;
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 500;
    }

    @Override
    public int getVelocidad() {
        return -25;
    }

    @Override
    public int getPeso() {
        return 50; // Peso considerablemente alto
    }
}
