import java.util.Scanner;

public class CineU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print(" Dia (1 = lunes, 2 = martes, 3 = miercoles. 4 = jueves, 5 = viernes, 6 = sabado, 7 = domingo): ");

        int dia = sc.nextInt();
        int precio = 14000;

        if (dia == 3) {
            precio = 8000;
        }

        if (edad < 12 || edad >= 60) {
            precio = 9000;
        }

        System.out.print("Pagas: $" + precio);
    }
}
