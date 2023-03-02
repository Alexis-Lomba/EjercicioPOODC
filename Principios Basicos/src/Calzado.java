public class Calzado {
    private double numero;
    private Ropa datosExtra;

    public Calzado() {
    }
    public Calzado(Ropa datosExtra){    //encapsulamiento
        super();
        this.datosExtra=datosExtra;
    }
    public double getNumero() {
        return numero;
    }
    public void setNumero(double numero) {
        this.numero = numero;
    }
    public String getColor() {
        return datosExtra.getColor();
    }
    public void setColor(String color) {
        datosExtra.setColor(color);
    }
    public Calzado(double numero, String color) {
        super();
        this.numero = numero;
        this.datosExtra= new Ropa (color);
    }

    public void setDatosExtra(Ropa datosExtra) {
        this.datosExtra = datosExtra;
    }
}
