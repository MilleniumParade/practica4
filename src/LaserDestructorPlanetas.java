public class LaserDestructorPlanetas implements Armas {

    @Override
    public String getNombre() {
        return "Láser Destructor de Planetas";
    }

    @Override
    public String getDescripcion() {
        return "Arma de destrucción masiva capaz de eliminar planetas enteros";
    }

    @Override
    public double getPrecio() {
        return 50000.0; 
    }

    @Override
    public int getAtaque() {
        return 10000;
    }

    @Override
    public int getDefensa() {
        return 0; 
    }

    @Override
    public int getVelocidad() {
        return 1; 
    }

    @Override
    public int getPeso() {
        return 100; 
    }
}
