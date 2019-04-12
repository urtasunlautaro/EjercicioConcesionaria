package concesionaria;

import java.text.DecimalFormat;

public class Vehiculo implements Comparable<Vehiculo> {
    protected String marca;
    protected String modelo;
    protected double precio;
    private static DecimalFormat formato = new DecimalFormat("###,###.00");

    public Vehiculo(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String precioString() {
        return "$" + formato.format(getPrecio());
    }

    public String shortString() {
        return  getMarca() + " " + getModelo();
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + " // Modelo: " + getModelo() +  " // Precio: " + precioString();
    }

    @Override
    public int compareTo(Vehiculo o) {
        return (int) (this.precio - o.getPrecio());
    }

    public String longString() {
        return shortString() + " " + precioString();
    }
}
