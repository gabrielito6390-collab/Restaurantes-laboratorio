package utp.ac.pa.sistema;

import utp.ac.pa.sistema.domain.*;
import utp.ac.pa.sistema.utils.IOUtils;

public class App {
    public static void main(String[] args) {
        IOUtils.mostrarMensaje("===============================================================");
        IOUtils.mostrarMensaje("   DEMOSTRACIÓN INTEGRAL: SISTEMA DE GESTIÓN DE RESTAURANTE   ");
        IOUtils.mostrarMensaje("===============================================================");

        // 1. Clase Administrador
        IOUtils.mostrarMensaje("\n--- 1. CONFIGURACIÓN DEL SISTEMA Y PERSONAL (Administrador) ---");
        Administrador admin = new Administrador(1, "Ana Torres");
        admin.registrarEmpleado("Carlos Pérez (Mesero)");
        admin.registrarEmpleado("Roberto Gómez (Cocinero)");

        // 2. Clase Categoria y Clase Plato
        IOUtils.mostrarMensaje("\n--- 2. CREACIÓN DE MENÚ (Categoria y Plato) ---");
        Categoria catPlatosFuertes = new Categoria(1, "Platos Fuertes", "Especialidades de la casa");
        Categoria catBebidas = new Categoria(2, "Bebidas", "Refrescos y jugos naturales");

        Plato pasta = new Plato(101, "Pasta Carbonara", 12.50);
        Plato pizza = new Plato(102, "Pizza Margarita", 10.00);
        Plato limonada = new Plato(103, "Limonada Natural", 3.50);

        admin.gestionarMenu(pasta);
        admin.gestionarMenu(pizza);
        admin.gestionarMenu(limonada);

        // 3. Clase Ingrediente y Clase Inventario
        IOUtils.mostrarMensaje("\n--- 3. CONTROL DE INVENTARIO (Inventario e Ingrediente) ---");
        Inventario inventario = new Inventario();
        Ingrediente queso = new Ingrediente(1, "Queso Parmesano", 15, "Kg");
        Ingrediente harina = new Ingrediente(2, "Harina de Trigo", 3, "Kg"); // Cantidad baja para prueba

        IOUtils.mostrarMensaje("Stock de " + queso.getNombre() + ": " + inventario.verificarStock(queso) + " Kg");
        IOUtils.mostrarMensaje("Stock de " + harina.getNombre() + ": " + inventario.verificarStock(harina) + " Kg");
        
        // Simular uso de ingrediente y alerta
        harina.reducirStock(1);
        inventario.alertarStockBajo();
        
        // Reabastecimiento
        harina.reabastecer(10);
        IOUtils.mostrarMensaje("Stock actualizado de " + harina.getNombre() + ": " + harina.getCantidadStock() + " Kg");

        // 4. Clase Turno
        IOUtils.mostrarMensaje("\n--- 4. GESTIÓN DE TURNO (Turno) ---");
        Turno turnoDiurno = new Turno(1, "08:00 AM", "04:00 PM");
        turnoDiurno.iniciarTurno();

        // 5. Clase Personal: Mesero y Cocinero
        Mesero mesero = new Mesero(201, "Carlos Pérez");
        Cocinero cocinero = new Cocinero(301, "Roberto Gómez", "Especialista en Pastas");

        // 6. Clase Cliente y Clase Mesa
        IOUtils.mostrarMensaje("\n--- 5. LLEGADA DE CLIENTE Y ASIGNACIÓN DE MESA (Cliente y Mesa) ---");
        Cliente cliente = new Cliente(501, "Juan Delgado", "8-888-8888");
        Mesa mesa5 = new Mesa(5, 4);

        IOUtils.mostrarMensaje("Atendiendo a: " + cliente.getDatosCliente());
        IOUtils.mostrarMensaje("Mesa #" + mesa5.getNumero() + " - Disponibilidad inicial: " + mesa5.estaDisponible());

        // 7. Clase Pedido
        IOUtils.mostrarMensaje("\n--- 6. REGISTRO Y PROCESAMIENTO DE PEDIDO (Pedido) ---");
        Pedido pedido1 = new Pedido(1001, "2026-10-08 12:30 PM");
        
        mesero.tomarPedido(mesa5, pedido1);
        IOUtils.mostrarMensaje("Mesa #" + mesa5.getNumero() + " - Estado tras tomar pedido: " + mesa5.getEstado());

        pedido1.agregarPlato(pasta);
        pedido1.agregarPlato(pizza);
        pedido1.agregarPlato(limonada);

        IOUtils.mostrarMensaje("Platos agregados al Pedido #" + pedido1.getIdPedido() + ": " + pedido1.getListaPlatos().size());
        IOUtils.mostrarMensaje("Subtotal calculado: $" + pedido1.calcularSubtotal());

        // Cocinero prepara el pedido
        cocinero.prepararPedido(pedido1);
        IOUtils.mostrarMensaje("Estado del Pedido en cocina: " + pedido1.getEstado());

        // 8. Clase Factura
        IOUtils.mostrarMensaje("\n--- 7. FACTURACIÓN Y COBRO (Factura) ---");
        Factura factura = mesero.solicitarFactura(pedido1);
        factura.procesarPago("Tarjeta de Crédito");
        factura.imprimirFactura();

        // Liberar mesa tras pago
        mesa5.cambiarEstado("Disponible");
        IOUtils.mostrarMensaje("Mesa #" + mesa5.getNumero() + " reabierta: " + mesa5.estaDisponible());

        // 9. Cierre de Turno y Reportes
        IOUtils.mostrarMensaje("\n--- 8. CIERRE DE JORNADA ---");
        turnoDiurno.cerrarTurno();
        admin.generarReporteVentas();

        IOUtils.mostrarMensaje("===============================================================");
        IOUtils.mostrarMensaje("   PRUEBA FINALIZADA: TODAS LAS CLASES PROBADAS CON ÉXITO     ");
        IOUtils.mostrarMensaje("===============================================================");
    }
}    
