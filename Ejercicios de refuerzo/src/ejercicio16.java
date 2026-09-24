import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor de los 3 numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println(num1 + " Es el numero mas grande de los tres");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " Es el numero mas grande de los tres");
        }else {
            System.out.println(num3 + " Es el numero mas grande de los tres");
        }
        input.close();
    }
}
