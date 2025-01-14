import java.util.Scanner;

public class Ejer4 {

    static int numMax = 10;
    static int numInt = 5;

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opciones;

        do {
            System.out.println("Elige una opción:");
            System.out.println("1.- Configurar");
            System.out.println("2.- Jugar");
            System.out.println("3.- Salir");

            opciones = leer.nextInt();

            switch (opciones) {
                case 1:
                    configurar(); // Llama al método configurar
                    break;
                case 2:
                    jugar(); // Llama al método jugar
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ups... Parece que la opción no es válida, tienes que empezar de nuevo.");
            }
        } while (true);
    }

    // Opcion uno
    public static void configurar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Configurar el juego:");
        System.out.print("Introduce el número máximo (numMax): ");
        numMax = leer.nextInt(); // Actualiza la variable global
        System.out.print("Introduce el número de intentos permitidos (numInt): ");
        numInt = leer.nextInt(); // Actualiza la variable global
        System.out.println("¡Configuración completada!");
    }


    public static void jugar() {

        int numOculto = (int) Math.floor(Math.random() * (numMax + 1));
        Scanner leer = new Scanner(System.in);
        int intentosRestantes = numInt;

        System.out.println("¿Cuál es el número entre 0 y " + numMax + "?");
        System.out.println("Tienes " + numInt + " intentos.");

        while (intentosRestantes > 0) {

            System.out.println("Introduzca un número: ");
            int numeroIntroducido = leer.nextInt();

            if (numeroIntroducido == numOculto) {
                System.out.println("Oleeee!! ¡Has ganado! Has necesitado " + (numInt - intentosRestantes + 1)+ " intentos.");
                return;
            } else if (numeroIntroducido < numOculto) {
                System.out.println("El número oculto es mayor");
            } else {
                System.out.println("El número oculto es menor");
            }

            intentosRestantes --; // cada vez q pase el bucle se resta una vuelta.
        }

        System.out.println("¡Perdiste! El número oculto era: " + numOculto); // tiene que ir fuera del bucle, porque sino se me sale antes de las 5 vueltas
    }
}
