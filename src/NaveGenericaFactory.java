import java.util.Scanner;

// Implementación concreta de la fábrica para la creación de una Nave Genérica
class NaveGenericaFactory implements NaveFactory {
    Scanner scanner = new Scanner(System.in);

    public Propulsion crearPropulsion() {
        Propulsion propulsion = null;
        do {
            System.out.println("Selecciona el tipo de sistema de propulsión:");
            System.out.println("1. Viaje intercontinental");
            System.out.println("2. Viaje interplanetario");
            System.out.println("3. Viaje intergaláctico");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    propulsion = new ViajeIntercontinental();
                    break;
                case 2:
                    propulsion = new ViajeInterplanetario();
                    break;
                case 3:
                    propulsion = new ViajeIntergalactico();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (propulsion == null);
        return propulsion;
    }

    public Blindaje crearBlindaje() {
        Blindaje blindaje = null;
        do {
            System.out.println("Selecciona el tipo de blindaje:");
            System.out.println("1. Simple");
            System.out.println("2. Reforzado");
            System.out.println("3. Fortaleza");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    blindaje = new BlindajeSimple();
                    break;
                case 2:
                    blindaje = new BlindajeReforzado();
                    break;
                case 3:
                    blindaje = new BlindajeFortaleza();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (blindaje == null);
        return blindaje;
    }

    public Cabina crearCabina() {
        Cabina cabina = null;
        do {
            System.out.println("Selecciona el tipo de cabina:");
            System.out.println("1. 1 piloto");
            System.out.println("2. Tripulación pequeña");
            System.out.println("3. Ejército");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    cabina = new Cabina1Piloto();
                    break;
                case 2:
                    cabina = new CabinaTripulacionPequena();
                    break;
                case 3:
                    cabina = new CabinaEjercito();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (cabina == null);
        return cabina;
    }

    public Armas crearArmas() {
        Armas armas = null;
        do {
            try {
                System.out.println("Selecciona el tipo de armas:");
                System.out.println("1. Láser simple");
                System.out.println("2. Misiles de plasma");
                System.out.println("3. Láser destructor de planetas");
                int opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        armas = new LaserSimple();
                        break;
                    case 2:
                        armas = new MisilesPlasma();
                        break;
                    case 3:
                        armas = new LaserDestructorPlanetas();
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                        break;
                }
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Por favor, ingrese un número entero.");
                scanner.nextLine(); // Limpiar el buffer del Scanner
            }
        } while (armas == null);
        return armas;
    }
}
