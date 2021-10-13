package org.mediaagility.training.week3;

public class MultiThreading extends Thread{
    private String name;
    private int num;

    public MultiThreading(String name) {
        this.name = name;
    }

    public void run(){

        synchronized (name){
            for (int i = 0; i < 5; i++) {
                System.out.println("In the "+name+" thread's run method " + Thread.currentThread().getName());
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MultiThreading mt = new MultiThreading("First");
//        Thread thread = new Thread(new RunnableExample());
//        synchronized (mt){
//            mt.start();
//        }
        MultiThreading mt1 = new MultiThreading("Second");
//        thread.start();
        mt1.start();
        mt.start();
//        for(int i = 0 ; i < 5; i++)
//            System.out.println("Inside Main method "+mt.getName());
    }
}

class RunnableExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside the Runnable Class!!!");
    }
}