package Polimorfismo;

public class GalletasEmperador extends Galletas{
    private int calorias;

    public GalletasEmperador(String marca, String nivDistrib, String consumidores, int calorias) {
        super(marca, nivDistrib, consumidores);
        this.calorias = calorias;
    }

    public int getCalorias() {
        return calorias;
    }

    public String Detalles(){
        return "Marca: "+nombre+"\nNivel de distribucion: "+nivDistrib+"\nConsumidores: "+consumidores+
                "\nCalorias por paquete: "+calorias;

    }
}
