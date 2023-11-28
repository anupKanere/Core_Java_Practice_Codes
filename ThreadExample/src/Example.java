public class Example {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread priority before setting: " + Thread.currentThread().getPriority());
        });

        // Attempting to set priority above the maximum allowed value
        thread.setPriority(15); // Setting priority above 10

        // Starting the thread
        thread.start();

        // Getting the priority after attempting to set it above 10
        System.out.println("Thread priority after setting: " + thread.getPriority());
    }
}
