// Crear un menu que permita ingresar nombres y 
// apellidos y por otra parte sus notas y otra para listarlos.
// Solicitar los datos por teclado.
import java.util.ArrayList;
import java.util.Scanner;
public class Principal2 {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<Integer> notas = new ArrayList<Integer>();
        Scanner leerTeclado = new Scanner(System.in);
        int opcion = 0;
        while(true)
        {
            System.out.println("***** Menú *****");
            System.out.println("1.-Ingresar nombre y nota");
            System.out.println("2.-Listar");
            System.out.println("3.-Salir");
            opcion = leerTeclado.nextInt();
            if(opcion == 3)
                break;
            if(opcion == 1)
            {
                System.out.println("Ingrese nombre:");
                String nombre = leerTeclado.next();
                System.out.println("Ingrese nota:");
                int nota = leerTeclado.nextInt();
                nombres.add(nombre);
                notas.add(nota);
                System.out.println("|=========> Datos guardados");
            }
            else if(opcion == 2)
            {
                System.out.println("**** Listado de notas *****");
                for (int i = 0; i < nombres.size(); i++) {
                    System.out.println("Nombre: " + 
                            nombres.get(i) +
                            " NOTA: " +
                            notas.get(i)
                            );
                }
                System.out.println("|=========> Fin");
            }
        }
        
    }
}
