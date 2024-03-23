
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int presupuesto = 0;
        NaveEspacial nave = new NaveEspacial();

        System.out.println("***** BIENVENIDO A LA ASTROCRAFT*****");

        while (true) {
            try {
                System.out.println("Para brindarle el mejor servicio, inserte: ¿Cuál es su presupuesto?");
                presupuesto = Integer.parseInt(sc.nextLine());

                NaveGenericaBuilder builder = new NaveGenericaBuilder();
                System.out.println("Tendrá la oportunidad de seleccionar los componentes de su Nave.\n ");
                construirSistemaDePropulsion(builder, presupuesto);
                construirBlindaje(builder, presupuesto);
                construirCabina(builder, presupuesto);
                construirArmas(builder, presupuesto);

                builder.buildNaveEspacial();
                nave = builder.getNaveEspacial();
                System.out.println("Nave construida exitosamente.");

            } catch (IllegalStateException e) {
                System.out.println(
                        "El costo de tu nave sobrepasa tu presupuesto. ¿Deseas diseñar otra nave o ver nuestro catálogo?. Inserte el número de la opción que desee:");
                System.out.println("1. Mostrar nuestro catálogo.");
                System.out.println("2. Volver a insertar presupuesto.");
                System.out.println("3. Salir.");

                int opcion;
                while (true) {
                    try {
                        opcion = Integer.parseInt(sc.nextLine());
                        if (opcion == 1) {
                            nave = mostrarCatalogo(presupuesto);
                            break;
                        } else if (opcion == 2) {
                            break;
                        } else if (opcion == 3) {
                            System.out.println("Saliendo del programa...");
                            sc.close();
                            return; // Terminar el programa
                        } else {
                            System.out.println("Por favor, ingrese una opción válida (1, 2 o 3).");
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Por favor, ingrese una opción válida (1, 2 o 3).");
                    }
                }
                continue; // Volver al inicio del bucle principal
            } catch (NumberFormatException nfe) {
                System.out.println("Por favor ingrese una opción válida.");
            }

            System.out.println(
                    "Tu nave está lista para recoger, estas son sus características\n "
                            + nave.getPropulsion().getNombre() + " paga en la caja la cantidad de $"
                            + nave.getPrecio());
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Para ordenar otra nave");
            System.out.println("2. Para Salir ");

            while (true) {
                try {
                    int opcion = Integer.parseInt(sc.nextLine());
                    if (opcion == 2) {
                        System.out.println("Saliendo del programa...");
                        sc.close();
                        return; // Terminar el programa
                    } else if (opcion == 1) {
                        break; // Volver al inicio del bucle principal
                    } else {
                        System.out.println("Por favor, ingrese una opción válida (1 o 2).");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Por favor, ingrese una opción válida (1 o 2).");
                }
            }
        }
    }

    public static NaveEspacial mostrarCatalogo(int presupuesto) {

        int opcion = 0;
        boolean entradaValida = false;
        Scanner scanner = new Scanner(System.in);
        NaveBuilder nv = null;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese el número de la opción deseada: ");
                System.out.println("Mostrando nuestro catálogo. Elige la opción que más te ajuste:");
                System.out.println("1. Nave Individual de Combate. Costo: $19,200");
                System.out.println("2. Nave Militar de Transporte. Costo: $32,500");
                System.out.println("3. Nave Base Espacial de Guerra. Costo: $90,000");

                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion >= 1 && opcion <= 4) {
                    entradaValida = true;
                } else {
                    System.out.println("Por favor, ingrese un número válido entre 1 y 4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingrese un número válido.");
            }
        }

        switch (opcion) {
            case 1:
                // Opción 1: Nave Individual de Combate
                nv = new NaveIndividualCombateBuilder();
                nv.buildNaveEspacial();
                break;
            case 2:
                // Opción 2: Nave Militar de Transporte
                nv = new NaveMilitarDeTransporte();
                nv.buildNaveEspacial();
                break;
            case 3:
                // Opción 3: Nave Base Espacial de Guerra
                nv = new NaveBaseEspacialDeGuerra();
                nv.buildNaveEspacial();
                break;
        }
        if (presupuesto >= nv.getPrecio()) {
            return nv.getNaveEspacial();
        } else {
            System.out.println("Presupusto invalido, no se va a construir la nave  \n Regresando al Menu Principal");
            System.out.println("********************************");
            return null;
        }
    }

    public static void construirSistemaDePropulsion(NaveGenericaBuilder builder, int presupuesto) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("\n***** SISTEMA DE PROPULSION *****");
        System.out.println("¿Qué tipo de propulsion quieres utilizar?");
        System.out.println("1. Viaje Intercontinental");
        System.out.println("2. Viaje Interplanetario");
        System.out.println("3. Viaje Intergaláctico");

        do {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        builder.buildPropulsion(new ViajeIntercontinental(), presupuesto);
                        break;
                    case 2:
                        builder.buildPropulsion(new ViajeInterplanetario(), presupuesto);
                        break;
                    case 3:
                        builder.buildPropulsion(new ViajeIntergalactico(), presupuesto);
                        break;
                    default:
                        System.out.println("\nPor favor ingrese una opción válida.");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\nPor favor ingrese una opción válida.");
                opcion = 0; // Reiniciar la opción si ocurre un error de formato
            }
        } while (opcion < 1 || opcion > 3);
    }

    public static void construirBlindaje(NaveGenericaBuilder builder, int presupuesto) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n***** BLINDAJE *****");
            System.out.println("¿Qué tipo de blindaje quieres utilizar?");
            System.out.println("1. Blindaje Simple");
            System.out.println("2. Blindaje Reforzado");
            System.out.println("3. Blindaje Fortaleza");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        builder.buildBlindaje(new BlindajeSimple(), presupuesto);
                        break;
                    case 2:
                        builder.buildBlindaje(new BlindajeReforzado(), presupuesto);
                        break;
                    case 3:
                        builder.buildBlindaje(new BlindajeFortaleza(), presupuesto);
                        break;
                    default:
                        System.out.println("\nPor favor ingrese una opción válida.");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\nPor favor ingrese una opción válida.");
                opcion = 0; // Reiniciar la opción si ocurre un error de formato
            }
        } while (opcion < 1 || opcion > 3);
    }

    public static void construirCabina(NaveGenericaBuilder builder, int presupuesto) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("\n***** CABINA *****");
        System.out.println("¿Qué tipo de cabina quieres utilizar?");
        System.out.println("1. Cabina para 1 piloto");
        System.out.println("2. Cabina para tripulación pequeña");
        System.out.println("3. Cabina para ejército");

        do {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        builder.buildCabina(new Cabina1Piloto(), presupuesto);
                        break;
                    case 2:
                        builder.buildCabina(new CabinaTripulacionPequena(), presupuesto);
                        break;
                    case 3:
                        builder.buildCabina(new CabinaEjercito(), presupuesto);
                        break;
                    default:
                        System.out.println("\nPor favor ingrese una opción válida.");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\nPor favor ingrese una opción válida.");
                opcion = 0; // Reiniciar la opción si ocurre un error de formato
            }
        } while (opcion < 1 || opcion > 3);
    }

    public static void construirArmas(NaveGenericaBuilder builder, int presupuesto) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("\n***** ARMAS *****");
        System.out.println("¿Qué tipo de arma quieres utilizar?");
        System.out.println("1. Láser simple");
        System.out.println("2. Misiles de plasma");
        System.out.println("3. Láser destructor de planetas");

        do {
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                switch (opcion) {
                    case 1:
                        builder.buildArmas(new LaserSimple(), presupuesto);
                        break;
                    case 2:
                        builder.buildArmas(new MisilesPlasma(), presupuesto);
                        break;
                    case 3:
                        builder.buildArmas(new LaserDestructorPlanetas(), presupuesto);
                        break;
                    default:
                        System.out.println("\nPor favor ingrese una opción válida.");
                        break;
                }
            } catch (NumberFormatException nfe) {
                System.out.println("\nPor favor ingrese una opción válida.");
                opcion = 0; // Reiniciar la opción si ocurre un error de formato
            }
        } while (opcion < 1 || opcion > 3);
    }

}
