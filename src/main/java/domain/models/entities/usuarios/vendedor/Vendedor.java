package domain.models.entities.usuarios.vendedor;

import domain.models.entities.productos.ProductoFinal;
import domain.models.entities.usuarios.Usuarios;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "vendedor")
public class Vendedor extends Usuarios {
    @Id
    @GeneratedValue
    private Integer id;

    private String nombre;
    private String contrasenia;
    private MediosDePago mediosDePago;
    private Contacto contacto;


    @Column(name = "Tienda") //, columnDefinition = // TODO: 06/10/2022 darle un tipo de dato predefinido de acuerdo con el disenio de bdd para optimizar el espacio
    private Tienda tienda;





    /* private ProductoFinal agregarProductoFinal() {
        ProductoFinal nuevoProductoFinal = new ProductoFinal();
        nuevoProductoFinal.setNombre();
        nuevoProductoFinal.setPrecioFinal();
        nuevoProductoFinal.setPersonalizacionFinal();

        return null;
    }


   public void agregarProducto(ProductoFinal producto){            TODO:AGREGAR PRODUCTO DE LA TIENDA
        this.productos.add(producto);
    }
    public void eliminarProducto(ProductoFinal producto){            TODO: ELIMINAR PRODUCTO DE LA TIENDA
        this.productos.remove(producto);
                                                                     TODO: PAUSAR PRODUCTO DE LA TIENDA
    }
                                                                     TODO: CREAR PRODUCTO PERSONALIZADO

                                                                     TODO: ACEPTAR PAGO
                                                                     TODO: RECHAZAR PAGO

                                                                     TODO: AGREGAR MEDIO DE PAGO
                                                                     TODO: ELIMINAR MEDIO DE PAGO
    */

    }

