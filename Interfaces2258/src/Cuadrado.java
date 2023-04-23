public class Cuadrado implements Figura{
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    public Cuadrado() {
    }
    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    public double calcularArea(){
        return this.lado * this.lado;
    }
}
