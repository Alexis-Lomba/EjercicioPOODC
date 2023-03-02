package Ejercicios.Polimorfismo.Sobrecarga;

public class Prueba {
    public static void main(String[] args) {
        Transporte coche1 = new Carro();
        Transporte moto1 = new Moto();

        coche1.sonido();
        moto1.sonido();


    }
}
