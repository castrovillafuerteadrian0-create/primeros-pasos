import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade valor al numero: ");
        num1 = input.nextInt();
        if (num1 % 10 == 0){
            System.out.println("El numero es multiplo de 10");
            System.out.println("Añade valor a otro numero: ");
            num2 = input.nextInt();
            if (num2 % 10 == 0){
                System.out.println("Tambien es multiplo de 10");
            }else {
                System.out.println("No es multiplo de 10");
            }
        }else{
            System.out.println("El numero no es multiplo de 10");
        }
        input.close();
    }
}
