
public class Mouse extends Producto{
    private int cantidadBotones;
    private Boolean esOptico;

    public Mouse() {
        this.cantidadBotones = 2;
        this.esOptico = true;
    }

    public Mouse(int cantidadBotones, Boolean esOptico, int id, String nombre, String marca, int precio) {
        super(id, nombre, marca, precio);
        this.cantidadBotones = cantidadBotones;
        this.esOptico = esOptico;
    }

    public int getCantidadBotones() {
        return cantidadBotones;
    }

    public void setCantidadBotones(int cantidadBotones) {
        this.cantidadBotones = cantidadBotones;
    }

    public Boolean getEsOptico() {
        return esOptico;
    }

    public void setEsOptico(Boolean esOptico) {
        this.esOptico = esOptico;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCantidad de Botones  = " + cantidadBotones + 
                "\nEs Optico            = " + (esOptico?"Si":"No");
    }
    
    
}
