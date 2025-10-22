public class escalaVPar implements Runnable{
    static int max = 1000000;
    static int[] v = new int[max];
    int[] vParalelo; 
    int escalar = 3;

    public escalaVPar(int[] vParalelo){this.vParalelo = vParalelo;};

    public void escalado(){
        for (int i=0;i<vParalelo.length;++i){
            v[i]=v[i]*escalar;
        }
    }   
    public void run(){
        escalado();
    };
    public static void main (String[] args) throws Exception{
        for(int i=0;i<v.length;++i){
            v[i]=(int)(Math.random()* 100) + 1;
        }
        int[] vAux1 = new int[max/4];
        int[] vAux2 = new int[max/4];
        int[] vAux3 = new int[max/4];
        int[] vAux4 = new int[max/4];
        
        int contador;
        for(contador=0;contador<v.length/4;++contador){
            vAux1[contador] = v[contador];
        }
        for(;contador<v.length/2;++contador){
            vAux2[contador] = v[contador];
        }
        

        Thread eV1 = new Thread(new escalaVPar());
        Thread eV2 = new Thread(new escalaVPar());
        Thread eV3 = new Thread(new escalaVPar());
        Thread eV4 = new Thread(new escalaVPar());

        eV1.start();eV2.start();eV3.start();eV4.start();
        eV1.join();eV2.join();eV3.join();eV4.join();
    }
}
