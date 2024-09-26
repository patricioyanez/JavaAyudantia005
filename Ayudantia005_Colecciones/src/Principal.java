import java.util.ArrayList;


public class Principal {

    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        
        String nombre1 = "Ana";
        String nombre2 = new String("Pedro");
        nombres.add("Luis");
        nombres.add(nombre1);
        nombres.add(nombre2);
        // foreach
        for(String nombre: nombres)
        {
            System.out.println("Nombre: " + nombre);
        }
        
    }
    
}
