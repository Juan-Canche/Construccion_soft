public class Cliente {
    // Numeros magicos transformados a constantes lo que genera mayor contexto en los metodos.
    // Antes los valores estaban escritos directamente dentro del metodo.
    private static final String CATEGORIA_PREMIUM = "PREMIUM";
    private static final int ANIOS_ANTIGUEDAD_PARA_DESCUENTO_MAYOR = 5;
    private static final double PORCENTAJE_DESCUENTO_MAYOR = 0.20;
    private static final double PORCENTAJE_DESCUENTO_MENOR = 0.10;
    private static final double SIN_DESCUENTO = 0;

    // Antes los atributos eran de acceso directo ahora son
    // private final y solo se asignan en el constructor
    private final String nombre;
    private final String categoria; // "PREMIUM" o "ESTANDAR"
    private final int aniosAntiguedad;

    // constructor agregado, algo que no tenia el codigo anterior. Se considera buena practica tener el constructor
    // Asi el Cliente siempre se crea con
    // todos sus datos y no puede quedar sin categoria
    public Cliente(String nombre, String categoria, int aniosAntiguedad) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.aniosAntiguedad = aniosAntiguedad;
    }

    // metodos de acceso agregados, anteriormente carecian de ello
    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    // Aplicar (Move Method): este método antes estaba en Pedido. Se movio a cliente
    // aqui porque usa categoria y aniosAntiguedad, que son atributos de
    // Cliente. Del Pedido solo necesita el monto, por eso lo recibe como
    // parametro.
    public double calcularDescuento(double monto) {
        // Antes era cliente.categoria.equals("PREMIUM"), ahora se
        // usa directamente el atributo propio y la constante
        if (categoria.equals(CATEGORIA_PREMIUM)) {
            // Antes era cliente.aniosAntiguedad > 5
            if (aniosAntiguedad > ANIOS_ANTIGUEDAD_PARA_DESCUENTO_MAYOR) {
                return monto * PORCENTAJE_DESCUENTO_MAYOR;
            }
            return monto * PORCENTAJE_DESCUENTO_MENOR;
        }
        return SIN_DESCUENTO;
    }
}
