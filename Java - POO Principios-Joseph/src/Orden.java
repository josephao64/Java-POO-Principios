import java.util.ArrayList;
public class Orden {
    private ArrayList<Producto> productos;
    public Orden() {
        productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

    public void mostrarDetalles() {
        System.out.println("Detalles de la orden:");
        for (Producto producto : productos) {
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: Q" + producto.getPrecio());
            System.out.println("Cantidad: " + producto.getCantidad());
            if (producto instanceof Electronico) {
                Electronico electronico = (Electronico) producto;
                System.out.println("Marca: " + electronico.getMarca());
                System.out.println("Descuento: Q" + electronico.calcularDescuento());
            }
            System.out.println("-----------------------");
        }
        System.out.println("Total de la orden: Q" + calcularTotal());
    }
}