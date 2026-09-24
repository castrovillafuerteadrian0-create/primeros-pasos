import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int num1;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor del numero: ");
        num1 = input.nextInt();
        if (num1 % 2 == 0 && num1 % 3 == 0){
            System.out.println("El numero es multiplo de 2 y de 3");
        }else {
            System.out.println("El numero no es multiplo ni de 2 ni de 3");
        }
        input.close();
    }
}
