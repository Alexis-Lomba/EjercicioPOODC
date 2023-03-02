package Ejercicios.Polimorfismo.Parametrico;

public class ClaseMetodos {
    public void metodo1(int arg1) {
        System.out.println("El argumento es: "+arg1);
    }
    public void metodo1(int arg1, int arg2) {
        System.out.println("Los argumentos son: "+arg1 + " y " + arg2);
    }

    public double metodo1(double arg1) {
        System.out.println("Valor del parametro: "+arg1);
        return arg1 * arg1;
    }
}
