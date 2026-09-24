import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double nota;
        String trabajos;
        System.out.println("Cual es la nota del alumno: ");
        nota = input.nextDouble();
        System.out.println("Ha entregado todos los trabajos? ");
        trabajos = input.next();
        if (nota<5){
            System.out.println("Suspenso");
        } else if (nota>=5 && trabajos.equals("no") || nota>=5 && trabajos.equals("No") ) {
            System.out.println("Supenso por practicas pendientes");
        } else if (nota>=5 && nota<7) {
            System.out.println("Aprobado");
        } else if (nota>=7 && nota<9) {
            System.out.println("Notable");
        }else {
            System.out.println("Sobresaliente");
        }
    }
}
