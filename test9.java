import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class test9 {

    public static void main(String[] args) throws IOException{

        int A[] = new int[10];
        int B[] = new int[10];
        int C[] = new int[20];
        int K, i,n;
        String str;

        System.out.println("test");

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("K: ");

            str = br.readLine();
            K=Integer.parseInt(str);

            if(K==0){
                Random r = new Random();
                for (i=0; i<10; i++){
                    A[i] = r.nextInt(21)-10;
                    B[i] = r.nextInt(101)-50;
                }
            }else{
                for (i=0; i<10; i++){
                    A[i] = (int) Math.pow(-1,i)*(i-K);
                    B[i] = (int) Math.pow(-1,i)*(i-5)*K;
                }
            }

        }catch (IllegalArgumentException e){
            System.out.println("input-output error");
            return;
        }

        System.out.println("A:");
        for (i=0; i<10; i++) {
            System.out.print( A[i]+"\t");
        }
        System.out.println("\nB:");
        for (i=0;i<10;i++){
            System.out.print(B[i] + "\t");
        }

        n=0;
        int m,l,z,x,c;

        m=findNeg(A);
        l=findNeg(A)+findNeg(B);
        z=findNeg(A)+findNeg(B)+findNul(A);
        x=20-findPoz(A)-findPoz(B);
        c=20-findPoz(B);

        for(i=0;i<10;i++){
            if (A[i]<0){
                C[n]=A[i];
                n++;
            }
            if(B[i]<0){
                C[m]=B[i];
                m++;
            }
            if(A[i]==0){
                C[l]=A[i];
                l++;
            }
            if(B[i]==0){
                C[z]=B[i];
                z++;
            }
            if(A[i]>0){
                C[x]=A[i];
                x++;
            }
            if(B[i]>0){
                C[c]=B[i];
                c++;
            }
        }

        System.out.println("\nC:");
        for (i=0; i<20;i++) {
            System.out.print(C[i]+ "\t");
            if (i==9) System.out.println();
        }
    }
    private static int findNeg(int[] c){
        int neg=0;

        for(int i=0;i<10;i++)
            if(c[i]<0) neg++;
        return neg;
    }
    private static int findNul(int[] c){
        int nul=0;

        for(int i=0;i<10;i++)
            if(c[i]==0) nul++;
        return nul;
    }
    private static int findPoz(int[] c){
        int poz=0;

        for(int i=0;i<10;i++)
            if(c[i]>0)  poz++;
        return poz;
    }
}
