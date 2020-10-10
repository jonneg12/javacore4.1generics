package com.company.task3;

public class Main {

    public static void main(String a[]) {
        FruitBox<String, Banana> bananaBox = new FruitBox<>("banana", new Banana());
        bananaBox.getObj().printClass();

        FruitBox<String, Apple> appleBox = new FruitBox<>("apple", new Apple());
        appleBox.getObj().printClass();

        FruitBox<String, Fruit> fruitBox = new FruitBox<>("fruit", new Fruit());
        fruitBox.getObj().printClass();

        VegetableBox<String, Cabbage> cabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageBox.getObj().printClass();

        VegetableBox<String, Vegetable> vegetableBox = new VegetableBox<>("vegetable", new Vegetable());
        vegetableBox.getObj().printClass();

/*
            Box<String, Cabbage> cabbageBox = new Box<>("cabbage", new Cabbage());  // параметр класса Box расширяет только класс Fruit и его наследников.  Поэтому сделаем два класс FruitBox и VegetableBox с соответвтующими параметрами
            cabbageBox.getObj().printClass();
*/
    }
}


