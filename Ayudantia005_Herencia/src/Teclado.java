
public class Teclado extends Producto {
    private int cantidadTeclas;
    private Boolean esMecanico;

    public Teclado() {
        this.cantidadTeclas = 0;
        this.esMecanico = false;
    }

    public Teclado(int cantidadTeclas, Boolean esMecanico, int id, String nombre, String marca, int precio) {
        super(id, nombre, marca, precio);
        this.cantidadTeclas = cantidadTeclas;
        this.esMecanico = esMecanico;
    }

    public Boolean getEsMecanico() {
        return esMecanico;
    }

    public void setEsMecanico(Boolean esMecanico) {
        this.esMecanico = esMecanico;
    }

    public int getCantidadTeclas() {
        return cantidadTeclas;
    }

    public void setCantidadTeclas(int cantidadTeclas) {
        this.cantidadTeclas = cantidadTeclas;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nCantidad de Teclas   = " + cantidadTeclas + 
                "\nEs Mecánico          = " + esMecanico;
    }
    
    
    
}
