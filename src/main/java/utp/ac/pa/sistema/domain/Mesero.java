package utp.ac.pa.sistema.domain;

public class Mesero {
    private int idEmpleado;
    private String nombre;
    private double ventasTotales;

    public Mesero(int idEmpleado, String nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.ventasTotales = 0.0;
    }

    public void tomarPedido(Mesa mesa, Pedido pedido) {
        mesa.cambiarEstado("Ocupada");
    }

    public Factura solicitarFactura(Pedido pedido) {
        return new Factura(pedido.getIdPedido(), pedido.calcularSubtotal(), "2026-10-08");
    }

    public String getNombre() { return nombre; }
}