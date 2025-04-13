import java.util.Scanner;
public class Coordenada {
    public static void main(String[] args) {

        Scanner Coordenada = new Scanner(System.in);

        System.out.println("Digite la coordenada de un punto en x en el plano: ");
        int x = Coordenada.nextInt();
        System.out.println("Digite la coordenada de un punto en y en el plano: ");
        int y = Coordenada.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("el punto no puede estar en el origen (0,0)");

        } else if (x == 0) {
            System.out.println("El punto de coordenada esta sobre el eje y");
        } else if (y == 0) {
            System.out.println("El punto de coordenada esta sobre el eje x");
        } else if (x > 0 && y > 0) {
            System.out.println("1º Cuadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2º Cuadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3º Cuadrante");
        } else if (x > 0 && y < 0)  {
            System.out.println("4º Cuadrante");
        }


        Coordenada.close();
        }
}
