public class contadorSync {
    private int valor = 0;
    public synchronized void incrementar() {
        valor++;
    }

    public int getValor() {
        return valor;
    }
}
