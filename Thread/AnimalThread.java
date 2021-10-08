package ru.ei.works.animalthread;

public class AnimalThread extends Thread {

    String PersonName;
    int priorityThread;
    final int RANGE = 100;

    public AnimalThread(String PersonName, int priorityThread) {
        this.PersonName = PersonName;
        this.priorityThread = priorityThread;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priorityThread);
        Thread.currentThread().setName(PersonName);

        int timeToStep = 1000 / (Thread.currentThread().getPriority());


        for (int i = 1; i < RANGE; i++) {

            try {
                Thread.sleep(timeToStep);
                System.out.println(getName() + " преодолел " + i + " метров ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == RANGE / 2) {

                if (Thread.currentThread().getPriority() == 1) {
                    Thread.currentThread().setPriority(10);
                } else {
                    Thread.currentThread().setPriority(1);
                }
                timeToStep = 1000 / (Thread.currentThread().getPriority());
                System.out.println(" ");
                System.out.println("Bdbms");

            }
            if (i == RANGE - 1) {
                System.out.println("Finish");
            }
        }
    }
}
