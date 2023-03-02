package Ejercicios.abstraccion;

public abstract class Estudiante {
    private String nombre;
    private int grado;

    public Estudiante (String nombre, int grado) {
        this.nombre = nombre;
        this.grado = grado;
    }

    public void informacionEstudiante(){
        System.out.println("El estudiante " + this.nombre + "de " + this.grado);
    }

    public String getNombre() {
        return nombre;
    }

    public int getGrado() {
        return grado;
    }
}
