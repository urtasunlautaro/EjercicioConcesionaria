package concesionaria;

public class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, double precio, int cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String cilindradaString() {
        return getCilindrada() + "c";
    }

    @Override
    public String toString() {
        return super.toString() + " // Cilindrada: " + cilindradaString();
    }
}
