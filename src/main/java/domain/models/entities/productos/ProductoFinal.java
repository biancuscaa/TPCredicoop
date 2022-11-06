package domain.models.entities.productos;

import domain.models.entities.productos.personalizacion.PersonalizacionFinal;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class ProductoFinal {
    // todo: hereda de ProductoBase nombre, descripcion, categoria tal cual
   // TODO: private Integer sumaPrecios()=(precioPersonalizacion + precioBase);
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    @Setter
    private String nombre;

    @Column(name="Precio final")
    @Setter
    private String precioFinal /* TODO: = '$'+ sumaPrecios*/ ;

    @Column(name="Personalizacion")
    @Setter
    private PersonalizacionFinal personalizacionFinal;

    private EstadoDePublicacion estadoDePublicacion;



}
