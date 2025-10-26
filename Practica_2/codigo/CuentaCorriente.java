public class CuentaCorriente {

    // Atributos
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaCorriente(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // Método para realizar un depósito
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para realizar un reintegro (retiro)
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else if (cantidad > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes para retirar " + cantidad + " €.");
        } else {
            throw new IllegalArgumentException("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método para consultar el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para obtener el número de cuenta
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    // Representación en texto del objeto
    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
