/**
 * Clase que representa un tipo de arma conocida como "Láser Simple".
 */
public class LaserSimple implements Armas {

    /**
     * Obtiene el nombre del arma.
     *
     * @return el nombre del arma
     */
    @Override
    public String getNombre() {
        return "Laser simple altamente preciso ";
    }

    /**
     * Obtiene la descripción del arma.
     *
     * @return la descripción del arma
     */
    @Override
    public String getDescripcion() {
        return "Laser simple que dispara uno por uno";
    }

    /**
     * Obtiene el precio del arma.
     *
     * @return el precio del arma
     */
    @Override
    public double getPrecio() {
        return 1200.0;
    }

    /**
     * Obtiene el valor de ataque del arma.
     *
     * @return el valor de ataque del arma
     */
    @Override
    public int getAtaque() {
        return 90;
    }

    /**
     * Obtiene el valor de defensa del arma.
     *
     * @return el valor de defensa del arma
     */
    @Override
    public int getDefensa() {
        return 0;
    }

    /**
     * Obtiene la velocidad del arma.
     *
     * @return la velocidad del arma
     */
    @Override
    public int getVelocidad() {
        return 30;
    }

    /**
     * Obtiene el peso del arma.
     *
     * @return el peso del arma
     */
    @Override
    public int getPeso() {
        return 5;
    }

}
