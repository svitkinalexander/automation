package Thread;

public class MyThread extends Thread {

    MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e){
            System.out.println("Поток прерван");
        }
        System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Главный поток начал работу");
        new MyThread("MyThread").start();
        System.out.println("Главный поток завершил работу");
    }
}
