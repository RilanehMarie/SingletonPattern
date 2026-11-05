public class Main {
    public static void main(String[] args) {
        TicketKiosk kiosk = new TicketKiosk();
        OnlineMonitor monitor = new OnlineMonitor();
        HelpDeskStation desk1 = new HelpDeskStation("Desk 1");
        HelpDeskStation desk2 = new HelpDeskStation("Desk 2");
        HelpDeskStation desk3 = new HelpDeskStation("Desk 3");

        for (int i = 0; i < 5; i++) kiosk.getQueueNumber();
        monitor.showCurrentNumber();

        desk1.callNext();
        desk2.callNext();
        desk3.callNext();
        monitor.showCurrentNumber();

        desk2.resetQueue(100);
        kiosk.getQueueNumber();
        desk3.callNext();
        monitor.showCurrentNumber();
        desk1.callNext();
    }
}
