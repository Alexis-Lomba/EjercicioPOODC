package abstracto;

public class Cuadrado extends Poligono{
    private float lado;

    public Cuadrado(){

    }
    public Cuadrado(float lado) {
        super();
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float perimetro() {
        return lado*4;
    }
}
