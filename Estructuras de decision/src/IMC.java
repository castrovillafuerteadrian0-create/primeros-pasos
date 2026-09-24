import java.sql.SQLOutput;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        float peso;
        float altura;
        float IMC;
        Scanner input= new Scanner(System.in);
        System.out.println("Introduce tu peso: ");
        peso = input.nextFloat();
        System.out.println("Introduce tu altura: ");
        altura = input.nextFloat();
        IMC = peso/(altura*altura);
        if (IMC<18.5){
            System.out.println("Bajo peso");
        } else if (IMC<=24.9) {
            System.out.println("Normal");
        } else if (IMC<=29.9) {
            System.out.println("Sobrepreso");
        }else {
            System.out.println("Obesidad");
        }
        input.close();
    }
}
