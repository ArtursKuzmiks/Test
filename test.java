import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int[] m;
        int i;
        m = new int[10];

        for (i = 0; i < 10; i++) {
            System.out.print("input item#" + i + ":");
            str = br.readLine();
            m[i] = Integer.parseInt(str);
        }

        System.out.print("x=");
        str = br.readLine();
        int x = Integer.parseInt(str);
        int k=0;

        while (x>m[k] && k<9)
            k++;

        for (i = 9; i > k ; i--) {
            m[i]=m[i-1];
        }
        m[k]=x;

        for (i = 0; i < 10; i++) {
            System.out.print(m[i] + "\t");
        }
    }

}
