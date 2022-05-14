package com.pmart5a.myclasses;

public class MyThread extends Thread {

    public final int DELAY_TIME = 2500;

    @Override
    public void run() {
        try {
            while(!isInterrupted()) {
                Thread.sleep(DELAY_TIME);
                System.out.printf("Я %s. Всем привет!\n", getName());
            }
        } catch (InterruptedException err) {
            Thread.currentThread().interrupt();
        } finally{
            System.out.printf("%s завершен\n", getName());
        }
    }
}