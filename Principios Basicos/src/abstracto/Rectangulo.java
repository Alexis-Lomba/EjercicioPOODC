package abstracto;

public class Rectangulo extends Poligono{

    private float lado1;
    private float lado2;

    public Rectangulo(float lado1, float lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Rectangulo(){
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public float perimetro() {
        return lado1+lado1+lado2+lado2;
    }
}
