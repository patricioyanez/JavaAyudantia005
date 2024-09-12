import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        Cliente cliente = new Cliente();
        Vehiculo vehiculo = new Vehiculo();
        
        while(true)
        {
            System.out.println("==== Menú ====");
            System.out.println("1.- Crear Vehiculo y Cliente ");
            System.out.println("2.- Mostrar información");
            System.out.println("3.- Ingresar costo del servicio y descuento");
            System.out.println("4.- Enviar correo");
            System.out.println("5.- Salir");
            System.out.print("Ingrese opción: ");
            opcion = leerTeclado.nextInt();
            
            if(opcion == 1)
            {
                
            }
            else if(opcion == 2)
            {
                
            }
            else if(opcion == 3)
            {
                
            }
            else if(opcion == 4)
            {
                
            }
            else if(opcion ==5)
            {
                break;
            }
            else
            {
                System.out.println("======> ERROR: Opción no es válida");
            }
        }
    }
    
}
