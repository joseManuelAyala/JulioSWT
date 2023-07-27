import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas veces quieres imprimir el numero?");
        int h = 0;
        try {
            h = scanner.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("El numero que haz dado no es valido");
        }

        for (int i = 0; i < h; i++) {
            System.out.println("Victor me la pela");
        }
        System.out.println();
        System.out.println();
        System.out.println("Me mama mi roomie");
        System.out.println();


    }
}
