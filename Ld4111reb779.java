import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ld4111reb779 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A[][] = {{250, 300, 250, 250, 250},
                {100, 50, 60, 70, 200},
                {250, 100, 70, 150, 200},
                {300, 400, 200, 250, 300},
                {400, 320, 250, 220, 270},
                {200, 200, 200, 200, 200},
                {250, 260, 250, 250, 250},
                {250, 200, 100, 250, 80}};
        String str;
        int i, j,s=0;
        int Count;
        Random r = new Random();

        System.out.println("Arturs Kuzmiks 12.gr. 111reb779");
        System.out.print(
                "Aizpildit masivu ar patvaligiem skaitliem (y/n)? ");

        str = br.readLine();

        if (str.equals("Y") || str.equals("y")) {
            for (i=0; i<8; i++)
                for (j=0; j<5; j++)
                    A[i][j] = (r.nextInt(50)*10)+10;
        }
        else
        if (!str.equals("N") && !str.equals("n")) {
            System.out.println("input-output error");
            return;
        }
        for (i=0; i<8; i++) {
            for (j=0; j<5; j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }

        System.out.println("results: ");
        for (i=0; i<8; i++) {
            Count = 0;
            for (j = 0; j < 5; j++) {
                if (A[i][j] < 250) Count++;
            }
            if (Count >= 2) s += 1;
        }
        System.out.print(s);
    }
}
