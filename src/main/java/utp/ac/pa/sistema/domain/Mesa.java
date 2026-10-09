package utp.ac.pa.sistema.domain;

public class Mesa {
    private int numero;
    private int capacidad;
    private String estado;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.estado = "Disponible";
    }

    public int getNumero() { return numero; }
    public String getEstado() { return estado; }
    
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public boolean estaDisponible() {
        return "Disponible".equalsIgnoreCase(this.estado);
    }
}
