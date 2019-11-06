package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person bobby = new Person();
        System.out.println(bobby.getSalary());
        Education e = new Education(new ArrayList<String>(Arrays.asList("UMD", "Poolesville", "Jaipuria")));

    }
}
