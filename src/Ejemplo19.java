import java.util.Scanner;

public class Ejemplo19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas;
        float euros;
        double bruto;
        System.out.println("Cuantas horas has trabajado? ");
        horas = input.nextInt();
        System.out.println("Cuanto cobras a la hora? ");
        euros = input.nextFloat();
        if (horas>35) {
            int extras = horas-35;
            double pago_extra = euros*1.5;
            bruto = (35*euros)+(extras*pago_extra);
            if (bruto>500){
                double libre = bruto-500;
                if (libre>400){
                    double resto = libre-400;
                    double impuestos2 = resto*0.45;
                    double impuestos = libre*0.25;
                    System.out.println("El salario neto seria:" + (libre+impuestos+impuestos2));
                }else {
                double impuestos = libre*0.25;
                System.out.println("El salario neto seria:" + (libre+impuestos));
                }
            }else {
                System.out.println("El salario neto es: " + bruto);
            }
        }else{
            bruto = horas*euros;
            if (bruto>500){
                double libre = bruto-500;
                if (libre>400){
                    double resto = libre-400;
                    double impuestos2 = resto*0.45;
                    double impuestos = libre*0.25;
                    System.out.println("El salario neto seria:" + (libre+impuestos+impuestos2));
                }else {
                    double impuestos = libre*0.25;
                    System.out.println("El salario neto seria:" + (libre+impuestos));
                }
            }else {
                System.out.println("El salario neto es: " + bruto);
            }

        }
    }
}
