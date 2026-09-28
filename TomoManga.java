package Ejercicio7_tomoManga;

public class TomoManga {
    private String tituloObra;
    private int numeroVolumen;
    private double precioCompra;
    private boolean leido;

    public TomoManga(String tituloObra, int numeroVolumen, double precioCompra) {
        this.tituloObra = tituloObra;
        setNumeroVolumen(numeroVolumen);
        setPrecioCompra(precioCompra);
        this.leido = false;
    }

    public void setNumeroVolumen(int numeroVolumen) {
        if (numeroVolumen < 0) {
            throw new IllegalArgumentException("El número de volumen no puede ser negativo.");
        }
        this.numeroVolumen = numeroVolumen;
    }

    public void setPrecioCompra(double precioCompra) {
        if (precioCompra < 0) {
            throw new IllegalArgumentException("El precio de compra no puede ser negativo.");
        }
        this.precioCompra = precioCompra;
    }

    public void marcarComoLeido() {
        leido = true;
    }

    public void estadoLectura() {
        String estado = leido ? "finalizado" : "pendiente";
        System.out.println(tituloObra + " vol. " + numeroVolumen + ": " + estado);
    }
}
