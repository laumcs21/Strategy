package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Matematicas accion = new Matematicas();

        // Usamos la estrategia de suma
        accion.setOperacion(new Suma());
        int result1 = accion.realizarOperacion(10, 5);
        System.out.println("10 + 5 = " + result1);

        // Cambiamos a la estrategia de resta
        accion.setOperacion(new Resta());
        int result2 = accion.realizarOperacion(10, 5);
        System.out.println("10 - 5 = " + result2);
    }
}