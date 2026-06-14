package clases;

public class Televisor extends ProductoElectrodomestico {
    //Atributos
    private int  tamanioPantalla;
    private String resolucion;

    //Constructor
    public Televisor(String nombre, double precio, int cantidadDisponible, int tamanioPantalla, String resolucion) {
        super(nombre, precio, cantidadDisponible);
        this.tamanioPantalla = tamanioPantalla;
        this.resolucion = resolucion;
    }

    //Getters y Setters
    public int getTamanioPantalla() {
        return this.tamanioPantalla;
    }

    public void setTamanioPantalla(int tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public String getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    //Mostrar información
    @Override
    public void mostrarInformacion() {
        System.out.println("Producto Electrodomestico");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad disponible: " + getCantidadDisponible());
        System.out.println("Tamano de pantalla: " + tamanioPantalla);
        System.out.println("Resolución: " + resolucion);
        System.out.println();
    }
}
