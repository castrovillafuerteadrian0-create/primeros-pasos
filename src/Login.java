import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contra = " ";
        int Max_intentos;
        String contraseña= ".";
        System.out.println("Introduce una contraseña: ");
        contraseña = input.next();
        System.out.println("Cuantos intentos hay?");
        Max_intentos = input.nextInt();
        while (Max_intentos != 0){
            System.out.println("Introduce la contraseña. Te quedan " + Max_intentos + " intentos");
            contra = input.next();
            if (contra.equals(contraseña)){
                System.out.println("Acceso concedido");
                break;
            }else {
                System.out.println("Contraseña Incorrecta");
                Max_intentos = Max_intentos - 1;
            }
            if (Max_intentos == 0){
                System.out.println("Acceso denegado");
                break;
            }
      }
    }
}
