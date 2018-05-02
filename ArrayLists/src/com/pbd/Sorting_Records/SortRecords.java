package com.pbd.Sorting_Records;

import java.util.ArrayList;
import java.util.Scanner;

class Car {
    String make;
    String model;
    String license;
    int year;
}
public class SortRecords {
    public static void main(String[] args) {
        int size = 3;
        ArrayList<Car> cars = new ArrayList<Car>(size);
        //tester(cars);

        user_create(cars, size);
        display_array(cars);

        System.out.println("-------------------SORTING-----------------------");

        bubble_sort(cars);
        display_array(cars);
    }
    
    private static void tester(ArrayList<Car> cars) {
        Car one = new Car();
        Car two = new Car();
        Car three = new Car();

        one.make = "Toyota";
        one.model = "Corolla";
        one.license = "210-GetGood";
        one.year = 2011;

        two.make = "Jeep";
        two.model = "Compass";
        two.license = "210-Getting_Good";
        two.year = 2014;

        three.make = "Tesla";
        three.model = "Model_X";
        three.license = "GG-Got_Good";
        three.year = 2025;

        cars.add(three);
        cars.add(one);
        cars.add(two);
    }

    private static void user_create(ArrayList<Car> cars, int size){
        Scanner keyboard = new Scanner(System.in);

        String make;
        String model;
        String license;
        int year;

        for (int i = 0; i < size; i++) {
            Car car = new Car();

            System.out.println("Car " + (i+1));

            System.out.print("\tMake: ");
            car.make = keyboard.next();

            System.out.print("\tModel: ");
            car.model = keyboard.next();

            System.out.print("\tLicense: ");
            car.license = keyboard.next();

            System.out.print("\tYear: ");
            car.year = keyboard.nextInt();

            cars.add(car);
        }
    }

    private static void display_array(ArrayList<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            System.out.println("Car " + i);
            System.out.println("\tMake: " + cars.get(i).make);
            System.out.println("\tModel: " + cars.get(i).model);
            System.out.println("\tLicense: " + cars.get(i).license);
            System.out.println("\tYear: " + cars.get(i).year);

        }
    }

    private static void bubble_sort(ArrayList<Car> cars) {
        boolean swapped = true;
        int j = 0;
        while (swapped) {
            swapped = false;
            j++;

            for (int i = 0; i < cars.size() - j ; i++) {
                int temp = cars.get(i).year;
                int swap = cars.get(i+1).year;

                if (temp > swap ) {
                    swap(cars,i);
                    swapped = true;
                }
            }
        }
    }

    private static void swap(ArrayList<Car> cars, int i ) {
        Car temp = cars.get(i);
        Car swap = cars.get(i+1);

        cars.remove(i);
        cars.add(i, temp);

        cars.remove(i+1);
        cars.add(i, swap);
    }
}
