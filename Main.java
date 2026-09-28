package Ejercicio7_tomoManga;

public class Main {
    public static void main(String[] args) {
        TomoManga tomo = new TomoManga("Berserk", 3, 12000.0);
        tomo.estadoLectura();
        tomo.marcarComoLeido();
        tomo.estadoLectura();
    }
}
