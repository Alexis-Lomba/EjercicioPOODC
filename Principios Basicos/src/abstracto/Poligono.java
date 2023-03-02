package abstracto;

public abstract class Poligono {
    private int lados;

    public Poligono(){

    }
    public Poligono(int lados) {
        this.lados = lados;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public abstract float perimetro();
}
