public class ViajeIntercontinental implements Propulsion {
    @Override
    public String getNombre() {
        return "Viaje Intercontinental";
    }

    @Override
    public String getDescripcion() {
        return "Propulsión diseñada para viajes de larga distancia dentro del mismo continente.";
    }

    @Override
    public double getPrecio() {
        return 5000.0;
    }

    @Override
    public int getVelocidad() {
        return 80; 
    }

    @Override
    public int getPeso() {
        return 75;
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 5;
    }
}