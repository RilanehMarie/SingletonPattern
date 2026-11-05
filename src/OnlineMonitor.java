/** Remote display of the current queue number. */
public class OnlineMonitor {
    private final QueueManager queue = QueueManager.getInstance();

    public void showCurrentNumber() {
        System.out.println(">> [Online Monitor] Now serving: #" + queue.getNowServing());
    }
}
