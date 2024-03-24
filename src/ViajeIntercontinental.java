/**
 * Clase que representa un tipo de sistema de propulsión conocido como "Viaje
 * Intercontinental".
 */
public class ViajeIntercontinental implements Propulsion {

    /**
     * Obtiene el nombre del sistema de propulsión.
     *
     * @return el nombre del sistema de propulsión
     */
    @Override
    public String getNombre() {
        return "Viaje Intercontinental";
    }

    /**
     * Obtiene la descripción del sistema de propulsión.
     *
     * @return la descripción del sistema de propulsión
     */
    @Override
    public String getDescripcion() {
        return "Propulsión diseñada para viajes de larga distancia dentro del mismo continente.";
    }

    /**
     * Obtiene el precio del sistema de propulsión.
     *
     * @return el precio del sistema de propulsión
     */
    @Override
    public double getPrecio() {
        return 5000.0;
    }

    /**
     * Obtiene la velocidad del sistema de propulsión.
     *
     * @return la velocidad del sistema de propulsión
     */
    @Override
    public int getVelocidad() {
        return 80;
    }

    /**
     * Obtiene el peso del sistema de propulsión.
     *
     * @return el peso del sistema de propulsión
     */
    @Override
    public int getPeso() {
        return 75;
    }

    /**
     * Obtiene el valor de ataque del sistema de propulsión.
     *
     * @return el valor de ataque del sistema de propulsión
     */
    @Override
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
        return 5;
    }
}