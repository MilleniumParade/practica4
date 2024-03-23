public class MisilesPlasma implements Armas {

    @Override
    public String getNombre() {
        return "Misiles de Plasma";
    }

    @Override
    public String getDescripcion() {
        return "Misiles de plasma altamente destructivos";
    }

    @Override
    public double getPrecio() {
        return 2500.0;
    }

    @Override
    public int getAtaque() {
        return 120;
    }

    @Override
    public int getDefensa() {
        return 0;
    }

    @Override
    public int getVelocidad() {
        return 8;
    }

    @Override
    public int getPeso() {
        return 12;
    }
}
