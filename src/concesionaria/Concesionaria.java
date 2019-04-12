package concesionaria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Concesionaria {

    private List<Vehiculo> vehiculos;

    public Concesionaria() {
        this.vehiculos = new ArrayList<>();
        initVehiculos();
    }

    private void initVehiculos() {
        vehiculos.add(new Automovil("Peugeot", "206", 200000, 4));
        vehiculos.add(new Motocicleta("Honda", "Titan", 60000, 125));
        vehiculos.add(new Automovil("Peugeot", "208", 250000, 5));
        vehiculos.add(new Motocicleta("Yamaha", "YBR", 80500.50, 160));
    }

    public void impresionCompleta(){
        impresionBasica();
        imprimirSeparador();
        impresionDeMayorAMenor();
    }

    public void impresionBasica() {
        vehiculos.forEach(System.out::println);
        imprimirSeparador();
        imprimirMasCaro();
        imprimirMasBarato();
        imprimirConLetra('Y');
    }

    private void imprimirSeparador() {
        System.out.println("=============================");
    }

    private Vehiculo masBarato() {
        return Collections.min(vehiculos);
    }

    private Vehiculo masCaro() {
        return Collections.max(vehiculos);
    }

    private Vehiculo conLetra(char letra) {
        return vehiculos.stream()
                .filter(vehiculo -> vehiculo.getModelo().contains(String.valueOf(letra)))
                .findFirst()
                .orElseThrow(() -> new VehiculoNoEncontradoException(letra));
    }

    private void imprimirMasCaro() {
        System.out.println("Vehículo más caro: " + masCaro().shortString());
    }

    private void imprimirMasBarato() {
        System.out.println("Vehículo más barato: " + masBarato().shortString());
    }

    private void imprimirConLetra(char letra) {
        try {
            System.out.println("Vehículo que contiene en el modelo la letra '" + letra + "': " + conLetra(letra).longString());
        } catch(VehiculoNoEncontradoException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void impresionDeMayorAMenor() {
        vehiculos.sort(Collections.reverseOrder());
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        vehiculos.forEach(vehiculo-> System.out.println(vehiculo.shortString()));
    }
}
