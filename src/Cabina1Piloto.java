/**
 * Clase que representa una cabina de un piloto
 * 
 */
public class Cabina1Piloto implements Cabina {

    /**
     * Obtiene el nombre de la cabina.
     *
     * @return el nombre de la cabina
     */
    @Override
    public String getNombre() {
        return "Cabina de un  Piloto";
    }

    /**
     * Obtiene la descripción de la cabina.
     *
     * @return la descripción de la cabina
     */
    @Override
    public String getDescripcion() {
        return "Diseñada para un único piloto, ideal para misiones de exploración y combate.";
    }

    /**
     * Obtiene el precio de la cabina.
     *
     * @return el precio de la cabina
     */
    @Override
    public double getPrecio() {
        return 3000.0;
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
        return 30;
    }

    /**
     * Obtiene la velocidad de la cabina.
     *
     * @return la velocidad de la cabina
     */
    @Override
    public int getVelocidad() {
        return 50;
    }

    /**
     * Obtiene el peso de la cabina.
     *
     * @return el peso de la cabina
     */
    @Override
    public int getPeso() {
        return 15;
    }
}
