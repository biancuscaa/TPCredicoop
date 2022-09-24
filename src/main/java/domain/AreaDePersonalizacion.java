package domain;

import java.util.ArrayList;
import java.util.List;
public class AreaDePersonalizacion {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private List<TipoDePersonalizacion> tiposDePersonalizacion;
    public AreaDePersonalizacion(){
        this.tiposDePersonalizacion = new ArrayList<>();
    }
    public void getTiposDePersonalizacion() {
        tiposDePersonalizacion.forEach(t-> {
            System.out.println(t.getNombre());
            System.out.println(t.getDescripcion());
        });
    }
    public void agregarTipoDePersonalizacion (TipoDePersonalizacion tipoNuevo){
        this.tiposDePersonalizacion.add(tipoNuevo);
    }
}
