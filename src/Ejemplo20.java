import java.util.Scanner;

public class Ejemplo20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float precio;
        System.out.println("Cuanto ha valido la compra? ");
        precio = input.nextFloat();
        if (precio>6 && precio<60){
            double descuento = precio*0.05;
            double total = precio-descuento;
            System.out.println("El precio final es " + total);
        } else if (precio>60) {
            double descuento = precio*0.1;
            double total = precio-descuento;
            System.out.println("El precio final es " + total);
        }else {
            System.out.println("El precio final es " + precio);
        }
        input.close();
    }
}
