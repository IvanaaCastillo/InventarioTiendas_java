package clases;

import java.util.ArrayList;

public class TiendaElectronica {
    private ArrayList<ProductoElectrodomestico> listaDeProductos;

    public TiendaElectronica() {
        this.listaDeProductos = new ArrayList<>();
    }

    //Metodo agregar producto
    public void agregarProducto(ProductoElectrodomestico producto) {
        listaDeProductos.add(producto);
        System.out.println("Producto agregado al inventario: " + producto.getNombre());
    }

    //Metodo para mostrar productos
    public void mostrarProductos() {
        System.out.println("\nInventario");
        if(listaDeProductos.isEmpty()) {
            System.out.println("No quedan productos en el inventario");
        } else {
            for (ProductoElectrodomestico producto : listaDeProductos) {
                producto.mostrarInformacion();
            }
        }
    }

    //Metodo para buscar producto
    public ProductoElectrodomestico buscarProducto(String nombre) {
        for (ProductoElectrodomestico producto : listaDeProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        } return null;
    } 

    //Metodo para realizar una venta
    public void realizarVenta(String nombreProducto) {
        ProductoElectrodomestico producto = buscarProducto(nombreProducto);

        if(producto == null) {
            System.out.println("Producto no encontrado");
            return;
        }

        if(producto.getCantidadDisponible() > 0) {
            producto.setCantidadDisponible(producto.getCantidadDisponible() - 1);
            System.out.println("Venta realizada: " + producto.getNombre());
        } else {
            System.out.println("Producto agotado");
        }
    }
}
