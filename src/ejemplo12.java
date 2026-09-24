import java.util.Scanner;

public class ejemplo12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Introduce el valor del primer numero: ");
        num1 = input.nextInt();
        System.out.println("Introduce el valor del segundo numero: ");
        num2 = input.nextInt();
        if (num1>num2){
            System.out.println("El numero mas grande es: " + num1);
        } else {
            System.out.println("El numero mas grande es: " + num2);
        }
    }
}
