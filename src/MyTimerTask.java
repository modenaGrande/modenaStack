
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class MyTimerTask extends TimerTask {

    private List<CounterUpdatedListener> listeners = new ArrayList<>();

    private int counter = 0;
    
    public int getCounter() {
		return counter;
	}

    @Override
    public void run() {
        counter++;
        notifyCounterUpdatedListeners(counter);
    }

    public void registerCounterUpdatedListener(CounterUpdatedListener listener) {
        this.listeners.add(listener);
    }

    public void unregisterCounterUpdatedListener(CounterUpdatedListener listener) {
        this.listeners.remove(listener);
    }

    protected void notifyCounterUpdatedListeners(int counter) {
    	  for (CounterUpdatedListener listener : this.listeners) {
    	   listener.onCounterUpdated(counter);
    	  }
    	 }

}
