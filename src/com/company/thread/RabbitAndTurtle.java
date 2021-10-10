package com.company.thread;

public class RabbitAndTurtle {

    public static void main(String[] args) {

        AnimalThread turtle = (new AnimalThread("черепаха", 1));
        AnimalThread rabbit = (new AnimalThread(" кролик ", 4));

        turtle.start();
        rabbit.start();


    }
}
