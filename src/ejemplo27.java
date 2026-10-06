import java.util.Scanner;

public class ejemplo27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        String resultado = "";
        System.out.println("Introduce el valor del numero: ");
        numero = input.nextInt();
        for (int i=1; i<=numero;i++){
            resultado = resultado + " " + i;
            System.out.println(resultado);
        }
    }
}
