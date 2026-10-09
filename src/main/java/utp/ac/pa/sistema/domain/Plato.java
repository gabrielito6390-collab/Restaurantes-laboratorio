package utp.ac.pa.sistema.domain;

public class Plato {
    private int idPlato;
    private String nombre;
    private double precio;
    private boolean disponible;

    public Plato(int idPlato, String nombre, double precio) {
        this.idPlato = idPlato;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = true;
    }

    public int getIdPlato() { return idPlato; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public boolean isDisponible() { return disponible; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
}