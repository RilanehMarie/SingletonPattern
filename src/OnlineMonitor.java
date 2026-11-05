public class OnlineMonitor {
    public OnlineMonitor() {
        QueueManager.getInstance().addMonitor(this);
    }

    public void display(int currentNumber) {
        System.out.println("[Online Monitor] Current Queue Number: " + currentNumber);
    }
}