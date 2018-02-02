import java.util.Random;
import java.util.Scanner;

public class Ld3111reb779 {

    public static void main(String[] args) {
        int[] A = new int[20];
        int K, i ,n;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Arturs Kuzmiks 12.gr. 111reb779");
        System.out.print("K=");

        if (sc.hasNextInt())
            K = sc.nextInt();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();

        if (K<=0){
            for (i=0;i<10;i++)
                A[i]=r.nextInt(51);
        }
        else {
            A[0]=1;
            for (i=1;i<20;i++)
                A[i] =A[i-1]+K;
        }

        System.out.println("A:");
        for (i=0;i<20;i++){
            System.out.printf("%d\t",A[i]);
            if (i==9)
                System.out.println();
        }

        i=1;
        while(i<10){
            n=i;
            while(n<19){
                A[n] = A[n+1];
                if (A[A.length-1]!= 0 )
                    A[A.length-1] = 0;
                n++;
                }
            i++;
            }

        System.out.println("\nA:");
        i=0;
        do{
            System.out.printf("%d\t",A[i]);
            if (i==9)
                System.out.println();
        } while (++i<=19);

    }
}
