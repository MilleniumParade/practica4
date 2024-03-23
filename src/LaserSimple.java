public class LaserSimple implements Armas {

    @Override
    public String getNombre() {
        return "Laser simple altamente preciso ";
    }

    @Override
    public String getDescripcion() {
        return "Laser simple que dispara uno por uno";
    }

    @Override
    public double getPrecio() {
        return 1200.0;
    }

    @Override
    public int getAtaque() {
        return 90;
    }

    @Override
    public int getDefensa() {
        return 0;
    }

    @Override
    public int getVelocidad() {
        return 30;
    }

    @Override
    public int getPeso() {
        return 5;
    }

}
