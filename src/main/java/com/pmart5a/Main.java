package com.pmart5a;

import com.pmart5a.myclasses.MyThread;

public class Main {

    public static void main(String[] args) {
        System.out.println("Создаю и запускаю потоки...");
        MyThread myThreadOne = new MyThread();
        myThreadOne.setName("поток 1");
        MyThread myThreadTwo = new MyThread();
        myThreadTwo.setName("поток 2");
        MyThread myThreadThree = new MyThread();
        myThreadThree.setName("поток 3");
        MyThread myThreadFour = new MyThread();
        myThreadFour.setName("поток 4");
        myThreadOne.start();
        myThreadTwo.start();
        myThreadThree.start();
        myThreadFour.start();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException err) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Завершаю все потоки:");
        myThreadOne.getThreadGroup().interrupt();
    }
}