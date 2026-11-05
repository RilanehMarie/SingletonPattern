import java.util.ArrayList;
import java.util.List;

public class QueueManager {
    private static QueueManager instance;
    private int currentNumber = 0;
    private final List<OnlineMonitor> monitors = new ArrayList<>();

    private QueueManager() { }

    public static synchronized QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

  
    public synchronized int getNextQueueNumber() {
        currentNumber++;
        updateMonitors();
        return currentNumber;
    }


    public synchronized void resetQueueNumber(int newNumber) {
        currentNumber = newNumber;
        updateMonitors();
    }

    public synchronized int getCurrentNumber() {
        return currentNumber;
    }

    public synchronized void addMonitor(OnlineMonitor monitor) {
        monitors.add(monitor);
    }


    private void updateMonitors() {
        for (OnlineMonitor m : monitors) {
            m.display(currentNumber);
        }
    }
}