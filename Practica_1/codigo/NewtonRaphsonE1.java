import java.util.Scanner;
import java.lang.Math;

public class NewtonRaphsonE1 {

    public static double f(double x){
            return Math.cos(x) - Math.pow(x, 3);
    }

    public static double g(double x){
            return -Math.sin(x) - 3*Math.pow(x, 2);
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el número de interacciones: ");
        int n = s.nextInt();
        System.out.print("Introduce x0: ");
        double x0 = s.nextDouble();

        double xN = x0;
        double xN1 = 0;
        
        for(int i = 1; i <= n; ++i){
            xN1 = xN - f(xN) / g(xN);

            System.out.println("Iteraccion: "+i + " | Aproximacion: "+xN1);
            xN = xN1;
        }

        System.out.println("Resultado final: "+xN1);
        
        s.close();
        
    }  
}
