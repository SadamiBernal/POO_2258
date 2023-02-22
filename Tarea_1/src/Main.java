import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre, profesión y pais de origen");
        String cadena = sc.nextLine();
        String [] separado = cadena.toUpperCase().split(" ");
        System.out.println("Nombre: " + separado[0]);
        System.out.println("Profesion: " + separado[1]);
        System.out.println("Nacionalidad: " + separado[2]);
    }
}