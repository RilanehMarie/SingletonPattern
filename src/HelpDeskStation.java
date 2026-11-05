public class HelpDeskStation {
    private final String stationName;
    private final QueueManager queue = QueueManager.getInstance();

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
    }

    public void serveNextCustomer() {
        int number = queue.getNextQueueNumber();
        System.out.println(stationName + " is now serving Queue No: " + number);
    }

    public void resetQueue(int newNumber) {
        System.out.println(stationName + " reset the queue to: " + newNumber);
        queue.resetQueueNumber(newNumber);
    }
}