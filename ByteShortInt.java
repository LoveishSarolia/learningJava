package com.loveishsarolia;

public class Main {

    public static void main(String[] args) {

        byte myByteValue = 127;

        short myShortValue = 10000;

        int myIntValue = 2147000000;

        long myLongValue = (50000L + (10L * myByteValue + myShortValue + myIntValue));

        short myShortTotal = (short) (1000 + (10 * myByteValue + myShortValue + myIntValue));

        System.out.println("myLongValue =" + myLongValue);

        System.out.println("myShortTotal = " + myShortTotal);

    }
}
