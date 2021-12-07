public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrintThread pt1 = new PrintThread("Thread 1", 1000);
        pt1.start();
        PrintThread pt2 = new PrintThread("Thread 2", 2000);
        pt2.start();

        System.out.println("All threads started");
        pt1.join();
        System.out.println("Main thread joined with Thread 1");
        pt2.join();
        System.out.println("Main thread joined with Thread 2");
        System.out.println("Main thread done");
    }
}
