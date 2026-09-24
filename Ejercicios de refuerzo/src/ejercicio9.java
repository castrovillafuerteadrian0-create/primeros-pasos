import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor del numero: ");
        num1 = input.nextInt();
        if (num1 % 2 == 0 && num1 % 3 != 0){
            System.out.println("El numero es multiplo de 2 pero no de 3");
        }
        input.close();
    }
}
