// Archivo: concursoLambda.java

public class concursoLambda {

    public static void main(String[] args){

        final contadorSync contador = new contadorSync();

        Runnable tarea1 = () -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
            System.out.println("Tarea 1 completada");
        };

        Runnable tarea2 = () -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
            System.out.println("Tarea 2 completada");
        };

        Thread h1 = new Thread(tarea1);
        Thread h2 = new Thread(tarea2);

        h1.start();
        h2.start();

        try{
            h1.join();
            h2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Valor final del contador: " + contador.getValor());
    }
}


