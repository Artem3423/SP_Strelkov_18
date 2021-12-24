package com.company.NIOcopy;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws InterruptedException, IOException {
        long startTime =  System.currentTimeMillis();
        Path file1 = Paths.get("file1.txt");
        Path file2 = Paths.get("file2.txt");
        Files.copy(file1, Paths.get("consistent1.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.copy(file2, Paths.get("consistent2.txt"), StandardCopyOption.REPLACE_EXISTING);
        long endTime = System.currentTimeMillis();
        long constTime = endTime - startTime;
        System.out.println(constTime + " мс при последовательном считывании");
        FileThread fwriter1 = new FileThread("parallel1.txt", file1);
        FileThread fwriter2 = new FileThread("parallel2.txt", file2);
        fwriter1.join();
        fwriter2.join();
    }
}