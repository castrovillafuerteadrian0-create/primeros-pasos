import java.util.Scanner;

public class ejemplo31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        System.out.println("Agrega el valor del numero: ");
        numero = input.nextInt();
        for (int i=1; i<=numero;i++){
            if (numero % i == 0){
                System.out.println(i + " es divisor de " + numero);
            }
        }
    }
}
