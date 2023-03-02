package Ejercicios.encapsulamiento;

public class Carro {
    private String marca;
    private String modelo;
    private Especificaciones potencia;
    private Especificaciones año;
    public Carro(String marca, String modelo, int caballo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = new Especificaciones(caballo, año);
        this.año = new Especificaciones(caballo, año);
    }

    public void datosCarro(String marca, String modelo, int caballo, int año){
        System.out.println("Marca del carro: " + marca);
        System.out.println("\nModelo del carro: " + modelo);
        System.out.println("\nPotencia del carro: " + caballo);
        System.out.println("\nAño de salida del carro: " + año);
    }

    public String carroDelAño( ) {
        return año.carroDelAño();
    }

    public String autoDeportivo( ){
        return potencia.autoDeportivo();
    }

}
