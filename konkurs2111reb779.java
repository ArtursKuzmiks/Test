import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class konkurs2111reb779 {
    public static void main(String[] args){
        int A[][];
        String x,y;
        int i,j,k,n,m,c=1;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Ievadiet matricas rindas skaitu: ");
            x = br.readLine();
            System.out.print("Ievadiet matricas kolonnas skaitu: ");
            y = br.readLine();
            n = Integer.parseInt(x);
            m = Integer.parseInt(y);
            if(Integer.parseInt(x)<1 || Integer.parseInt(y)<1)
                throw new IOException();
        }catch (IOException e){
            System.out.println("input-output error");
            return;
        }

        A = new int [n][m];

        k=1;
        ext:
        while (k<n*m) {

        for (i=n-k;i>=k;i--){  // kreisa puse no apakšas uz augšu
            if (A[i][k-1]==0) A[i][k-1]=c++;
            else break ext;
        }

        for(i=k-1;i<m-k+1;i++){ // horizontāli no kreisas puses pa labi
            if (A[k-1][i]==0) A[k-1][i]=c++;
            else break ext;
        }

        for (i=k;i<n-k+1;i++){  // laba puse no augšas uz leju
            if (A[i][m-k]==0) A[i][m-k]=c++;
            else break ext;
        }

        for(i=m-1-k;i>=k;i--) { // horizontāli no labas puses pa kreisi
            if (A[n - k][i] == 0) A[n - k][i] = c++;
            else break ext;
        }
        k++;
        }

        for(i=0;i<Integer.parseInt(x);i++){     //masiva izvade
            for (j=0;j<Integer.parseInt(y);j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }

    }
}
