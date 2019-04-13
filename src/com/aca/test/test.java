package com.aca.test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("Enter two numbers.");
        Scanner sc = new Scanner(System.in);
        IntegerWrapper num1 = new IntegerWrapper(sc.nextInt());
        IntegerWrapper num2 = new IntegerWrapper(sc.nextInt());
        System.out.println(String.format("Numbers before swap.\nNumber 1:\t%s\tNumber 2:\t%s", num1.innerInt, num2.innerInt));
        swap(num1, num2);
        System.out.println(String.format("Numbers before swap.\nNumber 1:\t%s\tNumber 2:\t%s", num1.innerInt, num2.innerInt));

    }
    static void swap(IntegerWrapper num1, IntegerWrapper num2){
        int temp = num1.innerInt;
        num1.innerInt = num2.innerInt;
        num2.innerInt = temp;
    }
}

class IntegerWrapper{
    int innerInt;

    IntegerWrapper(int innerInt) {
        this.innerInt = innerInt;
    }

}
