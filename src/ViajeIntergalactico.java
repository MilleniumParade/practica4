/**
 * Clase que representa un tipo de sistema de propulsión conocido como "Viaje
 * Intergalactico".
 */
public class ViajeIntergalactico implements Propulsion {

    /**
     * Obtiene el nombre del sistema de propulsión.
     *
     * @return el nombre del sistema de propulsión
     */
    @Override
    public String getNombre() {
        return "Viaje Intergaláctico";
    }

    /**
     * Obtiene la descripción del sistema de propulsión.
     *
     * @return la descripción del sistema de propulsión
     */
    @Override
    public String getDescripcion() {
        return "Propulsión avanzada diseñada para viajes entre galaxias.";
    }

    /**
     * Obtiene el precio del sistema de propulsión.
     *
     * @return el precio del sistema de propulsión
     */
    @Override
    public double getPrecio() {
        return 30000.0;
    }

    /**
     * Obtiene la velocidad del sistema de propulsión.
     *
     * @return la velocidad del sistema de propulsión
     */
    @Override
    public int getVelocidad() {
        return 1000; // Velocidad muy alta para viajes intergalácticos
    }

    /**
     * Obtiene el peso del sistema de propulsión.
     *
     * @return el peso del sistema de propulsión
     */
    @Override
    public int getPeso() {
        return 500; // Peso moderado-alto
    }

    /**
     * Obtiene el valor de ataque del sistema de propulsión.
     *
     * @return el valor de ataque del sistema de propulsión
     */
    public int getAtaque() {
        return 0;
    }

    /**
     * Obtiene el valor de defensa del sistema de propulsión.
     *
     * @return el valor de defensa del sistema de propulsión
     */
    @Override
    public int getDefensa() {
        return 0;
    }

}
