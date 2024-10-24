
import java.util.ArrayList;


public class Taller {
    private ArrayList<Vehiculo> listado = new ArrayList<Vehiculo>();
      public boolean agregar(Vehiculo vehiculo)
    {
        // ejercicio 31: validar que patente no existe para 
        // agregar
        if(this.buscarPorPatente(vehiculo.getPatente()))
            return false;
        return listado.add(vehiculo);
    }
    // Ejercicio 30: crear metodo para saber si la patente ya existe 
    
    public boolean buscarPorPatente(String patente)
    {// for each
        for (Vehiculo vehiculo : listado) {
            if(vehiculo.getPatente().equalsIgnoreCase(patente))
                return true;
        }
        return false;
    }
    public void listar()
    {
        System.out.println("==== Listado de Vehiculos =====");
        for (Vehiculo vehiculo : listado) {
            System.out.println(vehiculo);
        }
    }
    
    public void contabilizar()
    {
        int moto = 0;
        int auto = 0;
        for (Vehiculo vehiculo : listado) {
            if(vehiculo instanceof Moto)
                moto++;
            else
                auto++;
        }
        System.out.println("\n==== Contabilizar los tipos de Vehiculo ====");
        System.out.println("Motos: " + moto);
        System.out.println("Autos: " + auto);
    }
}
