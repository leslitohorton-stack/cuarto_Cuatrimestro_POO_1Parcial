import java.util.Scanner;

class MenuDeConversiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Conversiones: ");
        System.out.println("Selecciona una opcion (1-3): ");
        System.out.println("1 Convertir Celsius a Fahrenheit");
        System.out.println("2 Convertir km/h a m/s");
        System.out.println("3 Convertir pesos a dolares");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingresa grados Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + "°C equivalen a " + fahrenheit + "°F");
                break;

            case 2:
                System.out.print("Ingresa una velocidad en km/h: ");
                double kmh = scanner.nextDouble();
                double ms = kmh / 3.6;
                System.out.println(kmh + "km/h equivalen a " + ms + "m/s");
                break;

            case 3:
                System.out.print("Ingresa una cantidad en pesos: ");
                double pesos = scanner.nextDouble();
                System.out.print("Ingresa el tipo de cambio actual (ej. 20.0): ");
                double tipoCambio = scanner.nextDouble();

                if (tipoCambio > 0) {
                    double dolares = pesos / tipoCambio;
                    System.out.printf("$%.2f pesos equivalen a $%.2f dolares\n", pesos, dolares);
                } else {
                    System.out.println("Tipo de cambio invalido");
                }
                break;

            default:
                System.out.println("Opcion no valida selecciona entre 1 y 3");
        }

        scanner.close();
    }
}
