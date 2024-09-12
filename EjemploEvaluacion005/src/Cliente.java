
public class Cliente {
    String rut;
    private String nombre;
    private int codigoArea;
    private int fono;
    private boolean esNuevo;
    
    // constructor, getter and setter y toString();

    public Cliente() {
        this.rut = "";
        this.nombre = "";
        this.codigoArea = 0;
        this.fono = 0;
        this.esNuevo = false;
    }
   
    public Cliente(String rut, String nombre, int codigoArea, int fono, boolean esNuevo) {
        this.rut = rut;
        this.nombre = nombre;
        this.codigoArea = codigoArea;
        this.fono = fono;
        this.esNuevo = esNuevo;
    }

    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", nombre=" + nombre + ", codigoArea=" + codigoArea + ", fono=" + fono + ", esNuevo=" + esNuevo + '}';
    }
    
}
