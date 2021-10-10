package com.company.multiply_JUnit;

public class FileNumbs {
    int numb1;
    int numb2;
    FileNumbs(int numb1, int numb2){
        this.numb1 = numb1;
        this.numb2 = numb2;
    }
    public int Multiplication(){
        float numb3 = (float)Math.pow(10, (Math.log10(numb1) + Math.log10(numb2)));
        System.out.println("Произвдение равно " + (int)numb3);
        return (int)numb3;
    }
}
