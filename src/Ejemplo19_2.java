import java.util.Scanner;

public class Ejemplo19_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas;
        double pago;
        double bruto;
        double impuestos;
        System.out.println("Cuantas horas has trabajado? ");
        horas = input.nextInt();
        System.out.println("Cuanto cobras a la hora? ");
        pago = input.nextDouble();
        if (horas<35){
            bruto = horas*pago;
        }else{
            bruto = (horas*pago) + ((horas-35)*(pago*1.5));
        }
        if (bruto<500){
             impuestos=0;
        } else if (bruto<900) {
             impuestos= (bruto-500)*0.25;
        }else {
             impuestos = ((bruto-500)*0.25)+(bruto*0.45);
        }
        System.out.println(impuestos);
        System.out.println("El salario neto es: " + (bruto-impuestos));
    }
}
