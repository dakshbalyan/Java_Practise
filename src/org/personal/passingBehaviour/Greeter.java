package org.personal.passingBehaviour;
// https://www.youtube.com/watch?v=nL7H4F_ly_k&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=5
// Passing Behaviour in OOPs - JavaBrains
// Displaying polymorphism and abstraction at its best !!!!!

public class Greeter {
    /*
    The behaviour here is the greeting and the action performed is perform function that can be
    customised according to your need by implementing the interface !!!
     */

    private void greet(Greeting greeting){
//        System.out.println("hello world !");
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting introductionGreeting = new IntroducionGreeting("daksh", 23, "male");
        greeter.greet(helloWorldGreeting);
        greeter.greet(introductionGreeting);
    }
}
