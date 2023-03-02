public class Ropa {
    private String marca;
    private float precio;
    private String color;

    public Ropa() {
    }
    public Ropa(String color){
        super();
        this.color=color;
    }
    public void datos(String marca, float precio, String color){
        System.out.println("La marca es: "+ marca);
        System.out.println("El precio es: "+ precio);
        System.out.println("El color es: "+ color);
    }
    public void datos(String marca, float precio){
        System.out.println("La marca es: "+ marca);
        System.out.println("El precio es: "+ precio);
    }
    public void datos(String marca){
        System.out.println("La marca es: "+ marca);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
