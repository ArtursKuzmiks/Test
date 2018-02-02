import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class konkurs3111reb779 {

    private static volatile int y;

    public static void main(String[] args) throws IOException{
        System.out.println("Ievadiet skaitlus: ");
        try {
            System.out.println("Rezult: "+count(10));
        } catch (IllegalArgumentException e) {
            System.out.println("Input error");
        }
    }
    private static int count(int x) throws IOException{
        int b=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(x>0){
            int n;
            n = Integer.parseInt(br.readLine());
            if(x==1)
                konkurs3111reb779.y=n;
            b=count(x-1);
            if(konkurs3111reb779.y!= n)
                b++;
        }
        return b;
    }
}