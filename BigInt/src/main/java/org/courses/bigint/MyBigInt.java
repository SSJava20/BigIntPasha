/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.courses.bigint;

/**
 *
 * @author Jeka
 */
public class MyBigInt {

    private char[] number;

    public MyBigInt(String s) {
        StringBuffer builder=new StringBuffer(s);
        builder.reverse();
        number = builder.toString().toCharArray();
    }

    public void add(MyBigInt b) {
        int cur = 0;
        char[] numberTwo = b.getNumber();
        int minCount = number.length;
        if (numberTwo.length <= number.length) {
            minCount = numberTwo.length;
        }
        for (int i = 0; i < minCount; i++) {
            int fst = ((int) number[i]) - 48;
            int scd = ((int) numberTwo[i]) - 48;
            System.out.println("first=" + fst);
            cur = fst + scd;
            if (cur <= 9) {
                number[i] = (char) (cur + 48);
            }
            if (cur > 9) {
                int temp = cur % 10;
                number[i] = (char) (temp + 48);
                number[i + 1] = (char) (number[i + 1] + 48);
            }
        }
    }

    /**
     * Get the value of number
     *
     * @return the value of number
     */
    public char[] getNumber() {
        return number;
    }

    public void display() {
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
        }
        System.out.println();
    }

    /**
     * Set the value of number
     *
     * @param number new value of number
     */
    public void setNumber(String number) {
        this.number = number.toCharArray();
    }
}
