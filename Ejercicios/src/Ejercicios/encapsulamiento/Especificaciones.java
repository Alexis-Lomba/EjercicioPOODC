package Ejercicios.encapsulamiento;

public class Especificaciones {
    private int caballosFuerza;
    private int añoSalida;

    public Especificaciones(int caballosFuerza, int añoSalida) {
        this.caballosFuerza = caballosFuerza;
        this.añoSalida = añoSalida;
    }

    public String carroDelAño( ) {
        if (añoSalida > 2022 ){
            return "Este carro tiene menos de un año de salida";
        } else {
            return "Este carro tiene mas de un año de salida";
        }
    }

    public String autoDeportivo( ) {
        if (caballosFuerza > 500){
            return "Es un auto deportivo";
        } else {
            return "Es un auto casual";
        }
    }

}
