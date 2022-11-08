package domain.models.entities.productos.personalizacion;

import lombok.Getter;
import lombok.Setter;

public class AreasDePersonalizacion {
    @Setter
    @Getter
    private String nombre;
    private TiposDePersonalizacion tipoDePersonalizacion;


}
