import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int countThreads = 10;
    public static int[] testArray = new int[1000];



    public static void main(String[] args) throws InterruptedException {

    }


    public static class OurPresident {
        static {
            synchronized (OurPresident.class){
                president = new OurPresident();
            }
        }
        private static OurPresident president;

    }
    public static class SortThread extends Thread {
        @Override
        public void run() {
            sort(testArray);
        }
    }
    public static void initThreads() throws InterruptedException {
        List<Thread> threads = new ArrayList<>(countThreads);
        for (int i = 0; i < countThreads; i++) threads.add(new SortThread());
        for(Thread thread : threads) thread.start();
        for(Thread thread : threads) thread.join();
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length -1; i++){
            for(int j = i+1;j < array.length; j++){
                if(array[i] < array[j]){
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }
    }

}