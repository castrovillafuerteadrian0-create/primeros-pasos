import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        int saldo;
        int mod;
        System.out.println("Agrega un saldo inicial: ");
        saldo = input.nextInt();
        System.out.println("Saldo inicial: " + saldo + " €");
        do {
            System.out.println("1.Ingresar 2.Retirar 0.Salir");
            opcion = input.nextInt();
            if (opcion == 1) {
                System.out.println("Que cantidad quiere ingresar: ");
                mod = input.nextInt();
                saldo = saldo + mod;
                System.out.println("Saldo: " + saldo);
            } else if (opcion == 2) {
                System.out.println("Que cantidad quiere retirar: ");
                mod = input.nextInt();
                saldo = saldo - mod;
                System.out.println("Saldo: " + saldo);
            }


        }while (opcion != 0) ;
    }
}