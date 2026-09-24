import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Añadele valor al numero: ");
        num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        input.close();
    }
}
