import java.util.Random;
import java.util.Scanner;

public class test6 {

    public static void main(String[] args) {
        int[] A = new int[30];
        int K, i, m ,n=0;
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
            i=0;
            do{
                A[i]=r.nextInt(11);
            } while(++i<30);
        }
        else {
            m = K;
            i=0;
            do{
                A[i]=n++;
                if(i==m){
                    n=0;
                    m+=K+1;
                }
            }while(++i<30);
        }

        System.out.println("A:");

        for (i=0;i<30;i++){
            System.out.printf("%d\t",A[i]);
            if (i==9||i==19)
                System.out.println();
        }

        /*for(i=0;i<30;i++){
            if(A[i]==0){
                for(int j=i;j<29;j++)
                    A[j] = A[j + 1];
                if(A[29]!=0) A[29]=0;
            }
            if(A[i]==0){
                for(int j=i;j<29;j++)
                    A[j] = A[j + 1];
            }
        }*/
        for (i=0;i<30;i++)
            for(int j=0;j<29;j++)
                if(A[j]>A[j+1]){
                    K=A[j];
                    A[j]=A[j+1];
                    A[j+1]=K;
                }

        System.out.println("\nA:");
        i=0;
        while (i<30){
            System.out.printf("%d\t",A[i]);
            if (i==9 || i==19)
                System.out.println();
            i++;
        }

    }
}
