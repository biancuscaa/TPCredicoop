package domain;

import domain.productos.Publicacion;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CarritoDeCompras {
    private int monto;
    private List<Publicacion> publicacionesCarrito;

    public CarritoDeCompras(){
        this.publicacionesCarrito=new ArrayList<>();
    }
    public void setMonto(int monto) {
        publicacionesCarrito.forEach(publicacion -> this.monto= monto+ publicacion.getPrecio());
    }
    public void agregarProductoACarrito(Publicacion productoNuevo){
        publicacionesCarrito.add(productoNuevo);
    }
    public void setMonto() {
        publicacionesCarrito.forEach(p->{
            this.monto= p.getPrecio() + this.monto;
        })
    }



    // TODO: 16/9/2022  hacer una excepcion respecto al servicio externo del que te hace la factura.
    //  lo mismo una excepcion por si no me aceptan el pago (dos try...catch)

    // TODO: 16/9/2022 hacer excepcion try...catch
    //  por si el comprador quiere pagar el carrito y alguna de las publicaciones estan canceladas
    // TODO: 19/9/2022 como se relaciona con las publicaciones o los productos y los compradores? 
}
