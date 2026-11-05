import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa la operacion (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);
        System.out.print("Ingresa el segundo numero: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean operacionValida = true;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error No se puede dividir entre cero");
                    operacionValida = false;
                }
                break;
            default:
                System.out.println("Operacion no valida");
                operacionValida = false;
        }

        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}
