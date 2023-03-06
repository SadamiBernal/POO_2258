public class Main {
    public static void main(String[] args) {
        //Clase Perro
        Perro dog = new Perro("firulais" , "chihuhua" , 5 , 2.7 ,true);
        System.out.println(dog);

        dog.comer(2.5);
        System.out.println("El peso de " + dog.getNombre()+ " despues de comer es de: " + dog.getPeso());

        dog.ladrar();

        System.out.println(dog.dormir());

        //CLase Gato

        Gato cat = new Gato("Kitty", "siames", 3.4);
        System.out.println(cat);

        cat.comer(1.2);
        System.out.println("El peso de " + cat.getNombre()+ " despues de comer es de: " + cat.getPeso());

        System.out.println(cat.dormir());

    }
}