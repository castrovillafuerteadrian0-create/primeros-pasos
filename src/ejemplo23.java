import java.util.Scanner;

public class ejemplo23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int positivos = 0;
        System.out.println("Introduce el valor de los numeros (0 para finalizar):" );
        do {
            num = input.nextInt();
            if (num>0){
                positivos++;
            }
        }while (num != 0);
        System.out.println("Hay " + positivos + " numeros positivos");
        input.close();
    }
}
