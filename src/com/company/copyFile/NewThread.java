package com.company.copyFile;
import java.io.IOException;

public class NewThread implements Runnable {
    private String way1;
    private String way2;
    Thread thread;
    NewThread(String way1,String way2){
        this.way1 = way1;
        this.way2 = way2;
        thread = new Thread(this,"thread");
    }
    @Override
    public void run() {

        long a = System.currentTimeMillis();
        CopyFile cf = new CopyFile(way1, way2);
        try {
            cf.copy();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long b = System.currentTimeMillis();

        System.out.println(b - a);
    }
}