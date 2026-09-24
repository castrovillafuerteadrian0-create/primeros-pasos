import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.println("Introduce el tamaño de cada lado: ");
        lado1 = input.nextDouble();
        lado2 = input.nextDouble();
        lado3 = input.nextDouble();
        if (((lado1+lado2)>lado3 && ((lado2+lado3)>lado1) && ((lado1+lado3)>lado2))){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("El triangulo es equilatero");
            } else if ((lado3 != lado1 && lado1 == lado2) || (lado1 != lado2 && lado2 == lado3) || (lado2 != lado1 && lado1 == lado3)) {
                System.out.println("El triangulo es iscoseles");
            }else {
                System.out.println("El triangulo es escaleno");
            }
        } else {
            System.out.println("No es un triangulo");
        }

    }
}
