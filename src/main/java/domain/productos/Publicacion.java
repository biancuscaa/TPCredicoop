package domain.productos;

import domain.AreaDePersonalizacion;
import domain.EstadoDePublicacion;
import domain.Imagen;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Publicacion extends Producto {
    private int precio;
    private EstadoDePublicacion estadoDePublicacion;
    private List<String> frasesDePersonalizacion;
    private List<Imagen> imagenesDePersonalizacion;
    private List<AreaDePersonalizacion> areasDePersonalizacion;

    public Publicacion() {
        this.areasDePersonalizacion = new ArrayList<>();
        this.frasesDePersonalizacion = new ArrayList<>();
        this.imagenesDePersonalizacion = new ArrayList<>();
    }

    public void setPrecio(int aumento) {
        if (super.getAutenticador().esVendedor(super.getAdmin())) {
            this.precio = super.getPrecioBase() + aumento;
        }
    }

    public void setEstadoDePublicacion(EstadoDePublicacion.estadoDePublicacion) {
        if (super.getAutenticador().esVendedor(super.getAdmin())) {
            this.estadoDePublicacion = estadoDePublicacion;
        }
    }

    public void agregarFrases(String fraseNueva) {
        if (super.getAutenticador().esVendedor(super.getAdmin())) {
            frasesDePersonalizacion.add(fraseNueva);
        }
    }

    public void agregarImagenes(Imagen imagenNueva) {
        if (super.getAutenticador().esVendedor(super.getAdmin())) {
           imagenesDePersonalizacion.add(imagenNueva);
        }
    }

    public void agregarAreasDePersonalizacion (AreaDePersonalizacion areaNueva) {
        if (super.getAutenticador().esVendedor(super.getAdmin()) {
            areasDePersonalizacion.add(areaNueva);
        }
    }
    public void printAreasDePersonalizacion(){
        areasDePersonalizacion.forEach(a -> {
            System.out.println(a.getNombre());
            a.getTiposDePersonalizacion();
        });
    }
    public void printFrasesDePersonalizacion(){
        imagenesDePersonalizacion.forEach(i -> {System.out.println(i);});
    }
    public void printImagenesDePersonalizacion(){
        frasesDePersonalizacion.forEach(f-> {System.out.println(f);});
    }
    public void printPublicacion(){
        System.out.println(super.getNombre());
        System.out.println(super.getDescripcion());
        System.out.println(super.getTiempoDeFabricacion() + "dias");

        System.out.println(this.getPrecio() + "pesos");
        this.printAreasDePersonalizacion();
        this.printFrasesDePersonalizacion();
        this.printImagenesDePersonalizacion();
    }
}

    // TODO: 13/9/2022 tendria que poner en la parte de agregarAreasdePersonalizacion que se pueda verificar que
    //el area de personalizacion esta disponibles en el super.producto


