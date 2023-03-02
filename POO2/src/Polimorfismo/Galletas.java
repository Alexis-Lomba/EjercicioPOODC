package Polimorfismo;

public class Galletas {
    protected String nombre;
    protected String nivDistrib;
    protected String consumidores;
//se genera el constructor
    public Galletas(String nombre, String nivDistrib, String consumidores) {
        this.nombre = nombre;
        this.nivDistrib = nivDistrib;
        this.consumidores = consumidores;
    }
    //se generan los getters
    public String getMarca() {
        return nombre;
    }

    public String getNivDistrib() {
        return nivDistrib;
    }

    public String getConsumidores() {
        return consumidores;
    }
    //crear un string  que cambiara en cada clase
    public String Detalles(){
        return "Marca: "+nombre+"\nNivel de distribucion: "+nivDistrib+"\nConsumidores: "+consumidores;
    }
}
