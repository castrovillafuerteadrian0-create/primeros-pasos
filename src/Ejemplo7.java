import java.util.Scanner;

public class Ejemplo7 {
    public static void main(String[] args) {
        float precio;
        float rebajado;
        Scanner input = new Scanner(System.in);
        System.out.println("INtroduce el precio del producot: ");
        precio = input.nextFloat();
        System.out.println("Introduce el precio del producto rebajado: ");
        rebajado = input.nextFloat();
        float descuento = (precio-rebajado)/precio * 100;
        System.out.println("El descuento del producto es el siguiente: " + descuento + "%");
        input.close();
    }
}
