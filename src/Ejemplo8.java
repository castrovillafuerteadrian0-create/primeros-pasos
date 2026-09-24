import java.util.Scanner;

public class Ejemplo8 {
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        edad = input.nextInt();
        if (edad>=18) {
            System.out.println("Mayor de edad");
        }
        else {
            System.out.println("Menor de edad");
        }
        input.close();
    }
}
