public class escalaVector {
    static int[] v = new int[1000000]; 
    int escalar = 3;

    public void escalado(){
        for (int i=0;i<1000000;++i){
            v[i]=v[i]*escalar;
        }
    }
    public static void main (String[] args){
        for(int i=0;i<1000000;++i){
            v[i]=(int)(Math.random()* 100) + 1;
        }
        escalaVector eV = new escalaVector();
        eV.escalado();
    }
}


