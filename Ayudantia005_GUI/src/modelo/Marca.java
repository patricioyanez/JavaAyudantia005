
package modelo;


public class Marca {
    private int id;
    private String nombre;
    private boolean habilitado;

    public Marca() {
        this.id = 0;
        this.nombre = "";
        this.habilitado = false;
    }
    
    public Marca(int id, String nombre, boolean habilitado) {
        this.id = id;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
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
    
    
}
