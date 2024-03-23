public class CabinaTripulacionPequena implements Cabina {
    @Override
    public String getNombre() {
        return "Cabina Tripulación Pequeña";
    }

    @Override
    public String getDescripcion() {
        return "Diseñada para una tripulación reducida, ofrece un equilibrio entre espacio y funcionalidad.";
    }

    @Override
    public double getPrecio() {
        return 5000.0; // Precio hipotético
    }

    @Override
    public int getAtaque() {
        return 0;
    }

    @Override
    public int getDefensa() {
        return 50; // Puede tener algún efecto en la defensa dependiendo del diseño de la nave
    }

    @Override
    public int getVelocidad() {
        return 20; // No afecta la velocidad significativamente
    }

    @Override
    public int getPeso() {
        return 25; // Peso moderado para una tripulación pequeña
    }
}
