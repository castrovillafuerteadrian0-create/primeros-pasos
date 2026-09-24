import java.util.Scanner;

public class Ejemplo16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        String operacion;
        System.out.println("Introduce valor del primer numero: ");
        num1 = input.nextInt();
        System.out.println("Introduce el valor del segundo numero: ");
        num2 = input.nextInt();
        System.out.println("Que operacion quieres hacer? (+, -, *, /)");
        operacion = input.next();
        switch (operacion) {
            case "+":
                System.out.println("La suma de los dos numeros es:" + (num1+num2));
                break;
            case "-":
                System.out.println("La resto de los dos numeros es: " + (num1-num2));
                break;
            case "*":
                System.out.println("La multiplicacion de los dos numeros es: " + (num1*num2));
                break;
            case "/":
                System.out.println("La division de los dos numeroa es: " + (num1/num2));
                break;
        }
        input.close();
    }
}
