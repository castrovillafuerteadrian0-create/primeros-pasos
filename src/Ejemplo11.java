
import java.util.Scanner;

public class Ejemplo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el valor del primer numero: ");
        num1 = input.nextInt();
        System.out.println("Introduce el valor del segundo numero: ");
        num2 = input.nextInt();
        if (num1>num2){
            System.out.println("El orden es: " + num1 + ">" +  num2);
        } else {
            System.out.println("El orden es: " + num2 + ">" +  num1);
        }
    }
}
