public class Usa_hebraE2 {
    
    public static void main(String[] args) throws Exception{
        Thread h1 = new Thread(new hebraE2(10000,0));
        Thread h2 = new Thread(new hebraE2(10000,1));
        h1.start();h2.start();
        h1.join();h2.join();

        System.out.println("Valor final de la variable n: "+hebraE2.n);
    }
}
