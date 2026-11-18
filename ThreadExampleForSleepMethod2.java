public class ThreadExampleForSleepMethod2 implements Runnable {

    public void run() {
        try{
            for (int i=0;i<3;i++){
                System.out.println("ThreadExampleForSleepMethod2- Thread Name- "+ Thread.currentThread().getName() + ", Iteration-" +i);
                Thread.sleep(3000);
            }
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        ThreadExampleForSleepMethod2 threadExampleForSleepMethod1 = new ThreadExampleForSleepMethod2();
        Thread thread1 = new Thread(threadExampleForSleepMethod1);
        Thread thread2 = new Thread(threadExampleForSleepMethod1);

        thread1.start();
        thread2.start();
    }
}
