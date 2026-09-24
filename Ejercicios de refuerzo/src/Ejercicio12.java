import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor de los numeros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if (num1 % 2 == 0 && num2 % 2 ==0){
            System.out.println("Ambos numeros son pares");
        } else if (num1 % 2 == 0 || num2 % 2 == 0) {
            System.out.println("Hay al menos un numero par");
        }else{
            System.out.println("Ninguno de los numeros es par");
        }
    }
}
