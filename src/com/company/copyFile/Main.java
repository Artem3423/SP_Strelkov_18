package com.company.copyFile;



import java.io.IOException;
import static com.company.copyFile.Constants.*;

public class Main extends Thread{
    public static void main(String[] args) throws IOException, InterruptedException {

        long parallelCopyTimeBefore = System.currentTimeMillis();

        NewThread copyThread1 = new NewThread(inputWay1,outputWay1);
        NewThread copyThread2 = new NewThread(inputWay2,outputWay2);

        copyThread1.thread.start();
        copyThread2.thread.start();

        copyThread1.thread.join();
        copyThread2.thread.join();

        long parallelCopyTimeAfter = System.currentTimeMillis();

        consoleTime(parallelCopyTimeBefore, parallelCopyTimeAfter);

        long sequenceCopyTimeBefore = System.currentTimeMillis();

        CopyFile cf = new CopyFile(inputWay1, outputWay1);
        cf.copy();
        CopyFile cf2 = new CopyFile(inputWay2, outputWay2);
        cf2.copy();

        long sequenceCopyTimeAfter = System.currentTimeMillis();

        consoleTime(sequenceCopyTimeBefore, sequenceCopyTimeAfter);

      /*  NewThreadWithNIO copyNIOThread1 = new NewThreadWithNIO(inputWay1, outputWay1);
        NewThreadWithNIO copyNIOThread2 = new NewThreadWithNIO(inputWay1, outputWay1);

        copyNIOThread1.thread.start();
        copyNIOThread2.thread.start();

        copyNIOThread1.thread.join();
        copyNIOThread2.thread.join(); */


        long sequenceCopyTimeBeforeWithNIO = System.currentTimeMillis();

        CopyFile c = new CopyFile(inputWay1, outputWay1);
        c.copy();
        CopyFile c2 = new CopyFile(inputWay2, outputWay2);
        c2.copy();

        long sequenceCopyTimeAfterWithNIO = System.currentTimeMillis();

        consoleTime(sequenceCopyTimeBeforeWithNIO, sequenceCopyTimeAfterWithNIO);
    }

    public static void consoleTime(long before, long after){
        System.out.println("copy "+(after - before)+" ms");

    }
}

