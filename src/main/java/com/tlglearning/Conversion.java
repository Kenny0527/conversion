package com.tlglearning;

public class Conversion {
    private final static String DIGIT_CHAR_BASE = "0";
    /**
     *
     * @param binary
     * @return
     * @throws IllegalArgumentException if {@code binary  }
     */
    public static int convertToDecimal(String binary) throws IllegalArgumentException{
        int value = 0;

        for (char c : binary.toCharArray()) {
            value = (value << 1) + c - '0';
        }
        return value;
    }

    /**
     *
     * @param representation
     * @param radix
     * @return
     * @throws IllegalArgumentException if {@code radix <2 || radix >10}.
     */
    public static int parse(String representation, int radix) throws IllegalArgumentException{
        // TODO: check for a + or a -, if - then negative, then do something
        if(radix < 2 || radix > 10){
            String err = "The radix should be between 2 - 10";
            throw new IllegalArgumentException(err);
        }
        char[] digits = representation.toCharArray();
        char firstDigit = digits[0];
        boolean hasSign = firstDigit == '+' || firstDigit == '-';
        int sign = (hasSign && firstDigit == '-') ? -1 : 1;
        int value = 0;
        for (int i = (hasSign ? 1 : 0); i < digits.length; i++){
            char digitChar = digits[i];
            int digitValue = digitChar - DIGIT_CHAR_BASE;
        }
        // radix needs to be between 2-10
        return 0;
    }
}
