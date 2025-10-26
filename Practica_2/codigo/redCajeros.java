public class redCajeros {
    public static void main(String[] args) throws Exception {
        CuentaCorriente cuenta = new CuentaCorriente("123-456-789", 5000.0);

        Thread cajero1 = new Thread(new cajero(cuenta, 500, 0));
        Thread cajero2 = new Thread(new cajero(cuenta, 500, 1));
        Thread cajero3 = new Thread(new cajero(cuenta, 500, 0));
        Thread cajero4 = new Thread(new cajero(cuenta, 500, 1));

        cajero1.start();
        cajero2.start();
        cajero3.start();
        cajero4.start();
        
        //si no uso join puede que el main termine antes que los hilos, provocando que no se vea el saldo final correcto
        /* 
        cajero1.join();
        cajero2.join();
        cajero3.join();
        cajero4.join();
        */
        
        System.out.println("Saldo final de la cuenta: " + cuenta.getSaldo() + " €.");
    }
}
