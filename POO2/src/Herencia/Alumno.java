package Herencia;
//se usa el extends para utilizar los metodos o atributos que hay en Persona

public class Alumno extends Persona {
    private String escuela;
    private double califMatematicas;
    private double califPOO;

    //se crean los getters y setters
    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public double getCalifMatematicas() {
        return califMatematicas;
    }

    public void setCalifMatematicas(double califMatematicas) {
        this.califMatematicas = califMatematicas;
    }

    public double getCalifPOO() {
        return califPOO;
    }

    public void setCalifPOO(double califPOO) {
        this.califPOO = califPOO;
    }
}
