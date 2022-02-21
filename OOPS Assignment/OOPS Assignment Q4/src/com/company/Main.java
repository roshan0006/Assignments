package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        person user1 = new person("Roshan");
        System.out.println(user1.getname());

        name point2 = new name("this is abstract") {
            @Override
            public String getname() {
                return null;
            }
        };

        new AbstClassP3ex().display();
        new AbstClassP4ex().display2();
        new AbstClassP6ex().display3();

    }
}
