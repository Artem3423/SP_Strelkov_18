package com.company.thread;

public class AnimalThread extends Thread {

    String PersonName;
    int priorityThread;
    final int DISTANCE = 100;

    public AnimalThread(String PersonName, int priorityThread) {
        this.PersonName = PersonName;
        this.priorityThread = priorityThread;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priorityThread);
        Thread.currentThread().setName(PersonName);

        //устанавливаем скорость персонажа
        int timeToStep = 1000 / (Thread.currentThread().getPriority());


        for (int i = 1; i < DISTANCE; i++) {

            try {
                Thread.sleep(timeToStep);
                System.out.println(getName() + " преодолел " + i + " метров ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == DISTANCE / 2) {

                if (Thread.currentThread().getPriority() == 1) {
                    Thread.currentThread().setPriority(10);
                } else {
                    Thread.currentThread().setPriority(1);
                }
                timeToStep = 1000 / (Thread.currentThread().getPriority());
                System.out.println("magic");

            }
            if (i == DISTANCE - 1) {
                System.out.println(" Finish ");
            }
        }
    }
}
