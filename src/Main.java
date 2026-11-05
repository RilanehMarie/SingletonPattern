public class Main {
    public static void main(String[] args) {
        System.out.println("=== Centralized Queuing System ===");
        System.out.println("by: Rilaneh Marie Acabal");
        System.out.println();

        new OnlineMonitor();

        HelpDeskStation desk1 = new HelpDeskStation("Help Desk 1");
        HelpDeskStation desk2 = new HelpDeskStation("Help Desk 2");
        HelpDeskStation desk3 = new HelpDeskStation("Help Desk 3");

        desk1.serveNextCustomer();
        System.out.println();

        desk2.serveNextCustomer();
        System.out.println();

        desk3.serveNextCustomer();
        System.out.println();

        desk2.resetQueue(50);
        System.out.println();

        desk3.serveNextCustomer();
        System.out.println();

        desk1.serveNextCustomer();
    }
}