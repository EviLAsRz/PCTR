public class Usa_hebraE1{

    public static void main(String[] args) throws Exception{
        hebraE1 h1 = new hebraE1(10000,0);
        hebraE1 h2 = new hebraE1(10000,1);
        h1.start();h2.start();
        h1.join();h2.join();
        System.out.println("Valor final de la variable n: "+hebraE1.n);
    }
}
