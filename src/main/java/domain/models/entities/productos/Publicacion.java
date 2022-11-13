package domain.models.entities.productos;

import domain.models.entities.productos.personalizacion.PosiblePersonalizacion;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Publicacion {
    // todo: hereda de ProductoBase nombre, descripcion, categoria tal cual
   // TODO: private Integer sumaPrecios()=(precioPersonalizacion + precioBase);
    @Id
    @GeneratedValue
    private Integer id;

    private ProductoBase productoBase;

    @Column(name="Precio final")

    private String precioFinal /* TODO: = '$'+ sumaPrecios*/ ;

    @Column(name="Personalizacion")

    private PosiblePersonalizacion personalizaciones;

    private EstadoDePublicacion estadoDePublicacion;

    private Date fecha;



}
