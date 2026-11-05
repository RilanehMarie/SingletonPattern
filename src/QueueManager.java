/** Centralized queue (Singleton): one queue number shared by all help desks. */
public class QueueManager {
    private static QueueManager instance;
    private int lastIssued = 0;   // last ticket given to a visitor
    private int nowServing = 0;   // number currently being served

    private QueueManager() { }

    public static synchronized QueueManager getInstance() {
        if (instance == null) {
            instance = new QueueManager();
        }
        return instance;
    }

    public synchronized int issueTicket() {
        lastIssued++;
        return lastIssued;
    }

    /** Returns the next number to serve, or -1 if nobody is waiting. */
    public synchronized int callNext() {
        if (nowServing >= lastIssued) {
            return -1;
        }
        nowServing++;
        return nowServing;
    }

    /** After a reset, the next ticket issued will be newNumber. */
    public synchronized void reset(int newNumber) {
        if (newNumber < 1) {
            throw new IllegalArgumentException("Reset number must be 1 or higher.");
        }
        lastIssued = newNumber - 1;
        nowServing = newNumber - 1;
    }

    public synchronized int getNowServing() {
        return nowServing;
    }
}
