package com.kodilla;

import com.kodilla.User.User;
import com.kodilla.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        User simpleUser = new User("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (Calculator.add(1, 2) == 3) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add Error!");
        }

        if (Calculator.subtract(2, 2) == 0) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract Error!");
        }
    }
}