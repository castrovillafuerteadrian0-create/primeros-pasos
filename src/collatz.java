import java.util.Scanner;

public class collatz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int contador = 0;
        System.out.println("Introduce el valor del numero: ");
        num = input.nextInt();
        while (num != 1){
            if (num % 2 == 0){
                System.out.println(num + "/2 = " + num/2);
                num = num/2;
                contador++;
            }else {
                System.out.println(num + "*3 = " + (num*3+1));
                num = (num*3)+1;
                contador++;
            }
        }
        System.out.println("Han hecho falta " + contador + " operaciones para llegar al 1");
    }
}
