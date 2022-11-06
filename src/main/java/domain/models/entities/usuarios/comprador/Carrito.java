package domain.models.entities.usuarios.comprador;

import domain.models.entities.productos.ProductoFinal;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

public class Carrito {
    @Id
    @GeneratedValue
    private Integer id;

    private Integer importe;

    private Estado estado;

    private Compra compra;

    private List<ProductoFinal> items;



}
