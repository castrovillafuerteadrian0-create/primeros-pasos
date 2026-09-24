import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el valor del primer numero: ");
        num1 = input.nextInt();
        if (num1 == 0){
            System.out.println("El producto de 0 por cualquiero numero es 0");
        }else {
            System.out.println("Añade el valor del segundo numero: ");
            num2 = input.nextInt();
            System.out.println("El producto de ambos numeros es " + (num1*num2));
        }
        input.close();
    }
}
