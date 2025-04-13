import java.util.Scanner;
public class Fecha {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        System.out.print("Ingresa un dia: ");
        int dia = Teclado.nextInt();

        System.out.print("Ingresa un mes: ");
        int mes = Teclado.nextInt();

        System.out.print("Ingresa un año: ");
        int año = Teclado.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("Error: mes no valido");
        } else if (dia < 1 || dia > 31) {
            System.out.println("Error: dia no valido");
        } else if (mes >= 1 && mes <= 3) {
            System.out.println("Primer Trimestre");

        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Segundo Trimestre");

        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Tercer Trimestre");

        } else if (mes >= 10 && mes <= 12) {
            System.out.println("cuarto Trimestre");
        }

        Teclado.close();

    }
}