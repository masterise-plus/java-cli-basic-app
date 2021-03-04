package com.services.appworker;

import java.util.Scanner;

public class Home {

    Scanner sc = new Scanner(System.in);
    User us;
    private int userAge;
    private String userName,userGender;

    public Home() {
        //Create User
        System.out.println("Please let us know !!");
        us = new User();

        //User Set
        userName = setUserName();
        userGender = setUserGender();
        userAge = setUserAge();
    }

    private int setUserAge() {
        int age;
        addSpace();
        do {
            System.out.println("Please Input Your Ages");
            System.out.print("Min. Age is (18) >> ");
            age = sc.nextInt();
        }while (age < 18);

        System.out.println(age);

        return age;
    }

    private void addSpace() {
        for (int i = 0;i<15;i++) {
            System.out.println();
        }
    }


    private String setUserGender() {
        int choose;
        addSpace();

        do {
            System.out.println("Please Select Your Gender");
            System.out.println("1. Male");
            System.out.println("2. Female");
            System.out.print("Choose : ");
            choose = sc.nextInt();
        }while (choose < 1 || choose > 2);

        if (choose == 1) {
            us.setGenderM();
        }else {
            us.setGenderFe();
        }

        System.out.println(us.getGender());


        return us.getGender();

    }

    private String setUserName() {
        System.out.print("What is your name : ");
        userName = sc.nextLine();
        us.setName(userName);
        return us.getName();
    }



}
