package utp.ac.pa.sistema.domain;

public class Ingrediente {
    private int idIngrediente;
    private String nombre;
    private int cantidadStock;
    private String unidadMedida;

    public Ingrediente(int idIngrediente, String nombre, int cantidadStock, String unidadMedida) {
        this.idIngrediente = idIngrediente;
        this.nombre = nombre;
        this.cantidadStock = cantidadStock;
        this.unidadMedida = unidadMedida;
    }

    public void reducirStock(int cant) {
        if (cantidadStock >= cant) {
            this.cantidadStock -= cant;
        }
    }

    public void reabastecer(int cant) {
        this.cantidadStock += cant;
    }

    public String getNombre() { return nombre; }
    public int getCantidadStock() { return cantidadStock; }
}