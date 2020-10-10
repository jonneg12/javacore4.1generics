package com.company.task2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Box<String, String> boxSS  = new Box<>("John", "Lennon");
        System.out.println(boxSS);

        Box<Integer, Boolean> boxIB = new Box (256, Boolean.FALSE);
        System.out.println(boxIB);

/*
        List<Box<String, Integer>> boxSIlist = new ArrayList<>();  - ошибка в неправильной параметризации, у нас нет объекта класса Box параметризованного <String, Integer>
*/

        List<Box<String, String>> boxSSList = new ArrayList<>();
        boxSSList.add(boxSS);

        List<Box<Integer, Boolean>> boxIBList = new ArrayList<>();
        boxIBList.add(boxIB);

        System.out.println(boxSSList);

        System.out.println(boxIBList);

    }
}
