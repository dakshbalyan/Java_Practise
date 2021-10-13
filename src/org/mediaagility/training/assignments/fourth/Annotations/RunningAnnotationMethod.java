package org.mediaagility.training.assignments.fourth.Annotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

public class RunningAnnotationMethod {
    public static void main(String[] args) throws IOException {
        PersonalDetails details = new PersonalDetails();
        System.out.println("Enter your details\nfname lname gender dob(DD:MM:YYYY)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] params = br.readLine().split(" ");

        details.setFname(params[0]);
        details.setLname(params[1]);
        details.setGender(params[2]);
        details.setDOB(getDate(params[3]));

        RunningAnnotationMethod runningAnnotaionMethod = new RunningAnnotationMethod();

        try {
            runningAnnotaionMethod.run(details);
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private void run(Object object) throws InvocationTargetException, IllegalAccessException {
        Class<?> className = object.getClass();
        for(Method method : className.getDeclaredMethods()){
            if(method.isAnnotationPresent(CustomMethodAnnotation.class)){
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }

    private static Date getDate(String param) {
        String[] dob = param.split(":");
//        System.out.println(dob.length);
        int year = Integer.parseInt(dob[2]) - 1900;
        int month = Integer.parseInt(dob[1]);
        int day = Integer.parseInt(dob[0]);

        return new Date(year,month,day);
    }
}
