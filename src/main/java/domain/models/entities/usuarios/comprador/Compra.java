package domain.models.entities.usuarios.comprador;

import domain.models.entities.usuarios.vendedor.Tienda;
import domain.models.entities.usuarios.vendedor.Vendedor;

public class Compra {
    private Comprador comprador;
    private Vendedor vendedor;
    private Tienda tienda;
   // private MedioDePago medioDePago; TODO: como lo hago a esto?
    private Factura factura;
    private EstadoCompra estadoCompra;


}
