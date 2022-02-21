package com.company;

public class SingletonInheritanceCheck {
    private static  SingletonInheritanceCheck singletonInheritanceCheck = null;
    private SingletonInheritanceCheck(){} //constructor
    public static SingletonInheritanceCheck getSingleton()
    {
        if(singletonInheritanceCheck==null)
        {
            singletonInheritanceCheck = new SingletonInheritanceCheck();
        }
        return singletonInheritanceCheck;
    }
}
