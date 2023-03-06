public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private boolean vacunado;

    public Perro(String nombre, String raza, int edad, double peso, boolean vacunado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad <=20) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no es correcta");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunado=" + vacunado +
                '}';
    }
    public void ladrar(){
        System.out.println(nombre + " esta ladrando!!!");
        return;
    }
    public boolean dormir(){
        System.out.println(nombre + " esta durmiendo ...");
        boolean resultado = Math.random() > 0.51;
        return resultado;
    }
    public void comer(double comida){
        peso += comida;
    }
}
