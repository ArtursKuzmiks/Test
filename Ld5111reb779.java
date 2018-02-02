import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ld5111reb779 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A[][]=new int [10][10];
        String str;
        int i, j, c;

        System.out.println("Arturs Kuzmiks 12.gr. 111reb779");
        System.out.print("Uzdevuma numurs (1 vai 2): ");

        str = br.readLine();

        try {
            Integer.parseInt(str);
        } catch (IllegalArgumentException e) {
            System.out.println("input-output error");
            return;
            /*System.out.println(e.toString());
            System.out.print("Uzdevuma numurs (1 vai 2): ");
            str = br.readLine();*/
        }

        switch (Integer.parseInt(str)){
            case 1: c=1;
                    for (j=9;j>=0;j--)
                        for(i=j-3;i<=j;i++)
                            if (i>=0){
                                A[i][j]=c;c++;
                            }
                    break;
            case 2: for (i=0;i<9;i++)
                        //for (j=0;j<=8-i;j++)
                        //fill array from 0 index j
                        for (j=8-i;j>=0;j--)
                            A[i][j] = 1+i+j;
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
