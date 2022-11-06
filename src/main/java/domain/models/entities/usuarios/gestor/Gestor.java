package domain.models.entities.usuarios.gestor;

import domain.models.entities.usuarios.Usuarios;

import javax.persistence.*;

@Entity                         // para que sea una entidad persistente, hago este arroba que me permite que persista mas alla de una unica ejecucion
@Table(name = "Gestores")      //mi tabla gestor va a contener filas, y cada fila va a representar a una instancia de la clase prestador.

public class Gestor extends Usuarios {

    @Column
    @Id                 // es una primary key
    @GeneratedValue     //va a ser autoincremental subrogada
    private Integer id;  // lo necesito para que pueda persistir en la bdd relacional

    @Column(name="Contrasenia")
    @GeneratedValue
    private String contrasenia;

    @Column(name="Nombre")
    private String nombre;

    /* private  ProductoBase agregarProductoBase() {
        ProductoBase nuevoProductoBase = new ProductoBase();     TODO: CREAR PRODUCTO BASE
            return null;                                         TODO: AGREGAR AREA DE PERSONALIZACION
                                                                 TODO: ELIMINAR AREA DE PERSONALIZACION
                                                                 TODO: AGREGAR TIPO DE PERSONALIZACION
                                                                 TODO: ELIMINAR TIPO DE PERSONALIZACION
                                                                 TODO: AGREGAR USUARIO A LA PLATAFORMA
                                                                 TODO: ELIMINAR USUARIO DE LA PLATAFORMA
                                                                 TODO: SUSPENDER USUARIO DE LA PLATAFORMA
                                                                 TODO: DAR DE ALTA USUARIO A LA PLATAFORMA
                                                                 TODO: DAR DE ALTA PRODUCTO PERSONALIZADO
                                 igual q vendedor                TODO: AGREGAR PRODUCTO PERSONALIZADO
                                 igual q vendedor                TODO: ELIMINAR PRODUCTO PERSONALIZADO
                                 igual q vendedor                TODO: PAUSAR PRODUCTO PERSONALIZADO

        }
    */
    }



