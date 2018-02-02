import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class test11 {

    public static void main(String[] args) throws IOException {
        String str;
        double [][] A = {{0.5,0.5,0.5,0.5,0.5},
                        {0,1,0,1,1},
                        {0.5,1,0.5,0.5,0},
                        {0,0.5,0,0.5,0},
                        {1,1,1,1,1},
                        {0,0,0,0.5,0.5},
                        {0,0.5,0,0,1}};

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("test11");
            System.out.print(
                    "Aizpildit masivu ar patvaligiem skaitliem (y/n)? ");

            str = br.readLine();

            if(!str.equals("y") && !str.equals("Y")
                    && !str.equals("n") && !str.equals("N")){
                System.out.println("output-input error");
                return;
            }
        }catch (IllegalArgumentException e){
            System.out.println("output-input error");
            return;
        }

        System.out.println("A");
        if(str.equals("y")||str.equals("Y"))
            A=rand(A);

        izv(A);
        System.out.println("results: ");
        rezult(A);

    }
    public static void izv(double [][]c){
        for (double[] i : c) {
            for (double j : i)
                System.out.printf("%.1f\t", j);
            System.out.println();
        }

    }
    public static void rezult(double [][]c){
        int count;
        for(int i=0;i<c.length;i++){
            count=0;
            for(int j=0;j<c[i].length;j++){
                if(c[i][j]==0) count++;}
            if(count<=2)
                System.out.print((i+1)+"\t");
        }
    }
    public static double [][] rand(double [][]c){
        Random r = new Random();
        for (int i=0; i<c.length; i++){
            for (int j=0; j<c[i].length; j++)
                c[i][j] = r.nextInt(3)/2.;
        }
        return c;
    }
}
