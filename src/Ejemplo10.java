import java.util.Scanner;

public class Ejemplo10 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor del numero: ");
        num = input.nextInt();
        if (num>=0){
            System.out.println("El numero es positivo");
        }
        else {
            System.out.println("El numero es negativo");
        }
        input.close();
    }
}
