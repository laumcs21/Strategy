package co.edu.uniquindio.poo;

public class Matematicas {
    private Operacion operacion;

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    public int realizarOperacion(int a, int b) {
        return operacion.realizarOperacion(a, b);
    }
}
