/**
 * La clase NaveEspacial representa una nave espacial configurable que puede ser
 * construida
 * utilizando una fábrica de componentes de nave específica.
 */
public class NaveEspacial {
    NaveFactory naveFactory;
    private Propulsion sistemaPropulsión;
    private Blindaje blindaje;
    private Cabina cabina;
    private Armas armas;

    public NaveEspacial(NaveFactory naveFactory) {
        this.naveFactory = naveFactory;
    }

    /**
     * Método para construir la nave utilizando la fábrica de componentes de nave
     * proporcionada.
     */
    public void construirNave() {
        System.out.println("Construyendo la Nave");
        this.armas = naveFactory.crearArmas();
        this.blindaje = naveFactory.crearBlindaje();
        this.cabina = naveFactory.crearCabina();
        this.sistemaPropulsión = naveFactory.crearPropulsion();
    }

    /*
     * Regresa el total del precio de la Nave Espacial
     * 
     * @return total del precio de los componentes
     */
    public double getPrecio() {
        return sistemaPropulsión.getPrecio() + blindaje.getPrecio() + cabina.getPrecio() + armas.getPrecio();
    }

    /*
     * Devuelve una representación en forma de cadena de la Nave Espacial,
     * incluyendo detalles sobre los componentes de la nave y sus estadísticas.
     *
     * @return Una cadena que representa la Nave Espacial, con detalles
     * sobre los componentes y estadísticas totales.
     * 
     * Nota: el String builder me apoye em la documentacion de java y
     * en este link por si quieren consultar más :
     * https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nave Espacial\n");
        sb.append("Sistema de Propulsión: ")
                .append(sistemaPropulsión.getNombre() + " - " + sistemaPropulsión.getDescripcion()).append("\n");
        sb.append("Blindaje: ")
                .append(blindaje.getNombre() + " - " + blindaje.getDescripcion()).append("\n");
        sb.append("Cabina: ")
                .append(cabina.getNombre() + " - " + cabina.getDescripcion()).append("\n");
        sb.append("Armas: ")
                .append(armas.getNombre() + " - " + armas.getDescripcion()).append("\n");
        sb.append("Costo total de la Nave: $").append(getPrecio()).append("\n");

        // Sumando las estadísticas totales
        int totalAtaque = sistemaPropulsión.getAtaque() + blindaje.getAtaque() + cabina.getAtaque() + armas.getAtaque();
        int totalDefensa = sistemaPropulsión.getDefensa() + blindaje.getDefensa() + cabina.getDefensa()
                + armas.getDefensa();
        int totalVelocidad = sistemaPropulsión.getVelocidad() + blindaje.getVelocidad() + cabina.getVelocidad()
                + armas.getVelocidad();
        int totalPeso = sistemaPropulsión.getPeso() + blindaje.getPeso() + cabina.getPeso() + armas.getPeso();

        // Añadiendo las estadísticas al StringBuilder
        sb.append("\nEstadísticas Totales:\n");
        sb.append("Ataque total: ").append(totalAtaque).append("\n");
        sb.append("Defensa total: ").append(totalDefensa).append("\n");
        sb.append("Velocidad total: ").append(totalVelocidad).append("\n");
        sb.append("Peso total: ").append(totalPeso).append("\n");

        return sb.toString();
    }

}