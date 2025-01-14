import java.util.Scanner;

public class Ejerc2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        for (int i= 0; i < 5; i++) {
            System.out.print("Ingrese un número entero: ");
            int numericos = scanner.nextInt();

            if (numericos < 0) {
                System.out.println("El número introducido es negativo");
            } else {
                if (esPrimo(numericos)){
                   System.out.println("El número introducido es primo");
                }
                else {
                    System.out.println("El número introducido no es primo");
                }
            }


        }
    }
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Si el número es divisible por cualquier número entre 2 y la raíz cuadrada de num, no es primo
            }
        }

        return true; // Si no se encuentra ningún divisor, el número es primo
    }

}

