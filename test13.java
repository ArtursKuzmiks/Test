import java.util.Timer;
import java.util.TimerTask;

public class test13 {
    static int t=0;
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                t++;
                System.out.println("LOX!!!"+t);
            }
        };
        timer.schedule(task,1000,500);
    }
}
