package com.company;

import java.util.ArrayList;

public class Education {
    private ArrayList<String> list;

    public Education(){};

    public Education(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Education{" +
                "list=" + list +
                '}';
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}
