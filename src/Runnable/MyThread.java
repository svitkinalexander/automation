package Runnable;
import java.lang.Runnable;

public class MyThread implements Runnable {

    MyThread(){
    }

    public void run() {
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.printf("Поток %s закончил работу... \n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главный поток начал работу... ");
        new Thread(new MyThread(),"MyThread1").start();
        System.out.println("Главный поток завершил работу... \n");
    }
}
