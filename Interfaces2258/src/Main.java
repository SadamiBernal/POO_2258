import herenciamultiple.AlumnoDeportistaArtista;

public class Main {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("area = " + cuadrado.calcularArea());
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area de circulo= "+ circulo.calcularArea());
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("juan");
        ada.setArte("pintura");
        ada.setDeporte("Basketball");
        System.out.println(ada);
        ada.ensayar("oleo");
        ada.entrenar();
        ada.presentarCompetencia("Naucali");
        ada.presentarObra();

    }
}