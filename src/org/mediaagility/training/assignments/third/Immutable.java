package org.mediaagility.training.assignments.third;
// The following class doesn't have any setter methods to access the variables initialised
class ImmutableClass{
    private final StringBuilder name;
    private final Integer age;
// Sending a new object of name with the same value
    public ImmutableClass(StringBuilder name, Integer number) {
        this.name = new StringBuilder(name);
//        this.name = name;
        this.age = number;
    }
// returns a new object of name with same value as set in the constructor
    public StringBuilder getName() {
//        return name;
                return new StringBuilder(name);
    }

    public Integer getAge() {
        return age;
    }

}

public class Immutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("daksh");

        ImmutableClass obj1 = new ImmutableClass(sb, 23);
        System.out.println(obj1.getName() + " "+ obj1.getAge());

        sb.reverse();

        ImmutableClass obj2 = new ImmutableClass(sb, 45);

        sb.append("ads");
        // Because a new object is sent whenever the get method is called
        // Any changes made in the original sb string doesn't get reflected
        // in obj1 and obj2 parameters

        System.out.println(obj2.getName() + " "+ obj2.getAge());
        System.out.println(obj1.getName() + " "+ obj1.getAge());
    }
}
