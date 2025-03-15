import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("Prueba 1:");
        System.out.print("Ingrese una esquina del 1er rectángulo: ");
        Coordenada c1 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Ingrese la esquina opuesta del 1er rectángulo: ");
        Coordenada c2 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
        Rectangulo r1 = new Rectangulo(c1, c2);

        System.out.print("Ingrese una esquina del 2do rectángulo: ");
        Coordenada c3 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());

        System.out.println("Ingreso de coordenadas\n");

        System.out.print("Ingrese la esquina opuesta del 2do rectángulo: ");
        Coordenada c4 = new Coordenada(scanner.nextDouble(), scanner.nextDouble());
        Rectangulo r2 = new Rectangulo(c3, c4);

        System.out.println("\nRectángulo A = " + r1);
        System.out.println("Rectángulo B = " + r2);

        if (Verificador.seSobreponen(r1, r2)) {
            System.out.println("Rectángulos A y B se sobreponen.");
            System.out.printf("Área de superposición = %.2f\n", r1.calcularAreaSuperposicion(r2));
        } else if (Verificador.estanJuntos(r1, r2)) {
            System.out.println("Rectángulos A y B se juntan.");
        } else {
            System.out.println("Rectángulos A y B son disjuntos.");
        }

        scanner.close();
    }
}