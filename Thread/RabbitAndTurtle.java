package ru.ei.works.animalthread;

public class RabbitAndTurtle {

    public static void main(String[] args) {

        AnimalThread turtle = (new AnimalThread("черепаха", 1));
        AnimalThread rabbit = (new AnimalThread(" кролик ", 4));

        turtle.start();
        rabbit.start();
    }
}
