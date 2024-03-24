/**
 * Clase que representa un tipo de arma conocida como "Misiles de Plasma".
 */
public class MisilesPlasma implements Armas {

    /**
     * Obtiene el nombre del arma.
     *
     * @return el nombre del arma
     */
    @Override
    public String getNombre() {
        return "Misiles de Plasma";
    }

     /**
     * Obtiene la descripción del arma.
     *
     * @return la descripción del arma
     */
    @Override
    public String getDescripcion() {
        return "Misiles de plasma altamente destructivos";
    }

     /**
     * Obtiene el precio del arma.
     *
     * @return el precio del arma
     */
    @Override
    public double getPrecio() {
        return 2500.0;
    }

    /**
     * Obtiene el valor de ataque del arma.
     *
     * @return el valor de ataque del arma
     */
    @Override
    public int getAtaque() {
        return 120;
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
        return 8;
    }

    /**
     * Obtiene el peso del arma.
     *
     * @return el peso del arma
     */
    @Override
    public int getPeso() {
        return 12;
    }
}
