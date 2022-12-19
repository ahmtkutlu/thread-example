public class ExampleWithThread extends Thread{

    private int threadNumber;

    public ExampleWithThread(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i+ " from thread "+ threadNumber);
            if(threadNumber == 3){
                throw new RuntimeException();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }

}