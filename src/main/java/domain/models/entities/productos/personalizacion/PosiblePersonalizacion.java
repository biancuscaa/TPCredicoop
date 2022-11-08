package domain.models.entities.productos.personalizacion;

import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class PosiblePersonalizacion {

    @Id
    @GeneratedValue
    private Integer id;

    @Setter
    @Column(name = "Areas de personalizacion")
    private AreasDePersonalizacion areasDePersonalizacion;

    private Integer precioPersonalizacion;


    }
}
