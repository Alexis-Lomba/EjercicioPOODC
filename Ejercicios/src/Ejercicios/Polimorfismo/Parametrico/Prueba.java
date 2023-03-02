package Ejercicios.Polimorfismo.Parametrico;

public class Prueba {
    public static void main(String[] args) {
        ClaseMetodos objeto1 = new ClaseMetodos();
        objeto1.metodo1(10);
        objeto1.metodo1(10,25);
        System.out.println(objeto1.metodo1(15.5));

    }
}
