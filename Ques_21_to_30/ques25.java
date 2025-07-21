package Ques_21_to_30;

//Create two threads that count numbers simultaneously.

class CounterThread extends Thread {
    private int start;
    private int end;

    CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ques25 {
    public static void main(String[] args) {
        CounterThread t1 = new CounterThread(1, 5);
        CounterThread t2 = new CounterThread(6, 10);

        t1.start();
        t2.start();
    }
}
