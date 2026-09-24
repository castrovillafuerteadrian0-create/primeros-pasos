import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejmeplo3 {
    public static void main(String[] args) {
        float lado;
        Scanner inputValue = new Scanner(System.in);

        System.out.println("Introduce valor del lado: ");
        lado = inputValue.nextFloat();

        inputValue.close();
    }
}
