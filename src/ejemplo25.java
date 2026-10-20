import java.util.Scanner;

public class ejemplo25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        long suma = 1;
        int cont = 1;
        System.out.println("Cual factorial quieres sumar?: ");
        num = input.nextInt();
        for (int i = 1;i<=num;i++){
            suma = suma * cont;
            cont++;
        }
        System.out.println("La suma de la factorial de " + num + " es " + suma);
    }
}
