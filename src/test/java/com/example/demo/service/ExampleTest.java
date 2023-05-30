package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    Example example;
    @Test
    public void addTest(){
        example = new Example();
        int sum = example.add(10,5);
        Assertions.assertEquals(15,sum);
    }

}