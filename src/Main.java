import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double presupuesto = 0;
        NaveEspacial nave;

        System.out.println("***** BIENVENIDO A LA ASTROCRAFT *****");

        while (true) {
            try {
                if (presupuesto <= 0) {
                    System.out.println("Por favor, ingrese su presupuesto:");
                    presupuesto = Double.parseDouble(sc.nextLine());
                    if (presupuesto <= 0) {
                        System.out.println("El presupuesto debe ser mayor que cero.");
                        continue;
                    }
                }

                System.out.println("Tendrá la oportunidad de seleccionar los componentes de su Nave.\n");
                nave = new NaveEspacial(new NaveGenericaFactory());
                nave.construirNave();

                // Si el presupuesto está excedido
                if (nave.getPrecio() > presupuesto) {
                    System.out.println("El costo de tu nave sobrepasa tu presupuesto.");
                    nave = manejarPresupuestoExcedido(sc, presupuesto);
                    // Verifica que nave no es null antes de proceder
                    if (nave == null) { // Si el usuario decide reingresar el presupuesto
                        presupuesto = 0; // Resetea el presupuesto para permitir la reentrada
                        continue; // Continúa el ciclo para permitir nueva entrada de datos
                    } else {
                        // Asegúrate de construir la nave antes de acceder a sus métodos
                        nave.construirNave();
                    }
                }

                System.out
                        .println("Tu nave está lista para recoger, estas son sus características:\n" + nave.toString());
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Ordenar otra nave");
                System.out.println("2. Salir");

                int opcionFinal = Integer.parseInt(sc.nextLine());
                if (opcionFinal == 2) {
                    System.out.println("Gracias por su compra. ¡Hasta la próxima!");
                    break; // Salir del programa
                } else {
                    presupuesto = 0; // Resetea el presupuesto si decide ordenar otra nave
                }

            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
            }
        }
        sc.close();
    }

    private static NaveEspacial manejarPresupuestoExcedido(Scanner sc, double presupuesto) {
        NaveEspacial nave = null;
        while (true) {
            System.out.println("1. Mostrar nuestro catálogo.");
            System.out.println("2. Volver a insertar presupuesto.");
            System.out.println("3. Salir.");
            try {
                int opcion = Integer.parseInt(sc.nextLine());
                switch (opcion) {
                    case 1:
                        nave = mostrarCatalogo();
                        nave.construirNave();
                        if (nave.getPrecio() > presupuesto) {
                            System.out.println("La nave seleccionada excede su presupuesto actual de: $" + presupuesto);
                            // Opción para ajustar la selección o el presupuesto aquí.
                            continue; // Mantiene al usuario en el menú para tomar otra decisión.
                        }
                        return nave; // Retorna la nave seleccionada si se ajusta al presupuesto.
                    case 2:
                        return null; // Indica que se desea reingresar el presupuesto.
                    case 3:
                        System.out.println("Saliendo del programa...");
                        System.exit(0); // Sale del programa.
                    default:
                        System.out.println("Por favor, ingrese una opción válida (1, 2, o 3).");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }
    }

    public static NaveEspacial mostrarCatalogo() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        while (true) {
            try {
                System.out.println("Mostrando nuestro catálogo. Elige la opción que más te ajuste:");
                System.out.println("1. Nave Individual de Combate. Costo: $19,200");
                System.out.println("2. Nave Militar de Transporte. Costo: $32,500");
                System.out.println("3. Nave Base Espacial de Guerra. Costo: $90,000");

                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion >= 1 && opcion <= 3) {
                    break;
                } else {
                    System.out.println("Por favor, ingrese un número válido entre 1 y 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        switch (opcion) {
            case 1:
                return new NaveEspacial(new NaveIndividualCombateFactory());
            case 2:
                return new NaveEspacial(new NaveMilitarDeTransporteFactory());
            case 3:
                return new NaveEspacial(new NaveBaseEspacialDeGuerraFactory());
            default:
                return null; // Nunca debería llegar aquí
        }
    }
}
