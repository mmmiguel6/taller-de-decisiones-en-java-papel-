import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor de la compra: ");
        double compra = sc.nextDouble();
        double porcentaje;

        if (compra >= 500000) {
            porcentaje = 0.20;
        } else if (compra >= 200000){
            porcentaje = 0.10;
        } else if (compra >= 100000) {
            porcentaje = 0.05;
        } else {
            porcentaje = 0;
        }

        int descuento = (int) (compra * porcentaje);

        int aPagar = (int) (compra - descuento);

        System.out.print("Descuento: " + descuento + " - Pagar: " + aPagar);


        }


}
