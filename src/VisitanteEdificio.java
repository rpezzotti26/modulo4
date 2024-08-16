import java.util.Scanner;

public class VisitanteEdificio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Información del visitante
        System.out.print("Ingrese el nombre del visitante: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del visitante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese la cantidad de visitas realizadas en la semana: ");
        int numVisitas = scanner.nextInt();

        // Variables para calcular el tiempo total de estadía
        float tiempoTotal = 0;

        // Registrar la información de cada visita
        for (int i = 1; i <= numVisitas; i++) {
            System.out.print("Ingrese el tiempo de estadía en minutos de la visita " + i + ": ");
            float tiempoEstadia = scanner.nextFloat();
            tiempoTotal += tiempoEstadia;
        }

        // Calcular el tiempo promedio de estadía
        float tiempoPromedio = tiempoTotal / numVisitas;

        // Determinar si es mayor o menor de edad
        boolean esMayorDeEdad = edad >= 18;

        // Mostrar resultados
        System.out.println("\nResumen de las visitas:");
        System.out.println("Nombre del visitante: " + nombre);
        System.out.println("Edad del visitante: " + edad + " años (" + (esMayorDeEdad ? "Mayor de edad" : "Menor de edad") + ")");
        System.out.println("Cantidad total de visitas: " + numVisitas);
        System.out.println("Tiempo total de estadía: " + tiempoTotal + " minutos");
        System.out.println("Tiempo promedio de estadía: " + tiempoPromedio + " minutos");

        // Cerrar el escáner
        scanner.close();
    }
}
