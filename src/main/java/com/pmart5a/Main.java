package com.pmart5a;

import com.pmart5a.myclasses.MyThread;

public class Main {

    public static final int NUMBER_OF_TREADS = 4;
    public static final int DELAY_TIME_MAIN = 15000;

    public static void main(String[] args) {
        System.out.println("Создаю и запускаю потоки...");
        for (int i = 0; i < NUMBER_OF_TREADS; i++) {
            new MyThread("поток " + (i + 1)).start();
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