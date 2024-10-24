
public abstract class Vehiculo implements IOperaciones {
    private String patente;
    private String rut;
    private int precioServicioNeto;
    private int iva;
    private int totalPorPagar;

    public Vehiculo() {
        this.patente = "";
        this.rut = "";
        this.precioServicioNeto = 0;
        this.iva = 0;
        this.totalPorPagar = 0;
    }
        
    public Vehiculo(String patente, String rut, int precioServicioNeto, int iva, int totalPorPagar) {
        this.patente = patente;
        this.rut = rut;
        this.precioServicioNeto = precioServicioNeto;
        this.iva = iva;
        this.totalPorPagar = totalPorPagar;
    }

    public int getTotalPorPagar() {
        return totalPorPagar;
    }

    public void setTotalPorPagar(int totalPorPagar) {
        this.totalPorPagar = totalPorPagar;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getPrecioServicioNeto() {
        return precioServicioNeto;
    }

    public void setPrecioServicioNeto(int precioServicioNeto) {
        this.precioServicioNeto = precioServicioNeto;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "patente=" + patente + 
                ", rut=" + rut + 
                ", precioServicioNeto=" + precioServicioNeto + 
                ", iva=" + iva + 
                ", totalPorPagar=" + totalPorPagar;
    }
    
    public abstract void totalPorPagar();
    
}
