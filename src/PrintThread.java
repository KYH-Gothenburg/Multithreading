public class PrintThread extends Thread{
    String name;
    int interval;

    PrintThread(String name, int interval) {
        this.name = name;
        this.interval = interval;
    }


    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("I'm " + name);
            try {
                // Blocking
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " done");
    }
}
