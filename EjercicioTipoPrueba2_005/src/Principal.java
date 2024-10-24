
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto(5, 500, "QAWS30", "1-9", 10000, 1900, 11900);
        Moto moto1 = new Moto("Deportiva", 50, "MTMT50",  "2-7", 20000, 3800, 23800);
        Moto moto2 = new Moto("Deportiva", 50, "MTMT51", "2-7", 20000, 3800, 23800);
        
        Taller taller = new Taller();
        
        taller.agregar(auto1);
        taller.agregar(moto1);
        taller.agregar(moto2);
        
        System.out.println("El total a pagar patente QAWS30 es:");
        auto1.obtenerDescuento();
        auto1.totalConIVA();
        auto1.totalPorPagar();
        System.out.println(auto1);
        
        System.out.println("");
        taller.listar();
        System.out.println("");
        taller.contabilizar();
    }
    
}
