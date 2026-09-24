import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        int tiempo;
        int segundos;
        int minutos;
        int horas;
        Scanner input = new Scanner(System.in);
        System.out.println("Añade el tiempo total en segundos: ");
        tiempo = input.nextInt();
        minutos = tiempo / 60;
        horas = tiempo / 3600;
        segundos = tiempo % 60;
        System.out.println(tiempo + " segundos equivalen a " + horas + " horas, " + minutos + " minutos y " + segundos + " segundos");
        input.close();
    }
}
