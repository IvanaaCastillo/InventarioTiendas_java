
import clases.ComputadoraPortatil;
import clases.Televisor;
import clases.TiendaElectronica;

public class Aplicacion {
        public static void main(String[] args) {
                //Crear la tienda
                TiendaElectronica tienda = new TiendaElectronica();

                //Crear productos para la tienda
                Televisor tv1 = new Televisor(
                        "Samsung Smart TV",
                        499990,
                        3,
                        55,
                        "4K UHD"
                );

                Televisor tv2 = new Televisor(
                        "LG OLED",
                        899990,
                        5,
                        65,
                        "4K OLED"
                );

                ComputadoraPortatil laptop1 = new ComputadoraPortatil(
                        "Notebook Gamer",
                        1099990,
                        2,
                        "ASUS",
                        "16 GB",
                        "AS12345"
                );

                ComputadoraPortatil laptop2 = new ComputadoraPortatil(
                        "Laptop Huawei",
                        799990,
                        10,
                        "Huawei",
                        "16 GB",
                        "NUM12345"
                );


                //Agregar productos
                tienda.agregarProducto(tv1);
                tienda.agregarProducto(tv2);
                tienda.agregarProducto(laptop1);
                tienda.agregarProducto(laptop2);

                //Mostrar inventario
                tienda.mostrarProductos();

                //Realizar ventas
                tienda.realizarVenta("Samsung Smart TV");
                tienda.realizarVenta("Samsung Smart TV");
                tienda.realizarVenta("Samsung Smart TV");
                tienda.realizarVenta("Samsung Smart TV"); // agotado

                tienda.realizarVenta("Notebook Gamer");
                tienda.realizarVenta("Notebook Gamer");
                tienda.realizarVenta("Notebook Gamer"); // agotado

        }
}
