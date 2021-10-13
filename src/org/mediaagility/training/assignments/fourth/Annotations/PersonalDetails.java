package org.mediaagility.training.assignments.fourth.Annotations;

import java.text.DateFormat;
import java.util.Date;
public class PersonalDetails {
    private String fname;
    private String lname;
    private String gender;
    private String DOB;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DateFormat.getDateInstance().format(DOB);
    }

    @CustomMethodAnnotation
    public void printPersonalDetails(){
        System.out.println(getFname()+" "+getLname()+" is a "+getGender()+
                " born on "+getDOB());
    }

    @CustomMethodAnnotation
    public void printSuccessfulMessage(){
        System.out.println("Custom method invoked successfully!");
    }

}
