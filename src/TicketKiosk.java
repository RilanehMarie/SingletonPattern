/** Where visitors get their queue number. */
public class TicketKiosk {
    private final QueueManager queue = QueueManager.getInstance();

    public int getQueueNumber() {
        int number = queue.issueTicket();
        System.out.println("[Kiosk] Your queue number is #" + number);
        return number;
    }
}
