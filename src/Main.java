public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread th1 = new Thread(new ExampleWithRunnable("First process"));
        Thread th2 = new Thread(new ExampleWithRunnable("Second process"));
        // th1.start();
        // th2.start();

        for(int i = 0; i <= 3 ; i++){
            ExampleWithThread thread = new ExampleWithThread(i);
            thread.start();
            if(thread.isAlive()){
                thread.join();//thread die
            }
        }
    }
}