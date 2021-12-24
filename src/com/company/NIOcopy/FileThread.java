package com.company.NIOcopy;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class FileThread extends Thread {
    String filename;
    Path path;
    FileThread(String filename, Path path){
        this.filename = filename;
        this.path = path;
        this.start();
    }
    @Override
    public void run(){
        long startTime =  System.currentTimeMillis();
        try {
            Files.copy(path, Paths.get(this.filename), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
        long endTime = System.currentTimeMillis();
        long constTime = endTime - startTime;
        System.out.println(constTime + " мс - время потока " + this.filename);
    }
}