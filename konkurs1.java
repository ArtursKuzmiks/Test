import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class konkurs1 {

    public static void main(String[] args) throws IOException {

        String[] surname;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("Autor: Arturs Kuzmiks 12.gr. 111REB779");
            System.out.print("Surnames count:");

            int count = Integer.parseInt(br.readLine());

            if(count<=0) throw new IllegalArgumentException();
            else surname = new String[count];

            System.out.println("Input surnames:");

            for(int i = 0; i< surname.length; i++)
                surname[i]=br.readLine();

            if(haveNumber(surname)) throw new InputMismatchException();

        }catch (IllegalArgumentException e){
            System.out.println("input-error");
            return;

        }catch (InputMismatchException e){
            System.out.println("Input-error,surname cant have number");
            return;
        }

        surnameSort(surname);
        formatSurname(surname);
        surnameOut(surname);

        }

    private static void surnameOut(String[] a){
        System.out.println("Sorted surname:");
        for (String str : a) {
            System.out.println(str);
        }
    }

    private static void surnameSort(String[] a){
        int j;
        int n;
        for(int i=1;i<a.length;i++){
            String temp = a[i];
            n = index(temp.charAt(0));
            j=i-1;
            while(j>=0 && index(a[j].charAt(0))>n){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }

    private static int index(char sym){
        char [] abc = {'A', 'Ā','B','C','Č', 'D',
                'E', 'Ē', 'F', 'G', 'Ģ', 'H', 'I', 'Ī', 'J', 'K',
                'Ķ', 'L', 'Ļ', 'M', 'N', 'Ņ', 'O', 'P', 'R', 'S',
                'Š', 'T', 'U', 'Ū', 'V', 'Z', 'Ž'};

        int index=0;
        for(int i=0;i<abc.length;i++){
            if(String.valueOf(sym).equalsIgnoreCase(String.valueOf(abc[i]))){
                index = i;
                break;
            }
        }
        return index;
    }

    private static boolean haveNumber(String [] a){
        for (String str : a) {
            for (int j = 0; j < str.length(); j++) {
                try {
                    Integer.parseInt(String.valueOf(str.charAt(j)));
                    return true;
                } catch (IllegalArgumentException ignored) {
                }
            }
        }
        return false;
    }

    private static void formatSurname(String [] a){
        String temp;
        for(int i=0;i<a.length;i++){
            temp = a[i].substring(0,1).toUpperCase()+a[i].substring(1);
            a[i]=temp;
        }
    }

}
