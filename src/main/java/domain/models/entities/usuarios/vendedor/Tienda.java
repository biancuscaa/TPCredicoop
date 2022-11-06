package domain.models.entities.usuarios.vendedor;

import domain.models.entities.productos.ProductoFinal;

import java.util.List;

public class Tienda {
    private Integer id;
    private String nombre;
    private List<ProductoFinal> publicaciones;
    private Calificacion calificacion;
    private Integer ventasConcretadas;
}
