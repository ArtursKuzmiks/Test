import java.util.Scanner;

public class test3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double g = 8.88, a = 45;
        double t, x=0, y=0, v0;
        boolean hitTarget = false;

        System.out.println("Arturs Kuzmiks 12.gr. 111REB779");
        System.out.print("V0=");
        if (sc.hasNextDouble())
            v0 = sc.nextDouble();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();

        System.out.println("t  \t  x \t  y");

        t = 0.05;
        while ((x<10&&y>=0)||(x>=10&&x<15&&y>=4)||(x>=15&&x<=18&&y>=6)||(x>18&&y>=4)){
            x = v0 * t * Math.cos(Math.toRadians(a));
            y = v0 * t * Math.sin(Math.toRadians(a)) - (g * t * t / 2);
            System.out.printf("%3.2f\t%7.3f\t%7.3f\n", t, x, y);
            if (x >= 15 && x <= 18 && y<=6 && y>=4)
                hitTarget = true;
            t += 0.05;
        }

        if (hitTarget)
            System.out.println("The target was destroyed");
        else
            System.out.println("Shot off the target");

    }
}