package Laboratory_5;

import java.awt.desktop.ScreenSleepEvent;

public class Person {
    String fullName;
    int age;


    Person (String namePerson, int age)
    {
        this.fullName = namePerson;
        this.age = age;

    }

    static void say(String namePerson)
    {
        System.out.println("Person " + namePerson + " say:-- Hello!!!");

    }

    static void move(int age)
    {
        System.out.println("Person of age is age - " + age + "It's is very young.");
    }
}
