import java.util.Scanner;

public class Ld2111reb779 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g = 0.61, v0 = 3.5;
        double t, x, y, a;
        boolean hitTarget = false;

        System.out.println("Arturs Kuzmiks 12.gr. 111REB779");
        System.out.print("Lenkis a (grados)=");
        if (sc.hasNextDouble())
            a = sc.nextDouble();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();

        System.out.println("t  \t  x \t  y");

        t = 0.2;
        do {
            x = v0 * t * Math.cos(Math.toRadians(a));
            y = v0 * t * Math.sin(Math.toRadians(a)) - (g * t * t / 2);
            System.out.printf("%3.2f\t%7.3f\t%7.3f\n", t, x, y);
            if ((x >= 7 && x <= 10 && y <= 4) || y <= 0)
                break;
            if (x >= 17 && x <= 20 && y <= 3) {
                hitTarget = true;
                break;
            }
            t += 0.2;
        } while (true);

        if (hitTarget)
            System.out.println("The target was destroyed");
        else
            System.out.println("Shot off the target");

    }
}