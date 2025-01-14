import java.util.Scanner;

public class Ejerc5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int dividendo, divisor;

        do {
            System.out.println("Ingrese el dividendo:");
            dividendo = scanner.nextInt();

            System.out.println("Ingrese el divisor:");
            divisor = scanner.nextInt();

            if (dividendo == -1 && divisor == -1) {
                System.out.println("No es posible dividir entre -1");
                break;
            }
        // utilizo el bloque de try/catch porque así puedo poner el "ArithmeticException"
        // este bloque lo que hará es pillar cualquier error o buscar la excepción q quiera.
        try {
            if (divisor == 0) {
                throw new ArithmeticException("no se puede dividir entre cero.");
            }
            int resultado = dividendo / divisor;

            System.out.println("El resultado es " + resultado);

        } catch (ArithmeticException e){
            System.out.println("Error, " + e.getMessage());
        }
        } while (true);

        scanner.close();
    }
}
