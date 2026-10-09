package utp.ac.pa.sistema.domain;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private int idInventario;
    private String fechaUltimaActualizacion;
    private List<Ingrediente> listaIngredientes;

    public Inventario() {
        this.listaIngredientes = new ArrayList<>();
    }

    public int verificarStock(Ingrediente ingrediente) {
        return ingrediente.getCantidadStock();
    }

    public void alertarStockBajo() {
        for (Ingrediente ing : listaIngredientes) {
            if (ing.getCantidadStock() < 5) {
                System.out.println("ALERTA: Stock bajo para " + ing.getNombre());
            }
        }
    }
}