public class hebraE2 implements Runnable{
    static int n = 0;
    int cont, type;
    public hebraE2(int cont, int type){
        this.cont = cont;
        this.type = type;
    };
    void increment(){++n;};
    void decrement(){--n;};
    int getValue(){return n;};

    public void run(){
        switch (type) {
            case 0: while(cont > 0){        //cuidado con usar print ya que sincroniza lsa operaciones
            increment(); cont --;
            } break;
            case 1: while(cont > 0){
            decrement(); cont --;
            } break;
        }
    }
}