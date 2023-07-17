// Joseph isaac asencio ortiz
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto(1, "limpiador monitor", 10.00, 2);
        Producto producto2 = new Producto(2, "Camiseta", 50.00, 1);
        Electronico producto3 = new Electronico(3, "monitor", 1200.00, 2, "LG");
        Electronico producto4 = new Electronico(4, "Teclado", 600.00, 1, "Logitech");

        // Crea una orden
        Orden orden = new Orden();

        // Agrega los productos a la orden
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);
        orden.agregarProducto(producto4);

        // Mostrar los detalles de la orden
        orden.mostrarDetalles();
    }
}
