package Laboratory_5;

public class lab5_1 {
    public static void main(String[] args) {
        Person person1 = new Person("King Lion",20);
        Person person2 = new Person("Smoll Boy",10);
        System.out.println(person1.fullName + " is age - " + person1.age);
        System.out.println(person2.fullName + " is age - " + person2.age);
        person1.say(person2.fullName);
        person1.move(person2.age);
    }
}
