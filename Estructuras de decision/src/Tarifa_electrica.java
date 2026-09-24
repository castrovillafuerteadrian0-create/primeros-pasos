import java.util.Scanner;

public class Tarifa_electrica {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kwh;
        double precio;
        System.out.println("De cuanto ha sido el consumo de kwh este mes? ");
        kwh = input.nextDouble();
        if (kwh<=100){
            precio= kwh*0.10;
        } else if (kwh<=300) {
            precio = (100*0.10)+((kwh-100)*0.15);
        }else {
            precio= (100*0.10)+(200*0.15)+((kwh-300)*0.20);
        }
        System.out.println("El precio mensual sera de: "+ precio);
        input.close();
    }
}
