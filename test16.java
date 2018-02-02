import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test16 {
    public static void main(String[] args) throws IOException {

        int num;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Ievadiet skaitli:");
            num = Integer.parseInt(br.readLine());

            if(num<0) throw new IllegalArgumentException();

        }catch (IllegalArgumentException e){
            System.out.println("Input error");
            return;
        }
        switch (num){
            case(0):
                System.out.print("1");
                break;
            default:
                for(int s=0, a=1,i=1;i<=num;i++) {
                    a = a*(-2);
                    s += a;
                    if(i==num)
                        System.out.print(s);
                }
        }
    }
}
