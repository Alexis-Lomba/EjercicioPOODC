package Ejercicios.encapsulamiento;

public class Prueba {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW","Z5",500,2023);
        carro1.datosCarro("BMW","Z5",500,2023);
        System.out.println(carro1.carroDelAño());
        System.out.println(carro1.autoDeportivo());

    }
}
