package com.example.helloworld;

public class Reverse {
public String reversestr(String name) {
    String Rev="";

    if (name != null && name.trim().length() > 0)
    {
        int length=name.length();
        for (int i= length-1;i>=0;i--) {
            Rev=Rev+name.charAt(i);
        }

    }
    return Rev;
}
public static void reverse() {
    System.out.println("Reverse");

}
public static void main(String[] args)
{
    Reverse t1=new Reverse();
    System.out.println(t1.reversestr("TEST"));
    System.out.println(t1.reversestr("MANASA"));
    System.out.println(t1.reversestr(""));
    System.out.println(t1.reversestr("ACCIVA"));
}

}

