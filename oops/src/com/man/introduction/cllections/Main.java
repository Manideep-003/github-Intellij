package com.man.introduction.cllections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l0= new ArrayList<>();
        List<Integer> l1= new LinkedList<>();
        List<Integer> l3=new Vector<>();
        l3.add(10);
        l3.add(12);
        l3.add(11);
        System.out.println(l3);

    }
}
