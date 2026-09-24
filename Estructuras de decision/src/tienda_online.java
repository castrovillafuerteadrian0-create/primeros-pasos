import java.util.Scanner;

public class tienda_online {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double importe;

        System.out.println("Ingresa el importe: ");
        importe = input.nextDouble();
        System.out.println("Eres socio? (Si/No): ");
        String socio = input.next();
        if (socio.equals("Si") || socio.equals("si")){
            if (importe>50 && importe<100){
                importe = importe - (importe*0.10);
            }else if (importe>=100){
                importe = importe - (importe*0.15);
            }
        }else {
            if (importe>50){
                importe = importe - (importe*0.05);
            }
        }
        System.out.println("El precio final sera: " + importe);
        input.close();
    }
}
