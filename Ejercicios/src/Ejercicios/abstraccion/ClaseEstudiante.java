package Ejercicios.abstraccion;

public class ClaseEstudiante extends Estudiante{
    private int edad;
    public ClaseEstudiante(String nombre, int edad, int grado) {
        super(nombre, grado);
        this.edad = edad;
    }

    public void estudianteEscuela(){
        System.out.println("El estudiante " + getNombre() + " de" + getEdad() + " años, que esta cursando " + getGrado());
    }

    public int getEdad() {
        return edad;
    }
}
