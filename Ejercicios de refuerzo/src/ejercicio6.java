import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor del primer numero: ");
        num1 = input.nextInt();
        System.out.println("Añade el valor del segundo numero: ");
        num2 = input.nextInt();
        if (num2 == 0){
            System.out.println("No se puede dividir entre 0");
        }else {
            System.out.println("El resultado de la division es " + (num1/num2));
        }
        input.close();
    }
}
