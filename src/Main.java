import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //declaracion de objeto Scanner para capturar datos
        Scanner scanner = new Scanner(System.in);
        //inicialiacion de objeto Calculadora
        Calculadora calculadora = new Calculadora();

        System.out.println("Bienvenido a la calculadora");
        //variable de control continuar para bucle while
        boolean continuar = true;
        //estructura de control para iniciar las peticiones
        while (continuar) {
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            //captura de la operacion selecciona por el usuario
            int opcion = scanner.nextInt();

            try {
                switch (opcion) {
                    //codigo para caturar dos valores apartir de un metodo leerNumero()
                    case 1:
                        Numero a = leerNumero(scanner, "Ingrese el primer número: ");
                        Numero b = leerNumero(scanner, "Ingrese el segundo número: ");
                        System.out.println("Resultado: " + calculadora.suma(a, b));
                        break;
                    case 2:
                        a = leerNumero(scanner, "Ingrese el primer número: ");
                        b = leerNumero(scanner, "Ingrese el segundo número: ");
                        System.out.println("Resultado: " + calculadora.resta(a, b));
                        break;
                    case 3:
                        a = leerNumero(scanner, "Ingrese el primer número: ");
                        b = leerNumero(scanner, "Ingrese el segundo número: ");
                        System.out.println("Resultado: " + calculadora.multiplicacion(a, b));
                        break;
                    case 4:
                        a = leerNumero(scanner, "Ingrese el primer número: ");
                        b = leerNumero(scanner, "Ingrese el segundo número: ");
                        System.out.println("Resultado: " + calculadora.division(a, b));
                        break;
                    case 5:
                        a = leerNumero(scanner, "Ingrese la base: ");
                        b = leerNumero(scanner, "Ingrese el exponente: ");
                        System.out.println("Resultado: " + calculadora.potencia(a, b));
                        break;
                    case 6:
                        a = leerNumero(scanner, "Ingrese el número: ");
                        System.out.println("Resultado: " + calculadora.raizCuadrada(a));
                        break;
                    case 7:
                        continuar = false;
                        System.out.println("Gracias por usar la calculadora. Fin del programa!");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente nuevamente.");
                }
                //control de excepciones
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        //cierra el scanner
        scanner.close();
    }
    //metodo para catpurar valor tipo Numero
    private static Numero leerNumero(Scanner scanner, String mensaje) {
        System.out.print(mensaje);
        double valor = scanner.nextDouble();
        return new Numero(valor);
    }
}
