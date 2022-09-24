package domain.usuario;

import domain.productos.Producto;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
    private List<Producto> publicacionesCargadas;

    public Vendedor(){
        this.publicacionesCargadas= new ArrayList<>();
    }

    public void cargarPublicacion (Producto productoNuevo){
        publicacionesCargadas.add(productoNuevo);
    }

    // TODO: 16/9/2022 como me conecto con el ServicioExternoFacturas? Es una dependencia
    //https://www.afip.gob.ar/ws/documentacion/ws-factura-electronica.asp ??

}
