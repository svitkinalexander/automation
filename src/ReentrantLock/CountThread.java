package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class CountThread implements Runnable {
    CommonResource res;
    ReentrantLock locker;

    CountThread(CommonResource res, ReentrantLock lock){
        this.res=res;
        locker=lock;
    }

    @Override
    public void run() {
        try {
            locker.lock();
            res.x=1;
            for (int i = 1; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        } finally {
            locker.unlock();
        }
    }
}
