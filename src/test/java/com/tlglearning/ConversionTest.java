package com.tlglearning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {

    @Test
    void convertToDecimal() {
        System.out.println(Integer.parseInt("1001101", 2));
        assertEquals(173, Conversion.convertToDecimal("10101101"));
    }

    void parse(){

    }
}