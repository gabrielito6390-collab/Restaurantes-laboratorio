package utp.ac.pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private String fechaHora;
    private String estado;
    private List<Plato> listaPlatos;

    public Pedido(int idPedido, String fechaHora) {
        this.idPedido = idPedido;
        this.fechaHora = fechaHora;
        this.estado = "En Preparación";
        this.listaPlatos = new ArrayList<>();
    }

    public void agregarPlato(Plato plato) {
        this.listaPlatos.add(plato);
    }

    public void eliminarPlato(Plato plato) {
        this.listaPlatos.remove(plato);
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (Plato p : listaPlatos) {
            subtotal += p.getPrecio();
        }
        return subtotal;
    }

    public int getIdPedido() { return idPedido; }
    public String getEstado() { return estado; }
    public void cambiarEstado(String nuevoEstado) { this.estado = nuevoEstado; }
    public List<Plato> getListaPlatos() { return listaPlatos; }
}

