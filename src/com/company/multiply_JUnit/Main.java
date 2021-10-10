package com.company.multiply_JUnit;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("task3.txt"))){
            String readed = reader.readLine();
            String[] txtNumb = readed.split("\\W");
            FileNumbs somethng = new FileNumbs(Integer.parseInt(txtNumb[0]), Integer.parseInt(txtNumb[1]));
            somethng.Multiplication();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
