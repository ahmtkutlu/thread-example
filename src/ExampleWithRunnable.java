public class ExampleWithRunnable implements Runnable{

    private String process;
    public ExampleWithRunnable(String process){
        this.process = process;
    }

    @Override
    public void run(){
        for(int i=3;i>0;i--){
            System.out.println(process + " will finish after "+ i+" seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(process+ " finished.");
    }

}