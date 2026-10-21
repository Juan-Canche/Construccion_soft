public class Pedido {
    // Modificacion del acceso a los atributos
    // private final, asignados solo en el constructor.
    private final Cliente cliente;
    private final double monto;

    // constructor agregado, carecia de el en el codigo anterior
    public Pedido(Cliente cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
    }

    // metodos de acceso agregados, anteriormente no tenia.
    public Cliente getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    // Aplicar (Move Method + Hide Delegate): el metodo se queda como
    // delegacion simple hacia Cliente. La regla de descuento ya no esta
    // aqui.
    public double calcularDescuento() {
        return cliente.calcularDescuento(monto);
    }

    public double total() {
        return monto - calcularDescuento();
    }
}
