package com.pbd.Address_Book;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class   Record {
    String first_name;
    String last_name;
    String phone_number;
    String address;
}

public class AddressBook {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int size = 5;
        int choice = 0;

        ArrayList<Record> records = new ArrayList<Record>(size);



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
                load_file(records);
            }

            if (choice == 2) {
                save_toFile(records);
            }

            if (choice == 3) {
                add_record(records);
            }

            if (choice == 4) {
                remove_record(records);
            }

            if (choice == 5) {
                edit_record(records);
            }

            if (choice == 6) {
                sort_records(records);
            }

            if (choice == 7) {
                search_record(records);
            }

            if (choice == 8) {
                display_record(records);
            }
        }
        System.out.println("Thanks for using the Address Book program, Goodbye!");
        keyboard.close();
    }


    public static void add_record(ArrayList<Record> records) {
        Record record = new Record();
        System.out.println("Add Record");

        System.out.print("\tFirst Name: ");
        record.first_name = keyboard.next();

        System.out.print("\tLast Name: ");
        record.last_name = keyboard.next();

        System.out.print("\tPhone Number: ");
        record.phone_number = keyboard.next();
        keyboard.nextLine();

        System.out.print("\tAddress: ");
        record.address = keyboard.nextLine();

        System.out.println();


        records.add(record);
    }

    public static void load_file(ArrayList<Record> records) {
        System.out.print("What is the path to the file you would like to load: ");
        String path = keyboard.next();
        System.out.println();

        Scanner sc = read_file(path);
        while (sc.hasNextLine()) {
            Record record = new Record();
            record.first_name = sc.next();
            record.last_name = sc.next();
            record.phone_number = sc.next();
            record.address = sc.next();
            records.add(record);

            if (sc.nextLine().isEmpty()) {
                continue;
            }

        }
        sc.close();
    }

    public static void remove_record(ArrayList<Record> records) {
        display_record(records);
        System.out.print("Which record to remove: ");
        int record_toRemove = keyboard.nextInt();
        records.remove(record_toRemove);
        System.out.println("Record has been removed successfully");
        display_record(records);
    }

    public static void edit_record(ArrayList<Record> records) {
        int options = 0;
        int entry = 0;

        display_record(records);
        System.out.println();

        System.out.print("What entry would you like to edit: ");
        entry = keyboard.nextInt();

        System.out.println("What would you like to edit on entry " + entry);

        System.out.println("Options");
        System.out.println("1)\tFirst Name");
        System.out.println("2)\tLast Name");
        System.out.println("3)\tPhone Number");
        System.out.println("4)\tAddress");

        System.out.print("Option: ");
        options = keyboard.nextInt();
        String change;
        switch (options) {
            case 1:
                System.out.println("What would you like to change the first name to?");
                System.out.print("Change: ");
                change = keyboard.next();

                records.get(entry).first_name = change;
                System.out.println("First name changed successfully");
                break;
            case 2:
                System.out.println("What would you like to change the last name to?");
                System.out.print("Change: ");
                change = keyboard.next();

                records.get(entry).last_name = change;
                System.out.println("Last name changed successfully");
                break;
            case 3:
                System.out.println("What would you like to change the phone number to?");
                System.out.print("Change: ");
                change = keyboard.next();

                records.get(entry).phone_number = change;
                System.out.println("Phone number changed successfully");
                break;
            case 4:
                System.out.println("What would you like to change the address to?");
                System.out.print("Change: ");
                change = keyboard.next();

                records.get(entry).address = change;
                System.out.println("Address changed successfully");
                break;
        }
    }

    public static void sort_records(ArrayList<Record> records) {
        System.out.println("How would you like to sort the records?");
        System.out.println("1)\tFirst Name");
        System.out.println("2)\tLast Name");
        System.out.println("3)\tPhone Number");
        System.out.println("4)\tAddress");

        int sortBy = keyboard.nextInt();

        switch (sortBy) {
            case 1:
                Sort.sort_firstName(records);
            case 2:
                Sort.sort_lastName(records);
            case 3:
                Sort.sort_phoneNumber(records);
            case 4:
                Sort.sort_Address(records);
        }
    }

    private static class Sort {
        private static void sort_firstName(ArrayList<Record> records) {
            boolean swapped = true;
            int j = 0;

            while (swapped) {
                swapped = false;
                j++;

                for (int i = 0; i < records.size() - j ; i++) {
                    String temp = String.valueOf(records.get(i).first_name.charAt(0));
                    String swap = String.valueOf(records.get(i+1).first_name.charAt(0));

                    if (temp.compareTo(swap) >= 0) {
                        swap(records,i);
                        swapped = true;
                    }
                }
            }
        }
        private static void sort_lastName(ArrayList<Record> records) {
            boolean swapped = true;
            int j = 0;

            while (swapped) {
                swapped = false;
                j++;

                for (int i = 0; i < records.size() - j ; i++) {
                    String temp = String.valueOf(records.get(i).last_name.charAt(0));
                    String swap = String.valueOf(records.get(i+1).last_name.charAt(0));

                    if (temp.compareTo(swap) >= 0) {
                        swap(records,i);
                        swapped = true;
                    }
                }
            }
        }
        private static void sort_phoneNumber(ArrayList<Record> records) {
            boolean swapped = true;
            int j = 0;

            while (swapped) {
                swapped = false;
                j++;

                for (int i = 0; i < records.size() - j ; i++) {
                    String[] one = records.get(i).phone_number.split("-");
                    String[] two = records.get(i+1).phone_number.split("-");

                    int temp = Integer.parseInt(one[0]);
                    int swap = Integer.parseInt(two[0]);

                    System.out.println(temp);
                    System.out.println(swap);

                    if (temp < swap) {
                        swap(records,i);
                        swapped = true;
                    }
                }
            }
        }
        private static void sort_Address(ArrayList<Record> records) {
            boolean swapped = true;
            int j = 0;

            while (swapped) {
                swapped = false;
                j++;

                for (int i = 0; i < records.size() - j ; i++) {
                    String temp = String.valueOf(records.get(i).address.charAt(0));
                    String swap = String.valueOf(records.get(i+1).address.charAt(0));

                    if (temp.compareTo(swap) >= 0) {
                        swap(records,i);
                        swapped = true;
                    }
                }
            }
        }
        private static void swap(ArrayList<Record> records, int i ) {
            Record temp = records.get(i);
            Record swap = records.get(i+1);

            records.remove(i);
            records.add(i, temp);

            records.remove(i+1);
            records.add(i, swap);
        }
    }

    private static void search_record(ArrayList<Record> records) {
        System.out.print("Which entry would you like to search for? ");
        int search = keyboard.nextInt();

        System.out.println("Record " + search);
        System.out.println("\tFirst Name: " + records.get(search).first_name);
        System.out.println("\tLast Name: " + records.get(search).last_name);
        System.out.println("\tPhone Number: " + records.get(search).phone_number);
        System.out.println("\tAddress: " + records.get(search).address);
        System.out.println();
    }

    private static Scanner read_file(String filename) {
        File file = new File(filename);
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sc;
    }

    private static void save_toFile(ArrayList<Record> records) {
        System.out.print("What shall we call the name of this file: ");
        String filename = keyboard.next();

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f = new File(filename);
        System.out.println("File location: " + f.getAbsolutePath());
        System.out.println("Saving file....");

        int size = records.size();
        for (int i = 0; i < records.size(); i++) {
            writer.println(records.get(i).first_name);
            writer.println(records.get(i).last_name);
            writer.println(records.get(i).phone_number);
            writer.println(records.get(i).address);

            size--;
            if (size != 0) {
                writer.println("");
            }
        }

        System.out.println("File saved!\n");
        writer.close();
    }

    private static void test_record(ArrayList<Record> records) {
        Record record = new Record();
        record.first_name = "Myron";
        record.last_name = "Walters";
        record.phone_number = "216-882-1762";
        record.address = "59024 Buddha Dr, 5th Dimension 00000";
        records.add(record);
    }

    private static void display_record(ArrayList<Record> records){
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