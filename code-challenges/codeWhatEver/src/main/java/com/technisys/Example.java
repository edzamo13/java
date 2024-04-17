package com.technisys;

public class Example {
	
	
	public static int symbolicToOctal(String permString) {
        int blockOne = 0, blockTwo = 0, blockThree = 0;

        char[] chars = permString.toCharArray();
        blockOne = convert(chars[0]) + convert(chars[1]) + convert(chars[2]);
        blockTwo = convert(chars[3]) + convert(chars[4]) + convert(chars[5]);
        blockThree = convert(chars[6]) + convert(chars[7]) + convert(chars[8]);

        return blockOne * 100 + blockTwo * 10 + blockThree;
    }

    public static int convert(char character) {
        char r = 'r';
        char w = 'w';
        char x = 'x';
        if (character == r) {
            return 4;
        }
        if (character == w) {
            return 2;
        }
        if (character == x) {
            return 1;
        }
        return 0;
    }

}
