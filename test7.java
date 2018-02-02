
import java.util.Scanner;

public class test7 {

    public static void main(String[] args) {
        double[] A = new double[20];
        double[] B = new double[20];
        int i, n;
        double c,K;
        Scanner sc = new Scanner(System.in);


        System.out.println("Arturs Kuzmiks 12.gr. 111reb779");
        System.out.print("K=");

        if (sc.hasNextDouble())
            K = sc.nextDouble();
        else {
            System.out.println("input-output error");
            sc.close();
            return;
        }
        sc.close();

        if (K >= 0) {
            i = 0;
            do {
                A[i] = -50 + Math.random() * 100;
            } while (++i < 20);
        } else {
            A[0]=0.1;
            for (i=1;i<20;i++)
                A[i]=A[i-1]*K;
        }

        for (i = 0; i < 20; i++) {
            System.out.printf("%.2f\t", A[i]);
            if (i == 4 || i == 9 || i == 14)
                System.out.println();
        }

        System.out.println("\nA:");

        /*n=20;
        for (i = 0; i < n;) {
            if (A[i]< 0) {
                c = A[i];
                for (int j = i; j < 19; j++)
                    A[j] = A[j + 1];
                A[19] = c;
                n--;
            }
            else i++;
        }*/
        /*n=0;
        for(i=0;i<20;i++)
            if(A[i]>=0){
                B[n]=A[i];
                n++;
            }
        for(i=0;i<20;i++)
            if(A[i]<0){
                B[n]=A[i];
                n++;
            }*/
        n=0;
        for(i=0;i<20;i++){
                if(A[i]>=0){
                    B[n]=A[i];
                    n++;
                }
                else{
                    for(int j=n;j<19;j++){
                        B[j]=B[j+1];
                    }
                    B[19]=A[i];
                }
        }

        System.out.println("B:");

        for (i = 0; i < 20; i++) {
            System.out.printf("%.2f\t", B[i]);
            if (i == 4 || i == 9 || i == 14)
                System.out.println();
        }
    }
}
