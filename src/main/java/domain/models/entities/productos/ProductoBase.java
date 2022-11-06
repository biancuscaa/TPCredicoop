package domain.models.entities.productos;

import domain.models.entities.productos.personalizacion.PosiblePersonalizacion;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name= "Producto Base")
public class ProductoBase {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="Nombre")
    @Setter
    private String nombre;


    @Column(name="Categoria")
    @Setter
    @Getter
    private Categoria categoria; //todo: que hacer si tiene multiples categorias


    @Column(name="Descripcion")
    @Setter
    private String descripcion;


    @Column(name="Precio base")
    @Setter
    private Integer precioBase; //en pesos arentinos todo: podriamos vincular a un api que haga conversion en caso de que el comprador seleccione como pais de origen otro lugar que no sea argentina


    @Column(name="Tiempo estimado de fabricacion")
    @Setter
    private Integer tiempoDeFabricacion; //en dias


    @Column
    @Setter
    private PosiblePersonalizacion posiblePersonalizacion;

    }
}
