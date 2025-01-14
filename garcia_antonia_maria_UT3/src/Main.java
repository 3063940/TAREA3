import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduzca un número ");

        int numeroMultiplicar = scanner.nextInt();

        if (numeroMultiplicar >=30) {
            System.out.println("El número ha de ser menor que 30");
            scanner.close();
            return;
        }

        System.out.println("TABLA DE MULTIPLICAR CON EL BUCLE FOR");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numeroMultiplicar + " x " + i + " = " + (numeroMultiplicar * i));
        }

        System.out.println("TABLA DE MULTIPLICAR CON EL BUCLE WHILE");
        int contador = 1; // si no declaramos la variable antes del while me da error.
        while (contador <= 10) {
            System.out.println(numeroMultiplicar + " x " + contador + " = " + (numeroMultiplicar * contador));
            contador++;
        }

        System.out.println("TABLA DE MULTIPLICAR CON EL BUCLE DO - WHILE");
        contador = 1;
        do {
            System.out.println(numeroMultiplicar + " x " + contador + " = " + (numeroMultiplicar * contador));
            contador++;
        }
        while (contador <=10);
    }

}