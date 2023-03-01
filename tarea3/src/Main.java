import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de 9 caracteres (X,O,_)");
        String cadena = sc.nextLine();
        if (cadena.length()!=9){
            System.out.println("la cadena no es valida");
            return;
        }
                System.out.println("Cadena ingresada: " + cadena);
                System.out.println("+-----+");
                System.out.println("|" + cadena.charAt(0) + "|" + cadena.charAt(1) + "|" + cadena.charAt(2) + "|");
                System.out.println("|" + cadena.charAt(3) + "|" + cadena.charAt(4) + "|" + cadena.charAt(5) + "|");
                System.out.println("|" + cadena.charAt(6) + "|" + cadena.charAt(7) + "|" + cadena.charAt(8) + "|");
                System.out.println("+-----+");
            }
        }
