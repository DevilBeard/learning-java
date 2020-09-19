import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Proporcione un titulo:");
        var titulo = scn.nextLine();

        System.out.println("Escribe un autor:");
        var autor = scn.nextLine();
        System.out.println("\"" + titulo + "\"" + " fue escrito por " + autor);
    }
}