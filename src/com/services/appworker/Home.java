package com.services.appworker;

import java.util.Scanner;

public class Home {

    Scanner sc = new Scanner(System.in);
    User us;
    private String userName,userGender;

    public Home() {
        //Create User
        System.out.println("Please let us know !!");
        us = new User();

        //User Set
        userName = setUserName();
        userGender = setUserGender();
    }

    private void addSpace() {
        for (int i = 0;i<15;i++) {
            System.out.println();
        }
    }


    private String setUserGender() {
        addSpace();
        System.out.println("Please Select Your Gender");
        System.out.println("1. Male");
        System.out.println("2. Female");
        System.out.print("Choose : ");
        int choose = sc.nextInt();


            if (choose == 1) {
                us.setGenderM();
            }else if (choose == 2) {
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
