package com.pbd.Address_Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Record {
    String first_name;
    String last_name;
    String phone_number;
    String address;
}

public class AddressBook {
    public static void main(String[] args) {
        int size = 5;
        int choice = 0;

        ArrayList<Record> records = new ArrayList<Record>(size);
        Scanner keyboard = new Scanner(System.in);


        while (choice != 9) {
            System.out.println("1) Load data from file");
            System.out.println("2) Save to file");
            System.out.println("3) Add an entry");
            System.out.println("4) Remove an entry");
            System.out.println("5) Edit an existing entry");
            System.out.println("6) Sort the address book");
            System.out.println("7) Search for specific entry");
            System.out.println("8) Display Address Book");
            System.out.println("9) Quit");

            System.out.println();
            System.out.print("What would you like to do with the database: ");
            choice = keyboard.nextInt();

            if (choice == 1) {
                System.out.print("What is the path to the file you would like to load: ");
                String path = keyboard.next();
                load_file(records, path);
                System.out.println();
            }

            if (choice == 8) {
                display_record(records);
            }
        }
        System.out.println("Thanks for using the Address Book program, Goodbye!");
    }

    public static void load_file(ArrayList<Record> records, String path) {
        Scanner sc = read_file(path);
        while (sc.hasNextLine()) {
            Record record = new Record();
            record.first_name = sc.next();
            record.last_name = sc.next();
            record.phone_number = sc.next();
            record.address = sc.next();
            if (sc.nextLine().isEmpty()) {
                continue;
            }
            records.add(record);
        }
        sc.close();
    }


    public static Scanner read_file(String filename) {
        File file = new File(filename);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sc;
    }

    public static void test_record(ArrayList<Record> records) {
        Record record = new Record();
        record.first_name = "Myron";
        record.last_name = "Walters";
        record.phone_number = "216-882-1762";
        record.address = "59024 Buddha Dr, 5th Dimension 00000";
        records.add(record);
    }

    public static void display_record(ArrayList<Record> records){
        for (int i = 0; i < records.size(); i++) {
            System.out.println("Record " + (i+1));
            System.out.println("\tFirst Name: " + records.get(i).first_name);
            System.out.println("\tLast Name: " + records.get(i).last_name);
            System.out.println("\tPhone Number: " + records.get(i).phone_number);
            System.out.println("\tAddress: " + records.get(i).address);
            System.out.println();
        }
    }
}