package org;

enum Test{
//    private StringBuilder sb ;
//    private Integer i;
//
//    public Test(StringBuilder sb, Integer i) {
//        this.sb = new StringBuilder(sb);
//        this.i = i;
//    }
//
//    public StringBuilder getSb() {
//        return new StringBuilder(sb);
//    }
//
//    public Integer getI() {
//        return i;
//    }
    FOUL, GANDER;


}


public class Practise{

    public static void main(String[] args) {
//        Integer i = 4;
//        StringBuilder osb = new StringBuilder("a");
//        Test test = new Test(osb, i);
//        System.out.println(" Before --> "+ test.getSb()+" "+test.getI());
//        i =5;
//        osb.append("abc");
//
//        System.out.println(" After --> "+ test.getSb()+" "+test.getI());

        Test[] tests = Test.values();

        for(Test test : tests)
            System.out.println(test.toString().equalsIgnoreCase("fOul"));

    }
}
