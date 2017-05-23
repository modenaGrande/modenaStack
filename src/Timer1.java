import java.util.Timer;

public class Timer1 extends Timer {
    public MyTimerTask action = new MyTimerTask();

    public void start() {
        scheduleAtFixedRate(action, 0, 1000);
    }
}
	