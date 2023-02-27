import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena ");
        String input = sc.nextLine();
        boolean consecutiva = true;

        for (int i = 0; i < input.length()-1; i++) {
            if ((int)input.charAt(i+1) - (int)input.charAt(i) != 1) {
                consecutiva = false;
            }
        }
        System.out.println(consecutiva);
    }
}