
public class Vehiculo {
    private String patente;
    private String marca;
    private String modelo;
    private int costoServicio;
    private Cliente cliente;

    public Vehiculo() {
        this.patente = "";
        this.marca = "";
        this.modelo = "";
        this.costoServicio = 0;
        this.cliente = null; //new Cliente();
    }
    
    public Vehiculo(String patente, String marca, String modelo, int costoServicio, Cliente cliente) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.costoServicio = costoServicio;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(int costoServicio) {
        this.costoServicio = costoServicio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", costoServicio=" + costoServicio + ", cliente=" + cliente + '}';
    }
    
    public void aplicarDescuento()
    {
        // calculos según las reglas
    }
    
    public void enviarCorreo(){
        // sout
    }
}
