package com.company.multiply_JUnit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileNumbsTest{
    @Test
    void multiplication(){
        //arrange
        int num1 = 7;
        int num2 = 7;
        FileNumbs fnums = new FileNumbs(num1, num2);
        int result = fnums.Multiplication();
        assertEquals(49, result);
    }
}