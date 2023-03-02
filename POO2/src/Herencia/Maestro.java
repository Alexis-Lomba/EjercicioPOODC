package Herencia;
    //se usa el extends para utilizar los metodos o atributos que hay en Persona
public class Maestro extends Persona{
    private String clase;

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }
}
