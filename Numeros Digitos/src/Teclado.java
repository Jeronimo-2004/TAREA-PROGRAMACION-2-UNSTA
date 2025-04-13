import java.util.Scanner;

public class Teclado {
    public static void main(String[] args) {

       Scanner Teclado = new Scanner(System.in);

       System.out.println("Digite um numero positivo del 1 al 99: ");
       int num1 = Teclado.nextInt();

        if (num1 >= 1 && num1 <=99) {
            if (num1 < 10) {
                System .out.println("el numero tiene 1 digito");
            } else {
                System.out.println("el numero tiene 2 digitos");
            }
        } else {
            System .out.println("el numero debe ser entre 1 y 99");
        }
        Teclado.close();
        }


    }
