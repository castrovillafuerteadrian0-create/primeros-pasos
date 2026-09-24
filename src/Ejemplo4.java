import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        float lado;
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el valor del lado: ");
        lado = input.nextFloat();
        System.out.println("El area del cuadrado es:" + lado*lado);
        input.close();

    }
}
