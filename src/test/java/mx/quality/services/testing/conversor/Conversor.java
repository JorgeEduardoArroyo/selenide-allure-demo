package mx.quality.services.testing.conversor;

import java.util.Scanner;

public class Conversor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            System.out.println("\n🌡️ Conversor de Temperaturas");
            System.out.println("1. Convertir de Centígrados a Fahrenheit");
            System.out.println("2. Convertir de Fahrenheit a Centígrados");
            System.out.println("3. Salir");
            System.out.print("\n¿Qué opción requieres? ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Opción inválida. Intenta de nuevo.");
                continue;
            }

            if (opcion == 3) {
                System.out.println("👋 Saliendo...");
                break;
            }

            System.out.print("Ingresa la temperatura: ");
            double temp = Double.parseDouble(scanner.nextLine());

            double resultado = 0;

            switch (opcion) {
                case 1:
                    CentigradosAFahrenheit c2f = new CentigradosAFahrenheit();
                    resultado = c2f.convertir(temp);
                    System.out.println(temp + " °C = " + resultado + " °F");
                    break;
                case 2:
                    FahrenheitACentigrados f2c = new FahrenheitACentigrados();
                    resultado = f2c.convertir(temp);
                    System.out.println(temp + " °F = " + resultado + " °C");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intenta de nuevo.");
                    break;
            }
        }

        scanner.close();
    }
}
