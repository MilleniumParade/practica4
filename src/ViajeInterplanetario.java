public class ViajeInterplanetario implements Propulsion {
    @Override
    public String getNombre() {
        return "Viaje Interplanetario";
    }

    @Override
    public String getDescripcion() {
        return "Propulsión diseñada para viajes entre planetas dentro del mismo sistema solar.";
    }

    @Override
    public double getPrecio() {
        return 10000.0;
    }

    @Override
    public int getVelocidad() {
        return 500; // Alta velocidad para viajes interplanetarios
    }

    @Override
    public int getPeso() {
        return 300; // Peso moderado-alto
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 0;
    }
}
