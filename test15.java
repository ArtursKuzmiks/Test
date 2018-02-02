import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test15 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A[][]=new int [10][10];
        String str;
        int i, j, c;
        boolean sn=false;

        System.out.print("Uzdevuma numurs (1 vai 2): ");

        str = br.readLine();

        try {
            Integer.parseInt(str);
        } catch (IllegalArgumentException e) {
            System.out.println("input-output error");
            return;
        }

        switch (Integer.parseInt(str)){
            case 1: c=1;
                for (j=3;j<=7;j++)
                    for(i=6-j;i<=j;i++)
                        if (i>=0){
                            A[i][j]=c;c++;
                        }
                break;
            case 2: c=1;
                for (j=3;j<9;j++)
                    if(!sn){
                        for (i=j-2;i<7;i++)
                            A[i][j] = c++;
                        sn=true;
                    }
                    else{
                        for(i=6;i>=j-2;i--)
                            A[i][j]= c++;
                        sn=false;
                    }
                break;
            default:
                System.out.println("input-output error");
                return;
        }

        for (i=0;i<10;i++){
            for (j=0;j<10;j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }
    }
}
