import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor del primero numero: ");
        num1 = input.nextInt();
        System.out.println("Añade el valor del segundo numero: ");
        num2 = input.nextInt();
        if (num1 % num2 == 0){
            System.out.println("Los numeros son multiplos");
        }else {
            System.out.println("Los numeros no son multiplos");
        }
        input.close();
    }
}
