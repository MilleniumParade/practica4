public class ViajeIntergalactico implements Propulsion {
    @Override
    public String getNombre() {
        return "Viaje Intergaláctico";
    }

    @Override
    public String getDescripcion() {
        return "Propulsión avanzada diseñada para viajes entre galaxias.";
    }

    @Override
    public double getPrecio() {
        return 30000.0;
    }

    @Override
    public int getVelocidad() {
        return 1000; // Velocidad muy alta para viajes intergalácticos
    }

    @Override
    public int getPeso() {
        return 500; // Peso moderado-alto
    }

    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 0;
    }

}
