import java.util.Scanner;

public class SumaPrimerosN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un numero entero:");
        int n = scanner.nextInt();
        int suma = 0;
        int i = 1;
        if (n > 0) {
            do {
                suma += i;
                i++;
            } while (i <= n);

            System.out.println("La suma de 1 a " + n + " es: " + suma);
        } else {
            System.out.println("Error ingresa un numero mayor a 0");
        }

        scanner.close();
    }
}
