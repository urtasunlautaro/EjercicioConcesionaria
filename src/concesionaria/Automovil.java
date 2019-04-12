package concesionaria;

public class Automovil extends Vehiculo {
    private int cantidadPuertas;

    public Automovil(String marca, String modelo, double precio, int cantidadPuertas) {
        super(marca, modelo, precio);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public String toString() {
        return super.toString() + " // Puertas: " + cantidadPuertas;
    }
}
