import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor del primer numero: ");
        num1 = input.nextInt();
        System.out.println("Añade el valor del segundo numero: ");
        num2 = input.nextInt();
        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Ambos numero son pares");
        }
    }
}
