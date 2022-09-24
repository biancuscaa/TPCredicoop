package domain.usuario;

import domain.usuario.TipoDeUsuario;
import domain.usuario.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class AutenticadorDeUsuario {
    private List <Usuario> listaDeUsuarios;
    public AutenticadorDeUsuario(){
        this.listaDeUsuarios=new ArrayList<>();
    }
    public void agregarNuevoUsuario(Usuario usuarioNuevo){
        this.listaDeUsuarios.add(usuarioNuevo);
    }
    public boolean esGestor(String usuario){
        for (Usuario u : listaDeUsuarios){
            if (u.getId().equals(usuario) ){
                return u.getTipoDeUsuario().equals(TipoDeUsuario.GESTOR);
            }
        }
        return false;
        //que pasa si subieron un usuario que no existe? habria que hacer un cartel por si se rompe
    }
    public boolean esVendedor(String usuario){
        for (Usuario u : listaDeUsuarios){
            if (u.getId().equals(usuario) ){
                return u.getTipoDeUsuario().equals(TipoDeUsuario.VENDEDOR);
            }
        }
        return false;
        //que pasa si subieron un usuario que no existe? habria que hacer un cartel por si se rompe
    }
}
