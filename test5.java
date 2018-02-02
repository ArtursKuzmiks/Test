import java.util.InputMismatchException;
import java.util.Scanner;

public class test5 {

    // 79
    // Kaujas vieta: Plūtons
    // g = 0.61
    // Kaujas lauka numurs: C
    // v0 = 3.5
    // leņķis ievadīt no tastatūras
    // delta_t = 0.2s
    public static void main(String[] args) {
        double t, delta_t = 0.2;
        double g = 0.61;
        double v0 = 3.5;
        double x, y;
        double alpha_deg, alpha;
        boolean hitTarget;

        System.out.println("Aleksandrs Želtiševs RDBD0 171RDB079");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("a=");
            alpha_deg = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("input-output error");
            return;
        }
        alpha = Math.toRadians(alpha_deg);

        System.out.println("t  \t  x \t  y");
        t = 0.2;
        x = y = 0;
        while (y >= 0 && !(x >= 7 && x <= 10 && y <= 4) && !(x >= 17 && x  <= 20 && y >= 0 && y <= 3)) {
            x = v0 * t * Math.cos(alpha);
            y = v0 * t * Math.sin(alpha) - (g * Math.pow(t, 2) / 2);
            System.out.printf("%3.2f\t%7.3f\t%7.3f\n", t, x, y);
            t += delta_t;
        }
        hitTarget = x >= 17 && x <= 20 && y >= 0 && y <= 3;
        if (hitTarget) {
            System.out.println("the target was destroyed");
        } else {
            System.out.println("shot off the target");
        }
    }
}