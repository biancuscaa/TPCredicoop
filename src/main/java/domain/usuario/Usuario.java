package domain.usuario;

import domain.CarritoDeCompras;
import domain.MedioDePago;
import domain.ServicioExterno;
import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Usuario  {
    private String password;
    @Setter
    private String id;
    @Setter
    private TipoDeUsuario tipoDeUsuario;

    public Usuario(String id, TipoDeUsuario tipoDeUsuario) {
        this.id = id;
        this.tipoDeUsuario = tipoDeUsuario;
    }
    // por que esta dos veces?

    public Usuario(String id, String password, TipoDeUsuario tipoDeUsuario) {
        this.id = id;
        this.password = password;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public void aceptarPago(MedioDePago medioDePago, CarritoDeCompras pedido, int monto, Usuario usuario){
        if (pedido.getMonto() == monto) {
            ServicioExterno.emitirFactura(medioDePago, monto, usuario.getId(), this.id);
        }
    }
    // para mi este de aceptar pago tendria q estar directamente en vendedor

    // TODO: 16/9/2022 hacer excepciones try...catch por si se confundio la contrasenia al entrar
    // TODO: 16/9/2022 como autentifico los usuarios de vendedores y gestores?

}
