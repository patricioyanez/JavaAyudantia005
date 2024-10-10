
public class Producto {
    private int id;
    private String nombre;
    private String marca;
    private int precio;
    
    public Producto() {
        this.id = 0;
        this.nombre = "";
        this.marca = "";
        this.precio = 0;
    }
    
    public Producto(int id, String nombre, String marca, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return  "\nId       = " + id + 
                "\nNombre   = " + nombre + 
                "\nMarca    = " + marca + 
                "\nPrecio   = " + precio;
    }
    
    
}
