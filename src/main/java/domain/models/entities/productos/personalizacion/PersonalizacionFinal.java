package domain.models.entities.productos.personalizacion;

import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
public class PersonalizacionFinal {
     @Id
     @GeneratedValue
     private Integer id;

     @Column(name = "Personalizacion")
     @Setter
     private  PosiblePersonalizacion personalizacionfinal;

     @Column(name = "Precio")
     @Setter
     private Integer precioPersonalizacion;
}
