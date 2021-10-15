package com.company.copyFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

    private String way1;
    private String way2;

    CopyFile(String way1, String way2){
        this.way1 = way1;
        this.way2 = way2;
    }

    public  void copy() throws IOException {
        FileWriter fw = new FileWriter(way2);
        try (BufferedReader buffer = new BufferedReader((new FileReader(way1)))) {
            String string;

            while ((string = buffer.readLine()) != null) {
                fw.write(string+"/n");
            }
        } catch (IOException e) {
            throw new IOException();

        }
    }
}