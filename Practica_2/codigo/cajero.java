public class cajero implements Runnable {
    private CuentaCorriente cuenta;
    private int cantidad;
    private int tipoOperacion; // 0 para depósito, 1 para retiro

    public cajero(CuentaCorriente cuenta, int saldo, int tipoOperacion) {
        this.cuenta = cuenta;
        this.cantidad = saldo;
        this.tipoOperacion = tipoOperacion;
    }

    public void run() {
        switch(tipoOperacion) {
            case 0:
                cuenta.depositar(cantidad);
                break;
            case 1:
                cuenta.retirar(cantidad);
                break;
        }
    }
}