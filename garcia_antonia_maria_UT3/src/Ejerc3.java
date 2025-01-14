import java.util.Scanner;

public class Ejerc3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("El MCM de " + numero1 + " y " + numero2 + " es: " + mcm(numero1, numero2));
    }

    public static int mcm(int numero1, int numero2) {
        int max = Math.max(numero1, numero2);
        while (true) {
            if (max % numero1 == 0 && max % numero2 == 0){
                return max;
            }
            max++;
        }
    }
}
