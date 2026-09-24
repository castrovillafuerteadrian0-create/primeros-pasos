import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Añadele valor al numero: ");
        num = input.nextInt();
        System.out.println("El doble del numero es: " + (num*2));
        System.out.println("El triple del numero es: "+ (num*3));
        input.close();
    }
}
