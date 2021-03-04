package com.services.appworker;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);

    public Menu(){
        int select;
        do {
            System.out.println("What do you want?");
            System.out.println("1. Create User");
            System.out.println("2. View User");
            System.out.println("3. Update User");
            System.out.println("4. Exit");
            System.out.print("Choose : ");
            select = sc.nextInt();
        }while (select < 1 || select > 4);

        switch (select) {
            case 1:
                addSpace();
                Home hw = new Home();
                break;

            case 2:
                //View user
                break;

            case 3:
                //Manage User
                break;

            case 4:
                System.out.println("Thank you so much");
                System.out.println("Have a great day");
                break;
        }

    }

    private void addSpace() {
        for (int i = 0;i<15;i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Menu();
    }
}
