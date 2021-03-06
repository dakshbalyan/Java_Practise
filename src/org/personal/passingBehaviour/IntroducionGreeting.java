package org.personal.passingBehaviour;

public class IntroducionGreeting implements Greeting {
    private final String name;
    private final int age;
    private final String gender;

    public IntroducionGreeting(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void perform() {
        System.out.println("My name is " + name + " and I am a " + age + " year old " + gender);
    }
}
