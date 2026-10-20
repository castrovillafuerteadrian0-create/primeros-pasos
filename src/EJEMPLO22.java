import java.sql.SQLOutput;
import java.util.Scanner;

public class EJEMPLO22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador;
        int num;
        int positivos=0;
        System.out.println("Introduce 10 numeros: ");
        for (contador=0;contador<10;contador++){
            num = input.nextInt();
            if (num>0){
                positivos = positivos+1;
            }
        }
        System.out.println("Hay " + positivos + " numeros positivos");
        input.close();
    }
}
