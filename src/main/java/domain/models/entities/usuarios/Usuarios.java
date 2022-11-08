package domain.models.entities.usuarios;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public abstract class Usuarios {
    @Id
    @GeneratedValue
    private Integer id;

    private TipoDeUsuario tipoDeUsuario;
}
