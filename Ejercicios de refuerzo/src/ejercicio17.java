import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor de los dos numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 == num2){
            System.out.println("Ambos numeros son iguales");
        } else if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        }else {
            System.out.println(num2 + " es mayor que " + num1);
        }
        input.close();
    }
}
