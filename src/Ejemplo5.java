import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor del primer numero: ");
        num1 = input.nextInt();
        System.out.println("Introduce el valor del segundo numero: ");
        num2 = input.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        System.out.println("El resultado de las operaciones son los siguientes: \nSuma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multi + "\nDivisión: " + div);
        input.close();
    }
}
