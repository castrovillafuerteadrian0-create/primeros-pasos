import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Agrega el valor de los 2 numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 > 0 && num2 > 0){
            System.out.println("Ambos numeros son positivos");
        } else if (num1 > 0 || num2 > 0) {
            System.out.println("Un numero es positivo");
        }else {
            System.out.println("Ningun numero es positivo");
        }
    }
}
