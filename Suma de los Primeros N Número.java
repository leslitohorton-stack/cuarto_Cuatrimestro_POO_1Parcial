import java.util.Scanner;

public class ContadorPositivosNegativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;

        System.out.println("Ingresa numeros enteros (0 para terminar):");
        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero > 0) {
                positivos++;
            } else {
                negativos++;
            }
            numero = scanner.nextInt();
        }

        System.out.println("\n Resultado:");
        System.out.println("Total de numeros positivos: " + positivos);
        System.out.println("Total de numeros negativos: " + negativos);

        scanner.close();
    }
}
