
public final class Moto extends Vehiculo {
    private String estilo;
    private int medidaManillar;

    public Moto() {
        this.estilo = "";
        this.medidaManillar = 0;
    }

    public Moto(String estilo, int medidaManillar, String patente, String rut, int precioServicioNeto, int iva, int totalPorPagar) {
        super(patente, rut, precioServicioNeto, iva, totalPorPagar);
        this.estilo = estilo;
        this.medidaManillar = medidaManillar;
    }

    public int getMedidaManillar() {
        return medidaManillar;
    }

    public void setMedidaManillar(int medidaManillar) {
        this.medidaManillar = medidaManillar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "estilo=" + estilo + 
                ", medidaManillar=" + medidaManillar;
    }

    @Override
    public void totalPorPagar() {
        int resultado = this.getPrecioServicioNeto()+ this.getIva();
        this.setTotalPorPagar(resultado);
    }

    @Override
    public void totalConIVA() {
        double resultado = this.getPrecioServicioNeto() * IVA;
        this.setIva((int)resultado);
    }

    @Override
    public void obtenerDescuento() {
        double resultado = this.getPrecioServicioNeto() * DESCUENTO_MOTO;
        resultado = this.getPrecioServicioNeto() - resultado ;
        this.setPrecioServicioNeto((int)resultado);
        
    }
    public void obtenerDescuento(int descuento) {
        double resultado = this.getPrecioServicioNeto() * descuento;
        resultado = this.getPrecioServicioNeto() - resultado ;
        this.setPrecioServicioNeto((int)resultado);
        
    }
    
}
