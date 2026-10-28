import java.util.Scanner;

public class LavaYa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("horas de uso: ");
        int horas = sc.nextInt();
        int tarifa;

        if (horas <= 2) {
            tarifa = 3000;
        } else {
            tarifa = 2500;
        }

        System.out.println("Total $ " + tarifa);
        int total = horas * tarifa;

        if (total >= 12000) {
            System.out.println("¡Detergente gratis!");
        }
    }
}