import java.util.Scanner;
public class Promocion {
    public static void main(String[] args){

        Scanner nota = new Scanner(System.in);
        int nota1, nota2, nota3, promedio = 0;

        System.out.println("Cual es su primer nota:  ");
        nota1 = nota.nextInt();

        System.out.println("Cual es su segundo nota:  ");
        nota2 = nota.nextInt();

        System.out.println("Cual es su tercer nota:  ");
        nota3 = nota.nextInt();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 8 && promedio <= 10) {
            System.out.println("promociona");
        } else if (promedio < 8){
            System.out.println("no promociona");
        } else {
            System.out.println("ERROR NOTA INCORRECTA");
        }
    }
}
