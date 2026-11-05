/** One of the three help desks. */
public class HelpDeskStation {
    private final String name;
    private final QueueManager queue = QueueManager.getInstance();

    public HelpDeskStation(String name) {
        this.name = name;
    }

    public void callNext() {
        int number = queue.callNext();
        if (number == -1) {
            System.out.println("[" + name + "] No one is waiting.");
        } else {
            System.out.println("[" + name + "] Now serving #" + number);
        }
    }

    public void resetQueue(int newNumber) {
        queue.reset(newNumber);
        System.out.println("[" + name + "] Queue reset. Next ticket: #" + newNumber);
    }
}
