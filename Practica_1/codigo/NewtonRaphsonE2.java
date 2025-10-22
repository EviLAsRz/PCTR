import java.util.Scanner;
import java.lang.Math;

public class NewtonRaphsonE2 {
    
    public static double f(double x){
        return Math.pow(x, 2) - 5;
    }

    public static double g(double x){
        return 2*x;
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el número de iteracciones: ");
        int n = s.nextInt();
        System.out.print("Introduce x0: ");
        double x0 = s.nextDouble();

        double xN = x0;
        double xN1 = 0;

        for(int i = 0; i <= n; ++i){
            xN1 = xN - f(xN) / g(xN);
            System.out.println("Iteracción "+i+" | Aproximacion: "+xN1);
            xN = xN1;
        }

        System.out.println("Resultado Final: "+xN1);
        s.close();
    }
}
