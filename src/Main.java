import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int cantidad = 0;
        int aprobados = 0;
        int reprobados = 0;
        double suma = 0;
        double nota= 0;
        double notaMayor = 0;
        double notaMenor = 0;
        double promedio = 0;

        double[] notas;

        System.out.println("--- REGISTRO DE NOTAS  ---");
        System.out.println("¿Cuántos estudiantes son?");
        cantidad = leer.nextInt();


        notas = new double[cantidad];


        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + " (de 0 a 5):");
            nota = leer.nextDouble();


            while (nota< 0 || nota > 5) {
                System.out.println("Nota inválida. Ingrese una nota entre 0 y 5:");
                nota = leer.nextDouble();
            }
            notas[i] = nota;
            suma = suma + notas[i];
        }

        notaMayor = notas[0];
        notaMenor = notas[0];

        System.out.println("\n--- RESULTADOS ---");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + notas[i]);


            if (notas[i] > notaMayor) {
                notaMayor = notas[i];
            }
            if (notas[i] < notaMenor) {
                notaMenor = notas[i];
            }
            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        promedio = suma / cantidad;

        System.out.println("El promedio del grupo es: " + promedio);
        System.out.println("La nota más alta fue: " + notaMayor);
        System.out.println("La nota más baja fue: " + notaMenor);
        System.out.println("Total aprobados: " + aprobados);
        System.out.println("Total reprobados: " + reprobados);
    }
}