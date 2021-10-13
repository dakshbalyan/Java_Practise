package org.personal.passingBehaviour;

public class IntroducionGreeting implements Greeting{
    private String name;
    private int age;
    private String gender;

    public IntroducionGreeting(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void perform() {
        System.out.println("My name is "+name+" and I am a "+age+" year old "+gender);
    }
}
