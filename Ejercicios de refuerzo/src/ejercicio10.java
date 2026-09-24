import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor del numero: ");
        num = input.nextInt();
        if (num % 2 != 0 && num % 3 != 0){
            System.out.println("El numero no es multiplo ni de 2 ni de 3");
        }
        input.close();
    }
}
