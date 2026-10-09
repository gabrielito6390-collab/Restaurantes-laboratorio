package utp.ac.pa.sistema.domain;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String telefono;
    private String rucOrCedula;

    public Cliente(int idCliente, String nombre, String rucOrCedula) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.rucOrCedula = rucOrCedula;
    }

    public String getNombre() { return nombre; }
    public String getRucOrCedula() { return rucOrCedula; }
    public String getDatosCliente() {
        return "Cliente: " + nombre + " | Cédula/RUC: " + rucOrCedula;
    }
}
