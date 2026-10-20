import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int metros;
        int velocidad;
        int segundos;
        int media;
        System.out.println("Dile los metros recorridos, velocidad permitida (en km) y el tiempo (en segundos): ");
        metros= input.nextInt();
        velocidad= input.nextInt();
        segundos= input.nextInt();
        int horas = segundos/3600;
        media = metros / (velocidad*1000);
        if (horas <= media){
            System.out.println(metros + velocidad + segundos + "ok");
        } else if (horas >= (media*1.20)) {
            System.out.println(metros + velocidad + segundos + "multa");
        } else if (horas > (media*1.21)) {
            System.out.println(metros + velocidad + segundos + "puntos");
        }
    }
}
