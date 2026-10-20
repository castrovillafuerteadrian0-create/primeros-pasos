import java.util.Scanner;

public class ejemplo24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num;
        double total=0;
        double notas = 0;
        double diez = 0;
        System.out.println("Agrega las notas (-1 para finalizar): ");
        do {
            num = input.nextDouble();
            if (num!=-1){
                total = num + total;
                notas++;
                if (num == 10){
                    diez++;
                    System.out.println("Tiene un 10");
                }
            }
        }while(num != -1);
        System.out.println("La nota media de las " + notas + " notas es " + (total/notas) + " y hay " + diez + " 10");
        input.close();
    }
}
