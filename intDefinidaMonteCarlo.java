import java.util.Scanner;
import java.lang.Math;
/*
Procedimiento Monte-Carlo (n)
contador_exitos <- 0
Para i <- 0 Hasta n Con Paso 1 Hacer
  coordenada_x <- aleatorio (0,1)
  coordenada_y <- aleatorio (0,1)
Si coordenada_y <= f(coordenada_x)
  contador_exitos <- contador_exitos + 1
Fin Si
Fin Para
Escribir “Integral aproximada: “, (contador_exitos/n)
Fin Procedimiento
*/
public class intDefinidaMonteCarlo {
    public static void main (String [] args) {
        double contador_exitos1 = 0;
        double contador_exitos2 = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el número de iteraciones:");
        double n = s.nextInt();

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            if (y <= f(x)) contador_exitos1 ++;
            if (y <= g(x)) contador_exitos2 ++;
        }

        System.out.println("Integral aproximada f(x) = sin: " + (contador_exitos1/n));
        System.out.println("Integral aproximada g(x) = x: " + (contador_exitos2/n));
        s.close();
    }

    public static double f (double x) { return Math.sin(x); }
    public static double g (double x) { return x; }
}
