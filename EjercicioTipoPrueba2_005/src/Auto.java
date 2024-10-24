public final class Auto extends Vehiculo{
    private int cantidadPuerta;
    private int capacidadMaletero;

    public Auto() {
        this.cantidadPuerta = 0;
        this.capacidadMaletero = 0;
    }

    public Auto(int cantidadPuerta, int capacidadMaletero, String patente, String rut, int precioServicioNeto, int iva, int totalPorPagar) {
        super(patente, rut, precioServicioNeto, iva, totalPorPagar);
        this.cantidadPuerta = cantidadPuerta;
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(int capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getCantidadPuerta() {
        return cantidadPuerta;
    }

    public void setCantidadPuerta(int cantidadPuerta) {
        this.cantidadPuerta = cantidadPuerta;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "cantidadPuerta=" + cantidadPuerta + 
                ", capacidadMaletero=" + capacidadMaletero ;
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
        double resultado = this.getPrecioServicioNeto() * DESCUENTO_AUTO;
        resultado = this.getPrecioServicioNeto() - resultado ;
        this.setPrecioServicioNeto((int)resultado);
        
    }
    public void obtenerDescuento(int descuento) {
        double resultado = this.getPrecioServicioNeto() * descuento;
        resultado = this.getPrecioServicioNeto() - resultado ;
        this.setPrecioServicioNeto((int)resultado);
        
    }
    
}
