package ru.geekbrains.Catch_the_drop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

import static java.util.Collections.swap;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Integer> a1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            a1.add(i);
        }
        System.out.println("до свапа " + a1);
        Collections.swap(a1, 1, 5);
        System.out.println("после  " + a1);



        ArrayToList();



        TestTask3();
    }


    public static void ArrayToList() {
       Integer arr1[] = {1,2,3,4,5,6,7};
       ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(arr1));
        System.out.println("второе задание: " + arrayList);



    }


    public static void TestTask3(){
        Box<Orange> orange = new Box<>();
        Box<Apple> apple = new Box<>();
        orange.AddToBox(new Orange(),10);
        apple.AddToBox(new Apple(),8);
        System.out.println("Вес первой коробки: " + orange.getWeight());
        System.out.println("Вес второй коробки: " + apple.getWeight());
    }

}