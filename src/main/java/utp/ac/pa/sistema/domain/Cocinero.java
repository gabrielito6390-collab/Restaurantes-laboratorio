package utp.ac.pa.sistema.domain;

public class Cocinero {
    private int idEmpleado;
    private String nombre;
    private String especialidad;

    public Cocinero(int idEmpleado, String nombre, String especialidad) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void prepararPedido(Pedido pedido) {
        pedido.cambiarEstado("Listo para Servir");
    }
}