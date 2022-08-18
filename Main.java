public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener notListener = System.out::println;

        Worker worker = new Worker(listener, notListener);
        worker.start();
    }
}