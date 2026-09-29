public class Main {
    public static void main(String[] args) {
        
        EstrategiaComision personalizada = new ComisionPersonalizada();
        Vendedor vendedor = new Vendedor("Alexander", 1000.0, personalizada);
        
        System.out.println("--- Sistema de Comisiones ---");
        vendedor.mostrarDetalle();
    }
}