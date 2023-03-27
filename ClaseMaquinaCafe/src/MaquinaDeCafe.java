public class MaquinaDeCafe {

    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public MaquinaDeCafe() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "MaquinaDeCafe{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                '}';
    }
    public void American(){
    if(this.agua >=180 && this.cafe >= 15 && this.vasos>0){
        this.agua -= 180;
        this.cafe -= 15;
        this.vasos --;
        System.out.println("El cafe americano fue hecho correctamente");
        mostrarInventario();
        }else{
        System.out.println("no hay suficientes ingredientes");
        mostrarInventario();
    }
    }
    public void Expreso(){
    if(this.agua >= 120 && this.cafe >=20 && this.vasos>0){
        this.agua -= 120;
        this.cafe -= 20;
        this.vasos --;
        System.out.println("El cafe expreso fue hecho correctamente");
        mostrarInventario();
    }else{
        System.out.println("no hay suficientes ingredientes");
        mostrarInventario();
    }
    }
    public void Capuchino(){
        if(this.agua >= 100 && this.crema>=70 && this.cafe >=14 && this.vasos>0){
            this.crema -= 70;
            this.agua -= 100;
            this.cafe -= 14;
            this.vasos --;
            System.out.println("El cafe capuchino fue hecho correctamente");
            mostrarInventario();
        }else{
            System.out.println("no hay suficientes ingredientes");
            mostrarInventario();
        }
    }
    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        System.out.println("Agua: " + this.agua + " ml");
        System.out.println("Café: " + this.cafe + " g");
        System.out.println("Crema: " + this.crema + " ml");
        System.out.println("Vasos: " + this.vasos);
    }
}
