import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ld2171rdb143 {

    public static void main(String[] args)  throws IOException{
        // musu majniegie
        double g;
        double a;
        double t,x,y,v0;
        // true/false lai zinatu trapijam vai ne
        boolean hitTarget;

        g=8.88;
        a=55;
        hitTarget=false;

        System.out.println("Uģis Zvejnieks 6.gr. 171RDB143");
        System.out.print("V0=");

        // lasam musu lenki

        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        // readeru inicializacija

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            // ievaditais string to double
            v0=Double.parseDouble(br.readLine());
        }catch (IllegalArgumentException e){
            // skatamies vai ievaditie dati ir skaitli ja ir ok, ja ne izmetam pazinojumu
            System.out.println("input-output error");
            return;
        }

        // tabulas galvene

        System.out.println("t  \t  x \t  y");

        // musu skaitisanas ciks

        t=0.05;

        do{
            x = v0 * t * Math.cos(Math.toRadians(a));
            y = v0 * t * Math.sin(Math.toRadians(a)) - (g * t * t / 2);
            System.out.printf("%3.2f\t%7.3f\t%7.3f\n", t, x, y);
            if (x >= 14 && x <= 17 && y<=10 && y>=8)
                hitTarget = true;
            t += 0.05;
        }while((x<12&&y>=0)||(x>=12&&x<14&&y>=8)||(x>=14&&x<=17&&y>=10)||(x>17&&y>=8));

        // parbaude jai trapijam

        if (hitTarget)
            // if hitTarget=true;
            System.out.println("The target was destroyed");
        else
            // if hitTarget=false
            System.out.println("Shot off the target");
    }
}
