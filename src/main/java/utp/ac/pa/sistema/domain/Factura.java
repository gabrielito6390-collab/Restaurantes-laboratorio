package utp.ac.pa.sistema.domain;

public class Factura {
    private int idFactura;
    private String fecha;
    private double total;
    private String metodoPago;

    public Factura(int idFactura, double total, String fecha) {
        this.idFactura = idFactura;
        this.total = total;
        this.fecha = fecha;
    }

    public double calcularITBMS() {
        return this.total * 0.07;
    }

    public boolean procesarPago(String metodo) {
        this.metodoPago = metodo;
        return true;
    }

    public void imprimirFactura() {
        System.out.println("Factura #" + idFactura + " - Total: $" + total + " (ITBMS: $" + calcularITBMS() + ")");
    }
}
