package com.kenmoryak.javacore.chapter03;
/*
Продемонстрировать применение условного оператора if .
Присвоить исходному файлу имя " IfSample.java"
*/

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("теперь x равен y");

        x = x * 2;
        if (x > y) System.out.println("теперь x больше y");

        // этот оператор ничего не будет выводить
        if (x == y) System.out.println("это не видно");
    }
}
