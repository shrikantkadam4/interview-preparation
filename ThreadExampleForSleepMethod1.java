public class ThreadExampleForSleepMethod1 implements Runnable {

    public void run() {
        try{
            for (int i=0;i<3;i++){
                System.out.println("ThreadExampleForSleepMethod1- "+ i);
                Thread.sleep(3000);
            }
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        ThreadExampleForSleepMethod1 threadExampleForSleepMethod1 = new ThreadExampleForSleepMethod1();
        Thread thread1 = new Thread(threadExampleForSleepMethod1);
        thread1.start();
    }
}
