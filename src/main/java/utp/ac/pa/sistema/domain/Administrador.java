package utp.ac.pa.sistema.domain;

public class Administrador {
    private int idEmpleado;
    private String nombre;
    private String nivelAcceso;

    public Administrador(int idEmpleado, String nombre) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.nivelAcceso = "Total";
    }

    public void registrarEmpleado(String nombre) {
        System.out.println("Empleado registrado: " + nombre);
    }

    public void generarReporteVentas() {
        System.out.println("Generando reporte de ventas...");
    }

    public void gestionarMenu(Plato plato) {
        System.out.println("Plato " + plato.getNombre() + " actualizado en menú.");
    }
}