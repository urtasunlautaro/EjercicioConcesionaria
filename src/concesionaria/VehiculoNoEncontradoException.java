package concesionaria;

public class VehiculoNoEncontradoException extends RuntimeException {
    public VehiculoNoEncontradoException(char letra) {
        super("No se encontró un vehículo registrado con la letra '" + letra + "' en el modelo");
    }
}