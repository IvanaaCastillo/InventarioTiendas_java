package clases;

public class ComputadoraPortatil extends ProductoElectrodomestico {
    //Atributos
    private String marca;
    private String memoriaRam;
    private String numeroSerie;

    //Constructor
    public ComputadoraPortatil(String nombre, double precio, int cantidadDisponible, String marca, String memoriaRam, String numeroSerie) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.numeroSerie = numeroSerie;
    }

    //Getters y Setters
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMemoriaRam() {
        return this.memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getNumeroSerie() {
        return this.numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    //Mostrar información
    @Override
        public void mostrarInformacion() {
        System.out.println("Computadora Portatil");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Cantidad disponible: " + getCantidadDisponible());
        System.out.println("Marca: " + marca);
        System.out.println("Memoria Ram: " + memoriaRam);
        System.out.println("Número de serie: " + numeroSerie);
        System.out.println();
    }
}

