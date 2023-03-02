import abstracto.Cuadrado;
import abstracto.Rectangulo;

public class Main extends Ropa{
    public static void main(String[] args) {
        Ropa playera=new Ropa();
        Pantalon pantalon=new Pantalon();
        Calzado tenis=new Calzado(playera);  //encapsulamiento

        String color;
        String marca;
        float precio;

        playera.setColor("rojo");
        playera.setMarca("nike");
        playera.setPrecio(250);
        playera.datos(playera.getMarca(), playera.getPrecio(), playera.getColor());
        System.out.println();

        //herencia
        pantalon.setColor("azul");
        pantalon.setMarca("levis");
        pantalon.setMaterial("mezclilla");
        pantalon.setPrecio(150);
        pantalon.datos(pantalon.getMarca(), pantalon.getPrecio(), pantalon.getColor());

        System.out.println();
        playera.datos(playera.getMarca(), playera.getPrecio()); //polimorfismo

        tenis.setNumero(5);
        tenis.setColor("rojo");
        System.out.println("EL color del tenis es:" +tenis.getColor()); //encapsulamiento

        //abstraccion
        System.out.println();
        Cuadrado cuadrado=new Cuadrado(5);
        System.out.println("perimetro del cuadrado:" +cuadrado.perimetro());
        Rectangulo rectangulo=new Rectangulo(15, 30.3F);
        System.out.println("perimetro del rectangulo:" +rectangulo.perimetro());
    }
}