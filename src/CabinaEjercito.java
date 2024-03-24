/**
 * Clase que representa una cabina de un ejercito
 * 
 */
public class CabinaEjercito implements Cabina {

    /**
     * Obtiene el nombre de la cabina.
     *
     * @return el nombre de la cabina
     */
    @Override
    public String getNombre() {
        return "Cabina Ejército";
    }

    /**
     * Obtiene la descripción de la cabina.
     *
     * @return la descripción de la cabina
     */
    @Override
    public String getDescripcion() {
        return "Espaciosa cabina diseñada para una unidad militar completa, proporciona espacio para equipos y tropas.";
    }

    /**
     * Obtiene el precio de la cabina.
     *
     * @return el precio de la cabina
     */
    @Override
    public double getPrecio() {
        return 10000.0;
    }

    /**
     * Obtiene el valor de ataque de la cabina.
     *
     * @return el valor de ataque de la cabina
     */
    @Override
    public int getAtaque() {
        return 0;
    }

    /**
     * Obtiene el valor de defensa de la cabina.
     *
     * @return el valor de defensa de la cabina
     */
    @Override
    public int getDefensa() {
        return 60;
    }

    /**
     * Obtiene la velocidad de la cabina.
     *
     * @return la velocidad de la cabina
     */
    @Override
    public int getVelocidad() {
        return -15;
    }

    /**
     * Obtiene el peso de la cabina.
     *
     * @return el peso de la cabina
     */
    @Override
    public int getPeso() {
        return 50;
    }
}
