package domain.models.entities.usuarios.comprador;

import domain.models.entities.usuarios.Usuarios;

import javax.persistence.*;

@Entity
@Table(name = "comprador")

public class Comprador extends Usuarios {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nombre") //, columnDefinition = // TODO: 06/10/2022 darle un tipo de dato predefinido de acuerdo con el disenio de bdd para optimizar el espacio
    private String nombre;

    private Carrito carritoDeCompras;

    private DatosFacturacion datosDeFacturacion;

    private PaisDeOrigen paisDeOrigen;



}
