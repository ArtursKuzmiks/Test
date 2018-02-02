import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test12{

    public static void main(String[] args) throws IOException {

        int x;
        int A[][];

        A=new int[10][10];
        x=0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("test(00)");
            System.out.print("Izvadiet uzdevuma numuru (1 vai 2): ");

            x=Integer.parseInt(br.readLine());

        }catch (IllegalArgumentException e){
            System.out.println("Input error");
        }

        switch (x){
            case 1:int c=1;
            for(int j=0;j<10;j++)
                for(int i=j;i<j+3;i++)
                    if(i<10) A[i][j]=c++;
                break;
            case 2:
                for(int j=0;j<9;j++)
                    for(int i=j+1;i<10;i++)
                        A[i][j]=i-j;
                break;
            default:
                System.out.println("input error");
                return;
        }

        for (int [] i:A) {
            for (int j:i) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}