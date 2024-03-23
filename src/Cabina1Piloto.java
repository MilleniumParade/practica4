public class Cabina1Piloto implements Cabina {
    @Override
    public String getNombre() {
        return "Cabina de un  Piloto";
    }

    @Override
    public String getDescripcion() {
        return "Diseñada para un único piloto, ideal para misiones de exploración y combate.";
    }

    @Override
    public double getPrecio() {
        return 3000.0;
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 30;
    }

    @Override
    public int getVelocidad() {
        return 50;
    }

    @Override
    public int getPeso() {
        return 15;
    }
}
