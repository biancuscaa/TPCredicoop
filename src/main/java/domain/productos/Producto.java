package domain.productos;

import domain.AreaDePersonalizacion;
import domain.usuario.AutenticadorDeUsuario;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Producto {
    private String nombre;
    private int precioBase;
    private String descripcion;
    private String admin;
    private int tiempoDeFabricacion;
    private List<AreaDePersonalizacion> areasDisponibles;

    private AutenticadorDeUsuario autenticador;
    public Producto(AutenticadorDeUsuario autenticador){
        this.autenticador = autenticador;
        this.areasDisponibles= new ArrayList<>();
    }

    protected Producto() {
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
    public void agregarAreaDePersonalizacion(AreaDePersonalizacion nuevaAreaDisponible){
        if (autenticador.esGestor(admin)) {
            this.areasDisponibles.add(nuevaAreaDisponible);
        }
    }
    public void setNombre(String nombre) {
        if (autenticador.esGestor(admin)) {
            this.nombre = nombre;
        }
    }
    public void setPrecioBase(int precioBase) {
        if (autenticador.esGestor(admin)) {
            this.precioBase = precioBase;
        }
    }

    public void setDescripcion(String descripcion) {
        if (autenticador.esGestor(admin)) {
        this.descripcion = descripcion;
        }
    }
    public void setTiempoDeFabricacion(int tiempoDeFabricacion) {
        if (autenticador.esGestor(admin)) {
            this.tiempoDeFabricacion = tiempoDeFabricacion;
        }
    }
    public void printAreasDisponibles() {
        areasDisponibles.forEach(a -> {
            System.out.println(a.getNombre());
            a.getTiposDePersonalizacion();
            });
    }
    public void printProducto(){
        System.out.println(this.getNombre());
        System.out.println(this.getDescripcion());
        System.out.println(this.getPrecioBase() + "pesos");
        System.out.println(this.getTiempoDeFabricacion() + "dias");
        this.printAreasDisponibles();
    }

}