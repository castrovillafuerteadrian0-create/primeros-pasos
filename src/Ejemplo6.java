import java.math.MathContext;
import java.util.Scanner;

public class Ejemplo6 {
    public static void main(String[] args) {
        float radio;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el valor del radio: ");
        radio = input.nextFloat();
        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        System.out.println("El perimetro del circulo es:" + perimetro);
        System.out.println("El area del circulo es: " + area);
        input.close();
    }
}
