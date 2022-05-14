package com.pmart5a;

import com.pmart5a.myclasses.MyThread;

public class Main {

    public static final int DELAY_TIME_MAIN = 15000;

    public static void main(String[] args) {
        System.out.println("Создаю и запускаю потоки...");
        MyThread[] myThreads = {new MyThread(), new MyThread(), new MyThread(), new MyThread()};
        String[] nameThreads = {"поток 1", "поток 2", "поток 3", "поток 4"};
        for (int i = 0; i < myThreads.length; i++) {
            myThreads[i].setName(nameThreads[i]);
        }
        for (MyThread myThread : myThreads) {
            myThread.start();
        }
        try {
            Thread.sleep(DELAY_TIME_MAIN);
        } catch (InterruptedException err) {
            err.printStackTrace();
        }
        System.out.println("Завершаю все потоки:");
        Thread.currentThread().getThreadGroup().interrupt();
    }
}