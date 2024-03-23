public class NaveGenericaBuilder extends NaveBuilder {
    private NaveEspacial naveEspacial;

    public NaveGenericaBuilder() {
        this.naveEspacial = new NaveEspacial();
    }

    public void buildPropulsion(Propulsion sistemaPropulsión, int presupuesto) {
        if (presupuesto > sistemaPropulsión.getPrecio()) {
            naveEspacial.setPropulsion(sistemaPropulsión);

        } else {
            System.out.println("El presupuesto es menor al precio del sistema propulsion");
            naveEspacial.setPropulsion(null);
            throw new IllegalStateException("El presupuesto es menor al precio del sistema de propulsión");
        }
    }

    public void buildBlindaje(Blindaje blindaje, int presupuesto) {
        if (presupuesto > blindaje.getPrecio()) {
            naveEspacial.setBlindaje(blindaje);

        } else {
            System.out.println("El presupuesto es menor al precio del blindaje");
            naveEspacial.setPropulsion(null);
            throw new IllegalStateException("El presupuesto es menor al precio del sistema de propulsión");
        }
    }

    public void buildCabina(Cabina cabina, int presupuesto) {
        if (presupuesto > cabina.getPrecio()) {
            naveEspacial.setCabina(cabina);

        } else {
            System.out.println("El presupuesto es menor al precio de la cabina");
            naveEspacial.setCabina(null);
            throw new IllegalStateException("El presupuesto es menor al precio de la cabina");
        }
    }

    public void buildArmas(Armas armas, int presupuesto) {
        if (presupuesto > armas.getPrecio()) {
            naveEspacial.setArmas(armas);
        } else {
            System.out.println("El presupuesto es menor al precio del arma");
            naveEspacial.setArmas(null);
            throw new IllegalStateException("El presupuesto es menor al precio del arma");
        }
    }

    @Override
    public void buildNaveEspacial() {
        // Verificar si todos los componentes han sido configurados
        if (naveEspacial.getPropulsion() == null ||
                naveEspacial.getBlindaje() == null ||
                naveEspacial.getCabina() == null ||
                naveEspacial.getArmas() == null) {
            throw new IllegalStateException("No se han configurado todos los componentes de la nave.");
        }
        System.out.println("Se ha construido Correctamente la nave espacial");
    }

    @Override
    public NaveEspacial getNaveEspacial() {
        return this.naveEspacial;
    }

    @Override
    public double getPrecio() {
        return naveEspacial.getPrecio();
    }

}