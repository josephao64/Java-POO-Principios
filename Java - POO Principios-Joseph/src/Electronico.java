public class Electronico extends Producto{
    private String marca;

    public Electronico(int id, String nombre, double precio, int cantidad, String marca) {
        super(id, nombre, precio, cantidad);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public double calcularDescuento() {

        return getPrecio() * 0.1; // Descuento del 10%
    }
}