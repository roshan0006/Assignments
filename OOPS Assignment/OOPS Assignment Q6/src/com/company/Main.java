package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DatabasePersistence i = new DatabasePersistence();
        FilePersistence j = new FilePersistence();
        System.out.println(i.persist());
        System.out.println(j.persist());

    }
}
