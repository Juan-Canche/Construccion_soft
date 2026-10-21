public class Main {
    // Como los atributos son private final, Main crea los objetos
    // pasando los datos por el constructor.
    public static void main(String[] args) {
        // Caso 1: PREMIUM con más de 5 años (esperado descuento 20%)
        Cliente c1 = new Cliente("Ana", "PREMIUM", 6);
        Pedido p1 = new Pedido(c1, 1000);
        System.out.println("Caso 1 - descuento: " + p1.calcularDescuento() + " (esperado: 200.0)");
        System.out.println("Caso 1 - total: " + p1.total() + " (esperado: 800.0)");

        // Caso 2: PREMIUM con 5 años o menos (esperado descuento 10%)
        Cliente c2 = new Cliente("Luis", "PREMIUM", 3);
        Pedido p2 = new Pedido(c2, 1000);
        System.out.println("Caso 2 - descuento: " + p2.calcularDescuento() + " (esperado: 100.0)");
        System.out.println("Caso 2 - total: " + p2.total() + " (esperado: 900.0)");

        // Caso 3: ESTANDAR (esperado descuento 0)
        Cliente c3 = new Cliente("Marta", "ESTANDAR", 10);
        Pedido p3 = new Pedido(c3, 1000);
        System.out.println("Caso 3 - descuento: " + p3.calcularDescuento() + " (esperado: 0.0)");
        System.out.println("Caso 3 - total: " + p3.total() + " (esperado: 1000.0)");
    }
}
