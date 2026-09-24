import org.w3c.dom.html.HTMLObjectElement;

import java.util.Scanner;

public class Ejemplo18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int segundos;
        int minutos;
        int horas;
        System.out.println("Introduce horas: ");
        horas = input.nextInt();
        System.out.println("Introduce minutos: ");
        minutos = input.nextInt();
        System.out.println("Introduce segundos: ");
        segundos = input.nextInt();
        System.out.println(horas + "Horas" + minutos + "Minutos" + segundos + "Segundos");
        segundos = segundos+1;
        if (segundos==60){
            segundos = 0;
            minutos = minutos + 1;
        }
        if (minutos== 60) {
            minutos = 0;
            horas = horas + 1;
        }
        System.out.println(horas + " Horas " + minutos + " Minutos " + segundos + " Segundos");
    }
}
