import java.util.Random;
import java.util.Scanner;

public class test8 {

    // 1) init         - for
    // 2) out          - while
    // 3) manipulation - do while
    // 4) out          - for

    public static void main(String[] args) {
        int ALen = 20;
        int A[] = new int[ALen];
        int K;
        int i;
        int b;

        System.out.println("Aleksandrs Želtiševs RDBD0 171RDB079");
        System.out.print("K=");
        try (Scanner sc = new Scanner(System.in)) {
            K = sc.nextInt();
        } catch (Exception e) {
            System.out.println("input-output error");
            return;
        }
        if (K <= 0) {
            Random r = new Random();
            for (i = 0; i < 10; i++) {
                A[i] = r.nextInt(51);  // 0..50
            }
        } else {
            A[0] = 1;
            for (i = 1; i < ALen; i++) {
                A[i] = A[i - 1] + K;
            }
        }
        System.out.println("A:");
        i = 0;
        while (i < ALen) {
            System.out.printf("%d\t", A[i]);
            if ((i + 1) % 10 == 0) System.out.println();
            i++;
        }

        i = 1;
        int j;
        A[ALen - 1] = 0;
        do {
            //TODO | Izdzēst no masīva A visus elementus, kuru indeksi ir nepāra skaitļi, pārbīdot visus nākošos elementus par vienu
            //TODO | pozīciju uz priekšu. Atbrīvotiem elementiem masīva beigās piešķirt nulles. Papildus masīvu izmantot aizliegts.
            j = i + 1;
            do {
                A[j - 1] = A[j];
                j++;
            } while (j < ALen);
            i += 1;
        } while (i < ALen - 1);

        System.out.println("\nA:");
        for (i = 0; i < ALen; i++) {
            System.out.printf("%d\t", A[i]);
            if ((i + 1) % 10 == 0) System.out.println();
        }

    }
}